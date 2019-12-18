package com.mycompany.controller;

import com.mycompany.entity.Test;
import com.mycompany.service.TestService;
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

    @GetMapping("/list")
    public String listTests(Model TModel) {
        List<Test> theTests = testService.getTests();
        TModel.addAttribute("tests", theTests);
        return "test-list";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model TModel) {
        Test theTest = new Test();
        TModel.addAttribute("test", theTest);
        return "test-form";
    }

    @PostMapping("/saveTest")
    public String saveTest(@ModelAttribute("test") Test theTest) {
        testService.saveTest(theTest);
        return "redirect:/test/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("testId") int test_id,
            Model TModel) {
        Test theTest = testService.getTest(test_id);
        TModel.addAttribute("test", theTest);
        return "test-form";
    }

    @GetMapping("/delete")
    public String deleteTest(@RequestParam("testId") int test_id) {
        testService.deleteTest(test_id);
        return "redirect:/test/list";
    }
}
