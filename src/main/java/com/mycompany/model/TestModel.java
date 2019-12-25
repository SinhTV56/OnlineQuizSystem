package com.mycompany.model;

import java.util.List;

public class TestModel {

    private int test_id;
    private String active;
    private String description;
    private String password;
    private int question_number;
    private String test_name;
    private int testtime;
    private String test_type;
    private String test_type_name;
    private List<String> list_type;

    public TestModel(int test_id, String active, String description, String password, int question_number, String test_name, int testtime, String test_type, String test_type_name, List<String> list_type) {
        this.test_id = test_id;
        this.active = active;
        this.description = description;
        this.password = password;
        this.question_number = question_number;
        this.test_name = test_name;
        this.testtime = testtime;
        this.test_type = test_type;
        this.test_type_name = test_type_name;
        this.list_type = list_type;
    }

    public TestModel() {
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQuestion_number() {
        return question_number;
    }

    public void setQuestion_number(int question_number) {
        this.question_number = question_number;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public int getTesttime() {
        return testtime;
    }

    public void setTesttime(int testtime) {
        this.testtime = testtime;
    }

    public String getTest_type() {
        return test_type;
    }

    public void setTest_type(String test_type) {
        this.test_type = test_type;
    }

    public String getTest_type_name() {
        return test_type_name;
    }

    public void setTest_type_name(String test_type_name) {
        this.test_type_name = test_type_name;
    }

    public List<String> getList_type() {
        return list_type;
    }

    public void setList_type(List<String> list_type) {
        this.list_type = list_type;
    }


}

    