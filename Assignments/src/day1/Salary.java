package day1;
public class Salary {
	public static void main(String[] args) {
		float salary = 10000f;
		float dearAllow, houseRent, grossSalary, incomeTax, netSalary;
		dearAllow = salary/10f;
		houseRent = 0.07f*salary;
		grossSalary = dearAllow + houseRent + salary;
		incomeTax = 0.08f * grossSalary;
		netSalary = grossSalary - incomeTax;
		
		System.out.println(dearAllow);
		System.out.println(houseRent);
		System.out.println(grossSalary);
		System.out.println(incomeTax);
		System.out.println(netSalary);
		
	}
}
