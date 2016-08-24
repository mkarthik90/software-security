package edu.asu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view")
public class ViewTestController {

	public ModelAndView getView() {
		ModelAndView model = new ModelAndView();
		model.setViewName("view");
		model.addObject("testValue", "Hello World");
		return model;
	}
}
