package com.mycompany.service;

import com.mycompany.dao.QuestionDAO;
import com.mycompany.entity.Question;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements QuestionServiceIF{

    @Autowired
    QuestionDAO customerDaoIF; 
    
    @Override
    public List<Question> getQuestions() {
	return (List)customerDaoIF.findAll();
    }

    @Override
    public void saveQuestion(Question theQuestion) {
	customerDaoIF.save(theQuestion);
    }

    @Override
    public Question getQuestion(int theId) {
	return customerDaoIF.findById(theId).get();
    }

    @Override
    public void deleteQuestion(int theId) {
	customerDaoIF.deleteById(theId);
    }
    
}
