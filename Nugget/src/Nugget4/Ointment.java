package Nugget4;

public class Ointment extends Medicine{

	String name;
	
	@Override
	public void displayLabel(Medicine m){
		System.out.println(m.getStorage());
	}	

}
