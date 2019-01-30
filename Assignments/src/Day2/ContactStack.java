package Day2;
import Day2.Contact;
public class ContactStack {
	
	
	public static void push(Contact[] stack , int k , Contact c) throws ValueNotFoundException{
		if(k < 3){
			//System.out.println("try");
			stack[k] = new Contact();
			c.validate(c);
			//System.out.println("try");
			stack[k] = c;
			k++;
		//	System.out.println(stack[k-1].getfName() + "  "+ stack[k-1].getlName());
		}
		else
		{
			throw new ValueNotFoundException("overflow");
		}
		}
	public static void pop(Contact[] stack , int k) throws ValueNotFoundException
	{
		if(k >= 0)
		{
			Contact w = new Contact(); 
			w =	stack[k];
			k--;
			System.out.println(w.getfName() + "  " + w.getlName() + "  " + w.getDob() );
		}
		else
		{
			System.out.println("j");
			throw new ValueNotFoundException("underflow");
		}
	}
	}
