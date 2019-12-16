package com.mycompany.controller;

import com.mycompany.entity.Question;
import com.mycompany.service.QuestionService;
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
@RequestMapping("/customer")
public class QuestionController {

    @Autowired
    private QuestionService customerService;

    @GetMapping("/list")
    public String listQuestions(Model theModel) {
	List< Question> theQuestions = customerService.getQuestions();
	theModel.addAttribute("customers", theQuestions);
	return "list-customer";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
	Question theQuestion = new Question();
	theModel.addAttribute("customer", theQuestion);
	return "customer-form";
    }

    @PostMapping("/saveQuestion")
    public String saveQuestion(@ModelAttribute("customer") Question theQuestion) {
	customerService.saveQuestion(theQuestion);
	return "redirect:/customer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
	    Model theModel) {
	Question theQuestion = customerService.getQuestion(theId);
	theModel.addAttribute("customer", theQuestion);
	return "question-form";
    }

    @GetMapping("/delete")
    public String deleteQuestion(@RequestParam("customerId") int theId) {
	customerService.deleteQuestion(theId);
	return "redirect:/customer/list";
    }
}
