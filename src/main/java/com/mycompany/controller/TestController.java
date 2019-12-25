package com.mycompany.controller;

import com.mycompany.entity.Test;
import com.mycompany.model.TestModel;
import com.mycompany.entity.Test_type;
import com.mycompany.service.TestService;
import com.mycompany.service.Test_typeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private Test_typeService test_typeService;

    @GetMapping("/list")
    public String listTests(Model TModel) {
        List<Test> tests = testService.getTests();
        TModel.addAttribute("tests", tests);
        return "test-list";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model TModel) {
        Test test = new Test();
        TModel.addAttribute("test", test);
        return "test-form";
    }

    @PostMapping("/saveTest")
    public String saveTest(@ModelAttribute("test") Test test) {
        testService.saveTest(test);
        return "redirect:/test/list";
    }

    @GetMapping("/create")
    public String createTest(Model  TModel){
        TestModel model = new TestModel();
        List<Test_type> test_types = test_typeService.getTest_types();
        List<String> temp = new ArrayList<>();
        for (Test_type test_type : test_types){temp.add(test_type.getTest_type_name());}
        model.setList_type(temp);
        TModel.addAttribute("test", model);
        return "test-form";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("testId") int test_id, Model TModel) {
        Test test = testService.getTest(test_id);
        TModel.addAttribute("test", test);
        return "test-form";
    }

    @GetMapping("/delete")
    public String deleteTest(@RequestParam("testId") int test_id) {
        testService.deleteTest(test_id);
        return "redirect:/test/list";
    }
}
