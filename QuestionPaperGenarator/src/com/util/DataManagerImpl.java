package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Criteria;
import com.bean.Question;

// Override and implement all the methods of DataManager Interface here
public class DataManagerImpl implements DataManager {

	@Override
	public List<Question> populateData() {
		List<Question> list = new ArrayList<Question>();
		DatabaseConnectionManager dbConnect = new DatabaseConnectionManager();
		Connection connection;
		try {
			connection = dbConnect.getConnection();
			PreparedStatement pstatement;
			pstatement = connection
					.prepareStatement("Select * from questionbank");

			ResultSet resultSet = pstatement.executeQuery();
			while (resultSet.next()) {
				Question ques = new Question();
				ques.setSrno(resultSet.getInt(1));
				ques.setQuestion(resultSet.getString(2));
				ques.setOption1(resultSet.getString(3));
				ques.setOption2(resultSet.getString(4));
				ques.setOption3(resultSet.getString(5));
				ques.setOption4(resultSet.getString(6));
				ques.setCorrectAns(resultSet.getString(7));
				ques.setType(Category.valueOf(resultSet.getString(8)));
				ques.setComplexity(Complexity.valueOf(resultSet.getString(9)));
				list.add(ques);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Question> getQuestionByCategory(Category category,
			List<Question> questionsList) {
		List<Question> list = new ArrayList();
		for (Question ques : questionsList) {
			if (ques.getCategory() == category) {
				list.add(ques);
			}
		}
		
		return list;
	}

	@Override
	public List<Question> getQuestionByComplexity(Complexity complexity,
			List<Question> questionsList) {

		List<Question> list = new ArrayList();
		for (Question ques : questionsList) {
			if (ques.getComplexity() == complexity) {
				list.add(ques);
			}
		}
		return list;
	}

	@Override
	public Set<Question> generateQuestionPaper(List<Question> list,
			List<Criteria> template) {

		Set<Question> questionSet = new HashSet<Question>();
		for (Criteria criteria : template) {
			int noOfques = criteria.getNoOfQuestion();
		//	System.out.println(noOfques);
			while (noOfques > 0) {
				int random = (int) (Math.random() * 26) + 1;
				
				Question ques = list.get(random);
				{
					Complexity a = ques.getComplexity();
					Complexity b = criteria.getComplexity();
					Category c = ques.getCategory();
					Category d = criteria.getCategory();
					if ((c == d) && (a == b)  && !(questionSet.contains(ques))) {
						questionSet.add(ques);
						noOfques--;
					}

				}

			}
			
		}
		int i = 1;
		
		return questionSet;
	}

	@Override
	public void sortByCategory(List<Question> questionList) {
		CategorySortComparator cs = new CategorySortComparator();
		Collections.sort(questionList,cs);
		
		int i = 1;
		for (Question question : questionList) {	
			
			System.out.println(i+"."+question.getQuestion() + " " +question.getCategory() + question.getSrno());
			i++;
		}
	
	}
	

	@Override
	public void sortByComplexity(List<Question> questionList) {
		ComplexitySortComparator cs = new ComplexitySortComparator();
		Collections.sort(questionList,cs);	
	
	}
}

class CategorySortComparator implements Comparator<Question> {

	@Override
	public int compare(Question o1, Question o2) {
		return o1.getCategory().compareTo(o2.getCategory());

	}

}

class ComplexitySortComparator implements Comparator<Question> {

	@Override
	public int compare(Question o1, Question o2) {
		return o1.getComplexity().compareTo(o2.getComplexity());

	}

}
