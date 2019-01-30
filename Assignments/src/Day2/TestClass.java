package Day2;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		int a[] ,n;
		String choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();
		switch(choice)
		{
		case "lsearch":
			n = sc.nextInt();
			a = new int[n]; 
			for(int i = 0; i < n; i++)
			{
				a[i] = sc.nextInt(); 
			}
			int k = sc.nextInt();
			Lsearch.lsearch(a, k);
			break;
		case "lsort":
			n = sc.nextInt();
			a = new int[n]; 
			for(int i = 0; i < n; i++)
			{
				a[i] = sc.nextInt(); 
			}
			int[] b = Lsearch.lsort(a);
			for(int i = 0; i < n ; i++)
			{
				System.out.print(b[i] + " ");
			}
			break;
		}
		
		
	}
}
