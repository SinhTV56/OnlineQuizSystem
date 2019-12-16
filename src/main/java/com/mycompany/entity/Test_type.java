package com.mycompany.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Test_type {

    @Id
    @GeneratedValue
    private int test_type_id;
    private String test_type_name;
    
    @OneToMany(mappedBy = "test_type", fetch = FetchType.LAZY)
    private List<Test> tests;
    public Test_type() {
    }

    public Test_type(int test_type_id, String test_type_name) {
        this.test_type_id = test_type_id;
        this.test_type_name = test_type_name;
    }

    public int getTest_type_id() {
        return test_type_id;
    }

    public void setTest_type_id(int test_type_id) {
        this.test_type_id = test_type_id;
    }

    public String getTest_type_name() {
        return test_type_name;
    }

    public void setTest_type_name(String test_type_name) {
        this.test_type_name = test_type_name;
    }

}
