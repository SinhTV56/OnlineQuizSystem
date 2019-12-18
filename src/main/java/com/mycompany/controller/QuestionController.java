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
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/list")
    public String listQuestions(Model QModel) {
	List<Question> theQuestions = questionService.getQuestions();
	QModel.addAttribute("questions", theQuestions);
	return "question-list";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model QModel) {
	Question theQuestion = new Question();
	QModel.addAttribute("question", theQuestion);
	return "question-form";
    }

    @PostMapping("/saveQuestion")
    public String saveQuestion(@ModelAttribute("question") Question theQuestion) {
	questionService.saveQuestion(theQuestion);
	return "redirect:/question/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("questionId") int question_id,
	    Model QModel) {
	Question theQuestion = questionService.getQuestion(question_id);
	QModel.addAttribute("question", theQuestion);
	return "question-form";
    }

    @GetMapping("/delete")
    public String deleteQuestion(@RequestParam("questionId") int question_id) {
	questionService.deleteQuestion(question_id);
	return "redirect:/question/list";
    }
}
