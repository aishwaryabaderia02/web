package Nugget2;

import java.util.Scanner;

public class Combinations {
	public static void main(String[] args) {
		
	String s;
	Scanner sc = new Scanner(System.in);
	s = sc.nextLine();
	combination(s);
	}
	
	public static void combination(String s)
	{
		char[] c = s.toCharArray();
		int l = c.length;
		int k = 0;
		String[] str = new String[((l) * (l-1))/2];
		for(int i = 0 ; i < l ; i ++)
		{
			for(int j = 0; j < l;j++)
			{
				if(str[k] == s)
				{
					
				}
				else
				{
					char temp = c[j];
					c[j] = c[j+2];
					c[j+2] = temp;
					
					str[k] = c.toString(); 
					k++;
					System.out.println(j);
					System.out.println(str[0] + str[1] +str[2]);
					
				
				}
			}
			
			
		}
	}
	
	/*public static swap(char c1, char c2)
	{
		char temp = c1;
		c1 = c2;
		c2 = temp;
	}*/
	
}
