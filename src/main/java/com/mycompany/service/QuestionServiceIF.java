/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entity.Question;
import java.util.List;

/**
 *
 * @author XV
 */
public interface QuestionServiceIF {
    public List <Question> getQuestions();
    public void saveQuestion(Question theQuestion);
    public Question getQuestion(int theId);
    public void deleteQuestion(int theId);
}
