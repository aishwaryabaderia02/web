package com.psl.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.psl.util.Adhar;
import com.psl.util.BankAccount;
import com.psl.util.BankAccountFullNameComparator;

public class UserInteface {
	
	public static void main(String[] args) {
		List<String> strs;
		
		strs = new ArrayList<String>();
		
		strs.add("New");
		strs.add("Day");
		strs.add("Everyday");
		
		System.out.println(strs.get(2));
		System.out.println(strs.size());
		System.out.println(strs.remove(0));
		
		for(String s : strs)
		{
			System.out.println(s);
		}
		
		Iterator<String> itr = strs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		ListIterator<String> lst_itr = strs.listIterator();
		while(lst_itr.hasPrevious())
		{
			System.out.println(lst_itr.previous());
		}
		
		if(strs.contains("Everyday")){
			
		}
		strs.indexOf("Everyday");
		strs.lastIndexOf("Everyday");
		
		List<BankAccount> accounts;
		
		accounts = new LinkedList<BankAccount>();
		
		accounts.add(new BankAccount("23432" , 345.55));
		accounts.add(new BankAccount("54768" , 3684.54));
		accounts.add(new BankAccount("23432" , 3742.35));
		
		for(BankAccount ac : accounts){
			System.out.println(ac);
		}
			
		if(accounts.contains(new BankAccount("54768", 0)))
		{
			System.out.println("Found");
		}
		
		System.out.println("====================================");
		
		Set<BankAccount> acs;
		
		acs = new HashSet<BankAccount>();
		
		acs.add(new BankAccount("23432" , 345.55));
		acs.add(new BankAccount("5468" , 3684.54));
		acs.add(new BankAccount("54683" , 3684.54));
		acs.add(new BankAccount("23432" , 3742.35)); // duplicate account Number will not be added
		
		System.out.println(acs.size());
		
		for(BankAccount ac : acs)
		{
			System.out.println(ac);
		}
		
		System.out.println("----------------------------------------------");
		SortedSet<BankAccount> sortedBankAccount;
		sortedBankAccount = new TreeSet<BankAccount>();
		
		sortedBankAccount.add(new BankAccount("2342",424.24));
		sortedBankAccount.add(new BankAccount("1234",431.21));
		sortedBankAccount.add(new BankAccount("24564",423.24));
		sortedBankAccount.add(new BankAccount("5324",357732.43));
		sortedBankAccount.add(new BankAccount("532",357732.43));
		
		for(BankAccount ac : sortedBankAccount)
		{
			System.out.println(ac);
		}
		System.out.println("--------------------------");
		sortedBankAccount = new TreeSet<BankAccount>(new BankAccountFullNameComparator());
		
		sortedBankAccount.add(new BankAccount("Bill Gates","2342",424.24));
		sortedBankAccount.add(new BankAccount("Lakshmi Mittal","1234",431.21));
		sortedBankAccount.add(new BankAccount("Jack Ma","24564",423.24));
		sortedBankAccount.add(new BankAccount("Binny Bansal","5324",357732.43));
		sortedBankAccount.add(new BankAccount("Mukesh Ambani","532",357732.43));
		
		for(BankAccount ac : sortedBankAccount)
		{
			System.out.println(ac.getFullName() + "-----" + ac);
		}
		
		System.out.println("--------------------------");
		
		Set<BankAccount> accountObject = new LinkedHashSet<BankAccount>();
		
		accountObject.add(new BankAccount("qqq","123",1234));
		accountObject.add(new BankAccount("ppp","234",124));
		accountObject.add(new BankAccount("rrr","345",134));
		
		for(BankAccount ac : accountObject)
		{
			System.out.println(ac.getFullName() + "-----" + ac);
		}
		
		System.out.println("--------------------------");
		
		Map<String,BankAccount> m;
		m = new HashMap<String, BankAccount>();
		m.put("23432", new BankAccount());
		m.put("234", new BankAccount());
		m.put("545", new BankAccount());
		
		for(Map.Entry<String, BankAccount> ac : m.entrySet())
		{
			System.out.println(ac.getKey());
			System.out.println(ac.getValue());
		}
		
		Map<Adhar,List<BankAccount>> data;
		
		/*
		 public static  Map<Adhar,List<BankAccount>> readFromFile(String filename){
			return null;
		}
		public static void fetchAccountDetailsFromDB(Map<Adhar,List<BankAccount>> data)
		{
			
		}*/
	}
		
		
}
