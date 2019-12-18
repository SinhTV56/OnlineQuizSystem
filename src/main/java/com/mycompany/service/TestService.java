package com.mycompany.service;

import com.mycompany.dao.TestDAO;
import com.mycompany.entity.Test;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements TestServiceIF {

    @Autowired
    TestDAO testDao;

    @Override
    public List<Test> getTests() {
        return (List) testDao.findAll();
    }

    @Override
    public void saveTest(Test theTest) {
        testDao.save(theTest);
    }

    @Override
    public Test getTest(int test_id) {
        return testDao.findById(test_id).get();
    }

    @Override
    public void deleteTest(int test_id) {
        testDao.deleteById(test_id);
    }

}
