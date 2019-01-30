package com.psl.main;

class X {
}

class Y extends X {
}

class Z extends Y {
}

class GenericClass<T> {
	public void add(T val) {
	}

	public T get() {
		return null;
	}
}

public class Main {
	public static void main(String[] args){
		GenericClass<? extends X> ref;
		
		ref = new GenericClass<X>();		//1
		ref = new GenericClass<Y>();		//2
		//ref = new GenericClass<Z>();		//3
		
		//ref.add(new Y());   // this will not be allowed because Y and Z can't call this Method so X will also not be able to call this method 
							  // due to Type Safety
		//ref.get();          //return type is X
		//ref.add(new Z())    //compiler checks datatype of ref 
		
		GenericClass <? super Y> nref;
		nref = new GenericClass<Y>();   	//1A
		nref = new GenericClass<X>();   	//2A
		nref = new GenericClass<Object>();  //3A
		
		nref.add(new Y());
		nref.add(new Z());
		
		GenericClass c = new GenericClass();        //rawType
		
		//nref.get(); 
	}	
		public static <T> boolean linearSearch(T val, T data[])
		{
			return false;
		}
	
}
