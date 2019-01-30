package Nugget2;

import java.util.Scanner;

public class PCheck {
	public static void main(String[] args) {
	
		String[] s  = new String[6];
		s = Product.initProductNames();
		String[] str = new String[3];
		for(int j = 0 , k = 0; j < 6 ; j+=2, k++)
		{
			str[k] = s[j];
		}
		Scanner sc = new Scanner(System.in);
		String kword = sc.nextLine();
		Boolean b = Product.isPresent(str, kword);
	}
	
}
