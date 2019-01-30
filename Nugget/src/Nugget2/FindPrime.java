package Nugget2;
import java.util.Scanner;

public class FindPrime {
	
	public static void main(String[] args) {
	
	int l, h, j = 0;
	Scanner sc = new Scanner(System.in);
	l = sc.nextInt();
	h = sc.nextInt();
	int[] p = new int[h-l+1]; 
	for(int i = 0 ;i < h-l + 1; i++)
	{
		p[i] = sc.nextInt();
	}
	int[] q = new int[h-l+1];
		q = Prime(p , l , h);
		for(int i = 0; q[i] != 0 ;i++)
		{
			System.out.println(q[i]);
		}
	}
	public static int[] Prime(int[] p,int l,int h)
	{
		int j = 0 , k = 0;
		int r[] = new int[h - l + 1];
		while(true)
		{
			if(isPrime(p[j]))
			{
				r[k] = p[j];
				k++;
			}
			j++;
			
			if(l - h + 1 == 0)
			{
				break;
			}
			l++;
		}
		return r;
	}
	public static boolean isPrime(int digit)
	{
		int flag = 0;
		for(int i = 2; i < Math.sqrt(digit); i++)
		{
			if(digit % i == 0)
			{
				flag = 1; 
				break;
			}
		}
		if (flag == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
