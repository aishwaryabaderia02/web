package com.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.bean.Employee;
import com.bean.Payslip;

public class Client {

	public static void main(String[] args) {
		Map<Employee,Set<Payslip>> map = new HashMap<Employee, Set<Payslip>>() ;
		populateEmployeeDetails(map);
		populatePayslipDetails(map);
		
	}
	
	public static void populateEmployeeDetails(Map<Employee, Set<Payslip>> employeeDetails) {
		
		Set<Employee> empset = new HashSet<Employee>();
		Scanner scan = null;
		try {
			scan = new Scanner(new File("Employee"));
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		Employee emp = new Employee();
		while(scan.hasNext())
		{
			String[] employ = scan.nextLine().split(",");
			emp.setEmployeeCode(employ[0]);
			emp.setName(employ[1]);
			emp.setDesignation(employ[2]);
			
			empset.add(emp);
			
		}
		
		employeeDetails.put(emp,null);
	}
	

	public static void populatePayslipDetails(Map<Employee, Set<Payslip>> employeeDetails) {
		Set<Payslip> set = new HashSet<Payslip>();
		Set<Payslip> subset = new HashSet<Payslip>();
		
		try {
			Scanner scanfile = new Scanner(new File("paySlip"));
			Payslip payslip = new Payslip();
			while(scanfile.hasNext())
			{
				String[] ps = scanfile.nextLine().split(",");
				payslip.setPayslipId(Integer.parseInt(ps[0]));
				payslip.setMonth(ps[1]);
				payslip.setEmployeeCode(ps[2]);
				payslip.setBasic(Double.parseDouble(ps[3]));
				payslip.setHra(Double.parseDouble(ps[4]));
				payslip.setCommutationAllowance(Double.parseDouble(ps[5]));
				payslip.setLta(Double.parseDouble(ps[6]));
				payslip.setPerformancePay(Double.parseDouble(ps[7]));
				payslip.setUpkeepPay(Double.parseDouble(ps[8]));
				
				if(employeeDetails.containsKey(payslip.getEmployeeCode())){
					
					if(set.contains(payslip.getEmployeeCode()))
					{
							
						subset.add(payslip);
						for(Map.Entry<Employee, Set<Payslip>> m : employeeDetails.entrySet())
						{
							if(m.getKey().equals(payslip.getEmployeeCode()))
							{
								employeeDetails.put(m.getKey(), subset);
							}
						}
						
					}
					set.add(payslip);
				}
	
				for(Map.Entry<Employee, Set<Payslip>> m : employeeDetails.entrySet())
				{
					System.out.println(m.getKey());
					System.out.println(m.getValue());
				}
				
						
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	
	public static Map<Employee, Payslip> filterEmployeeRecordsByMonth(Map<Employee, Set<Payslip>> employeeDetails, String month) {
		Map<Employee, Payslip> filteredRecords = new HashMap<Employee, Payslip>();
		return filteredRecords;
	}
	
	public static Map<Employee, Set<Payslip>> sortEmployeeRecordsByName(Map<Employee, Set<Payslip>> employeeDetails) {
		Map<Employee, Set<Payslip>> sortedRecords = new TreeMap<Employee, Set<Payslip>>();
		/* write your code here */
		return sortedRecords;
	}
}
