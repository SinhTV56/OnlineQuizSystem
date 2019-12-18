package com.mycompany.service;

import com.mycompany.dao.QuestionDAO;
import com.mycompany.entity.Question;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements QuestionServiceIF {

    @Autowired
    QuestionDAO questionDao;

    @Override
    public List<Question> getQuestions() {
        return (List) questionDao.findAll();
    }

    @Override
    public void saveQuestion(Question theQuestion) {
        questionDao.save(theQuestion);
    }

    @Override
    public Question getQuestion(int question_id) {
        return questionDao.findById(question_id).get();
    }

    @Override
    public void deleteQuestion(int question_id) {
        questionDao.deleteById(question_id);
    }

}
