package com.pjdc.thurain.sampleOne.Car_parking_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjdc.thurain.sampleOne.Car_parking_management.model.Carparking;


@Controller
public class StartUpController {

	@GetMapping("/carpark")
	public ModelAndView carpark() {
		Carparking cp = new Carparking(null, 0);
		ModelAndView mav = new ModelAndView();
		mav.addObject( "cp", cp);
		mav.setViewName("indexx");
		return mav;
	}
}
