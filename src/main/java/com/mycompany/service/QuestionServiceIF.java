package com.mycompany.service;

import com.mycompany.entity.Question;
import java.util.List;

public interface QuestionServiceIF {
    public List <Question> getQuestions();
    public void saveQuestion(Question theQuestion);
    public Question getQuestion(int theId);
    public void deleteQuestion(int theId);
}
