package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadAndWrite {
	public static void main(String[] args) {
		
		try (FileInputStream fi = new FileInputStream(new File("H:\\Users\\aishwarya_baderia\\Persistent\\Assignments\\src\\file.txt"));
		FileOutputStream fo = new FileOutputStream(new File("file1.txt"))){
		
			int byteRead;
			byte[] data= new byte[1024];
			while((byteRead = fi.read()) != -1){
				fo.write(data, 0, byteRead);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException ex){
			
		}
		
	}
}
