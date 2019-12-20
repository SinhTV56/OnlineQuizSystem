package com.mycompany.service;

import com.mycompany.dao.Test_typeDAO;
import com.mycompany.entity.Test_type;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test_typeService implements Test_typeServiceIF {

    @Autowired
    Test_typeDAO test_typeDao;

    @Override
    public List<Test_type> getTest_types() {
        return (List) test_typeDao.findAll();
    }

    @Override
    public void saveTest_type(Test_type theTest_type) {
        test_typeDao.save(theTest_type);
    }

    @Override
    public Test_type getTest_type(int test_type_id) {
        return test_typeDao.findById(test_type_id).get();
    }

    @Override
    public void deleteTest_type(int test_type_id) {
        test_typeDao.deleteById(test_type_id);
    }

}
