package day5;

import java.util.Scanner;

public class Fabonacci {
	public static void main(String[] args) {
		double n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(Function(n));
	}

	public static int Function(double n){
		
		//int res = (int)Math.pow(((Math.pow(((1 + Math.sqrt(5))/2),5) - Math.pow(((1 - Math.sqrt(5))/2),5))/Math.sqrt(5));
		double five =Math.sqrt(5);
		double sec =(double)(1 - five)/2;
		double one = (double)(1 +five)/2;
		
		//System.out.println(one +","+sec);
		//	System.out.println(Math.pow(one, n));
		
		int result = (int)((Math.pow(one, n) - Math.pow (sec, n))/five);
		return result;
		
	}
}
