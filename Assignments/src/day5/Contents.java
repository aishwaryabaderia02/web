package day5;

import java.io.File;

public class Contents {
	public static void main(String[] args) {
		File dir = new File("H:\\Users\\aishwarya_baderia\\abcd");
		folderRecursion(dir);
	}
	
	public static void folderRecursion(File dir)
	{
		System.out.println(dir.getName());
		if(dir.isDirectory())
		{
			for(File f : dir.listFiles()){
				folderRecursion(f);
			}
		}
	}
}
	

