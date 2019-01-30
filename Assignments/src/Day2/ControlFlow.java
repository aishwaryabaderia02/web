package Day2;
public class ControlFlow {
	public static boolean isLeap(int year)
	{
		if(((year % 4 == 0 && year % 100 == 0) &&( year % 400 != 0)) || year % 4 != 0) 
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static boolean isDateValid(int d, int m, int y)
	{
		int flag = 0;
		boolean isValid = true;
		if(isLeap(y))
		{
			flag = 1;
		}
		
		//date check
		if((m ==1 || m == 3 || m == 5 || m == 7 ||m == 8 || m == 10 ||m == 12))
		{
			if (d >=1 && d <=31)
			{
				isValid = true;
			}
		}
		else if(m == 2 && flag == 0)
		{
			if(d == 28)
			{
				isValid = true;
			}
		}
		else if(m == 2 && flag == 1)
		{
			if(d == 29)
			{
				isValid = true;
			}
		}
		else if(m ==4 || m ==6 || m == 9 || m == 11)
		{
			if (d >=1 && d <=30)
			{
				isValid = true;
			}
		}
		else
		{
			isValid = false;
		}
		if(isValid == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(int digit)
	{
		if (digit % 2 == 0)
		{
			return false; 
		}
		else
		{
			return true;
		}
	}
	public static int power(int base, int power)
	{
		int res = 1;
		for(int i = 0; i < power; i ++)
		{
			res = res * base;
		}
		System.out.println(res);
		return res;
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
	public static int factorial(int digit)
	{
		int fact = 1;
		int p = digit;
		for (int i = 0; i < digit; i++)
		{
			fact = p * fact;
			p--;
		}
		return fact;		
		}
		
}
