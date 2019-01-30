package Nugget9;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class UI {
	private String fName;
	private String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Vector<Object> vo = new Vector<Object>();
		UI ui;
		System.out.println("choice :");
		
		
		
		boolean loop = true;
	    while(loop)
	    	{
	    		choice = sc.nextInt();
	    		switch(choice)
	    		{
	    		case 1:
	    			
	    			int len = args.length;
	    			int n = 0;
	    			while(n < len)
	    			{
	    				ui = new UI();
	    					ui.setfName(args[n]);
	    					ui.setlName(args[n+1]);
	    				
	    				n+=2;
	    				vo.add(ui);
	    			}
	    			
	    			break;
	    		case 2:
	    			for(Object vec : vo)
	    			{
	    				System.out.println(vec.toString());
	    			}
	    			System.out.println(vo.size());
	    			break;
	    		case 3:
	    			loop = false;
	    			break;
	    	
	    }	
	    	}
	}
	@Override
	public String toString() {
		
		return String.format("%s,%s", getfName(),getlName());
	}
}
