package day1;
import java.util.Scanner;
public class Great {
	public static void main(String[] args) {
		int a,b,c,res;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		res = a > b && a > c ? a : (((b > a) && (b > c)) ? b : c) ;
		System.out.println(res);
	}
	
}
