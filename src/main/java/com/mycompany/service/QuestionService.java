/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.QuestionDAO;
import com.mycompany.entity.Question;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XV
 */
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
