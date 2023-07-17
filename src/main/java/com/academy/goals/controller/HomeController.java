package com.academy.goals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.academy.goals.model.Feedback;
import com.academy.goals.service.FeedbackServiceImpl;

@Controller
public class HomeController {

	@RequestMapping("/feedbacks")
	public ModelAndView showMessage() {
		FeedbackServiceImpl feedbackService = new FeedbackServiceImpl();
		List<Feedback> feedbacks = feedbackService.getFeedbacks();
		ModelAndView mv = new ModelAndView("feedbacks");
		mv.addObject("feedbacks", feedbacks);
		return mv;
	}
}