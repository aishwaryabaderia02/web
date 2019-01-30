package com.psl.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.psl.beans.Address;
import com.psl.beans.Student;
import com.psl.exceptions.InsufficientDataException;

//Override all the methods of the DataManager Interface
public class StudentDataManager implements DataManager {

	@Override
	public List<Student> populateData(String fileName) {
		Scanner scan = null;
		try {
			scan = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Student> ls = new ArrayList<Student>();
		while(scan.hasNext())
		{
			String[] details = scan.nextLine().split(",");
			for(int i = 0; i < 6 ; i++)
			{
				if(details[i].equals("") && (i == 0 || i == 2))
				{
					details[i] = "0";
				}
				if(details[i].equals("") && (i != 0 || i != 2))
				{
					details[i] = null;
				}
				
			}
			Address add = new Address(details[3],details[4],details[5]);
			Student stu = new Student(Integer.parseInt(details[0]),details[1],Integer.parseInt(details[2]),add);
			
			ls.add(stu);
			
		}
		return ls;
	}

	@Override
	public void validateData(List<Student> studentList)
			throws InsufficientDataException {
		
		Iterator<Student> itr = studentList.iterator();
		while(itr.hasNext()){
	//	Student student = itr.next();
			
			if(itr.next().getAge() == 0)
			{
				itr.remove();
			}
			//
			else
				Address a = itr.next().getAddress();
				if(a.next().getCity() == null || a.getStreetName() == null || a.getZipCode() == null)
			{
				studentList.remove(student);
			}
				
		}
		for(Student student: studentList)
		{
			System.out.println(student.getRollno() + " " + student.getStudentName() + " " + student.getAge());
		}
		
	}

	@Override
	public void sortData(List<Student> studentList) {
		// TODO Auto-generated method stub
		
	}

	
}
