package com.mycompany.dao;

import com.mycompany.entity.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionDAO extends CrudRepository<Question, Integer>{
    
}
