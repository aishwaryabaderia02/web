package Day3;

import java.util.Scanner;

public class ReverseSeq {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		String[] parts = s.split(" ");
		int n = parts.length;
		
		for(int k = 0; k < n ; k++)
		{ 	char ch;
		  	//String str;
		  	char[] string = null;
			string = parts[k].toCharArray();
			int p = parts[k].length();
			
			for(int i = 0 , j = p-1; i < p/2 ; i++ , j-- )
			{
				//str = parts[i];
				ch = string[i];
				string[i] = string[j];
				string[j] = ch;
			}
			System.out.print(string);
			System.out.print(" ");
			//String res = string.toString();
			//System.out.println(res);
		}
		
	}
}
