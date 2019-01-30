package com.client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.bean.PFAccount;

public class Client {
	public static void main(String[] args) {
		try {
			List<PFAccount> pf = readProvidentFundRecords(new File("pf-records.db"));
			for(PFAccount account : pf)
			{
				calculateMaturityAmount(account);
			}
			for(PFAccount account : pf)
			{
				closeAccount(account);
			}
			writeProvidentFundRecords(pf,new File("pf-finalrecords.ser"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	public static List<PFAccount> readProvidentFundRecords(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<PFAccount> records = new ArrayList<PFAccount>();
		FileInputStream fileStream = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fileStream);
		PFAccount pf;
		for(int i = 0 ; i < 5 ;i++)
		{
			pf = (PFAccount) oi.readObject();
			records.add(pf);
		}
		oi.close();
		return records;
	}
	
	public static void calculateMaturityAmount(PFAccount account) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String date = sdf.format(account.getDateOfOpening());
		int openingYear = Integer.parseInt(sdf.format(account.getDateOfOpening()));
		
		account.setDateOfClosing(Date.valueOf("2019-1-29"));
		int closingYear = Integer.parseInt(sdf.format(account.getDateOfClosing()));
		
		double SI = (account.getBalance() * 9 * (closingYear - openingYear))/100;
		account.setMaturityAmount(account.getBalance() + SI);
		System.out.println(account.getMaturityAmount());
		
	}
	
	public static void closeAccount(PFAccount account) {
		account.setActive(false);
	}
	
	public static void writeProvidentFundRecords(List<PFAccount> records,  File file) throws FileNotFoundException, IOException {
		FileOutputStream fileStream = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		for(PFAccount pf : records)
		{
			os.writeObject(pf);
		}
		os.close();
	}
}
