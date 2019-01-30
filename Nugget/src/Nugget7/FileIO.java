package Nugget7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		File file = new File("C:\\Users\\Aishwarya\\git\\Persistent\\Nugget\\fileIO");
		Scanner scan = new Scanner(file);
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		while(scan.hasNext())
		{
			bw.write(scan.next());
		}
		System.out.println(file.length());
		bw.close();
	}
}
