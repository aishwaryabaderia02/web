package com.psl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Criteria;
import com.bean.Question;
import com.util.DataManagerImpl;

public class Client {

	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		List<Question> questionList = new ArrayList<Question>();
		List<Question> geography = new ArrayList<Question>();
		List<Question> history = new ArrayList<Question>();
		List<Question> gk = new ArrayList<Question>();
		List<Question> science = new ArrayList<Question>();
		Set<Question> set;
		
		
		DataManagerImpl dmi = new DataManagerImpl();
		questionList = dmi.populateData();
		
		geography = dmi.getQuestionByCategory(Category.Geography,questionList);
		history = dmi.getQuestionByCategory(Category.History,questionList);
		gk = dmi.getQuestionByCategory(Category.GK,questionList);
		science = dmi.getQuestionByCategory(Category.Science,questionList);
		
		List<Criteria> template = new ArrayList<Criteria>();
		template.add(new Criteria(Category.GK,Complexity.Simple,1));
		template.add(new Criteria(Category.History,Complexity.Medium,2));
		template.add(new Criteria(Category.Science,Complexity.Complex,1));
		template.add(new Criteria(Category.Geography,Complexity.Simple,1));
		
		set = dmi.generateQuestionPaper(questionList,template);
		
		dmi.sortByCategory(questionList);
		dmi.sortByComplexity(questionList);
	}
	
}
