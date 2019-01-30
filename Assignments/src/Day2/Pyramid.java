package Day2;
import java.util.Scanner;
public class Pyramid {
	private static Scanner b;

	public static void main(String[] args) {
		int n;
		b = new Scanner(System.in);
		n = b.nextInt();
		for(int i = 0; i < (n/2) +1; i++)
		{
			for(int k = n/2+1; k > i ;k--)
			{
				System.out.print(" ");
			}

			for(int j = 0; j < i*2 +1; j++)
			{
				System.out.print(i * 2 + 1);
			}
			System.out.println();
		}
	}
}
