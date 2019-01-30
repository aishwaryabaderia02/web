package com.psl.client;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Properties p = new Properties();
		try{
		/*	p.load(new FileReader(new File("configuration.properties")));
			System.out.println(p.getProperty("OS"));
			System.out.println(p.getProperty("RAM"));
			System.out.println(p.getProperty("Storage"));
			
			FileReader fr = new FileReader(new File("xyz"));
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine();
		*/	
			File file = new File("H:\\Users\\aishwarya_baderia\\Persistent\\IO\\Movies.txt");

			Scanner scanFile = new Scanner(file);
			System.out.println(file.exists());
			while(scanFile.hasNext()){
				String line = scanFile.next();
				Scanner token = new Scanner(line);
				token.useDelimiter(",");
				while(token.hasNext()){
					String value = token.next();
					System.out.println(value);
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
