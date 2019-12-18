package com.mycompany.service;

import com.mycompany.entity.Test;
import java.util.List;

public interface TestServiceIF {

    public List<Test> getTests();

    public void saveTest(Test theTest);

    public Test getTest(int theId);

    public void deleteTest(int theId);
}
