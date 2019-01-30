package Day3;
import java.util.Scanner;
public class Dictionary {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		String[] parts = s.split(" ");
		alphasort(parts);
	}
	public static void alphasort(String[] parts)
	{
		int n = parts.length;
		int i;
		for(i = 0; i < n-1 ; i++ )
		{
			for(int j = 0; j < n-i-1; j++)
			{
				//int l1 = parts[j].length();
				//int l2 = parts[j+1].length();
				//int max = l1 > l2 ? l1 : l2;	
				
				if(parts[j+1].compareTo(parts[j]) < 0)
				{
					String temp = parts[j+1];
					parts[j+1] = parts[j];
					parts[j] = temp;
				}
				
			} 
			for(i = 0; i < n; i++)
			{
				System.out.println(parts[i]);
			}
		}

	}
}
