package Day2;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		String choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();
		switch(choice){
			case "leap":
				int y = sc.nextInt();
				if(ControlFlow.isLeap(y))
				{
					System.out.println("Leap");
				}
				break;
			case "date":
				int d = sc.nextInt();
				int m = sc.nextInt();
				int  year= sc.nextInt();
				if(ControlFlow.isDateValid(d, m, year))
				{
					System.out.println("Valid");
				}
				else
				{
					System.out.println("Not Valid");
				}
				break;
			case "prime":
				int value = sc.nextInt();
				if(ControlFlow.isPrime(value))
				{
					System.out.println("Prime");
				}
				else
				{
					System.out.println("Not Prime");
				}
				
				break;
			case "odd":
				int v = sc.nextInt();
				if(ControlFlow.isOdd(v))
				{
					System.out.println("Odd");
				}
				else
				{
					System.out.println("Even");
				}
				
				break;
			case "power":
				int base = sc.nextInt();
				int exp = sc.nextInt();
				int res = ControlFlow.power(base, exp);
				System.out.println(res);
				break;
			case "factorial":
				int fact;
				fact = sc.nextInt();
				int factorial = ControlFlow.factorial(fact);
				System.out.println(factorial);
				break;
		}
	}
}
