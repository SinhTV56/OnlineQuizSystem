package com.mycompany.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Test {

    @Id
    @GeneratedValue
    private int test_id;
    private String active;
    private String description;
    private String password;
    private int question_number;
    private String test_name;
    private int testtime;
    private int test_type_id;
    
    @ManyToMany(mappedBy = "test_question")
    private List<Question> test_question;
    
    @ManyToOne
    private Test_type test_type;
    public Test() {
    }

    public Test(int test_id, String active, String description, String password, int question_number, String test_name, int testtime, int test_type_id) {
        this.test_id = test_id;
        this.active = active;
        this.description = description;
        this.password = password;
        this.question_number = question_number;
        this.test_name = test_name;
        this.testtime = testtime;
        this.test_type_id = test_type_id;
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

    public int getTest_type_id() {
        return test_type_id;
    }

    public void setTest_type_id(int test_type_id) {
        this.test_type_id = test_type_id;
    }

}
