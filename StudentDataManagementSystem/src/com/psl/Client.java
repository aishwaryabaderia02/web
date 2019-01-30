package com.psl;

import java.util.ArrayList;
import java.util.List;

import com.psl.beans.Student;
import com.psl.exceptions.InsufficientDataException;
import com.psl.util.StudentDataManager;

public class Client {
	
	public static void main(String[] args) {
		
		//Create instance of StudentDataManager Class here and  test your functionality from here
		List<Student> stu ;
		StudentDataManager sdm = new StudentDataManager();
		stu = sdm.populateData("StudentDetails.txt");
		
		try {
			sdm.validateData(stu);
		} catch (InsufficientDataException e) {
			e.printStackTrace();
		}
	}
}
