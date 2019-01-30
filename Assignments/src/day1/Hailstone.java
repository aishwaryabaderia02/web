package day1;
import java.util.Scanner;
public class Hailstone {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(n);
		while(n != 1)
		{
			if(n % 2 == 0)
			{
				n = n/2;
				System.out.println(n);
			}
			else
			{
				n = n * 3 + 1;
				System.out.println(n);
			}
		}
	}
}
