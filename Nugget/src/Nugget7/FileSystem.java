package Nugget7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSystem {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Aishwarya\\git\\Persistent\\Nugget\\fileInput");
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Aishwarya\\git\\Persistent\\Nugget\\" + args[0])));
			if(new File("C:\\Users\\Aishwarya\\git\\Persistent\\Nugget\\" + args[0]).exists())
			{
				System.out.println("Do you want to overwrite");
				 
			}
			Scanner sc = new Scanner(System.in);
			char c = sc.nextLine().charAt(0);
			if(c == 'y' || c == 'Y')
			{
				String line;
				while((line = br.readLine()) != null)
				{
					bw.write(line);
					bw.write("\n");
				}
			}
			else {}
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
