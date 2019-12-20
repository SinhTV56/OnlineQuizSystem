package com.mycompany.service;


import com.mycompany.entity.Test_type;
import java.util.List;

public interface Test_typeServiceIF {

    public List<Test_type> getTest_types();

    public void saveTest_type(Test_type theTest_type);

    public Test_type getTest_type(int theId);

    public void deleteTest_type(int theId);
}
