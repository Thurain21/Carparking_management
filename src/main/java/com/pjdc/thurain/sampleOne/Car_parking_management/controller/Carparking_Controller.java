package com.pjdc.thurain.sampleOne.Car_parking_management.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.pjdc.thurain.sampleOne.Car_parking_management.model.Carparking;
import com.pjdc.thurain.sampleOne.Car_parking_management.service.serviceimpl.Carpark_ServiceImpl;

@Controller
public class Carparking_Controller {

	@Autowired
	private Carpark_ServiceImpl csi;
	
	@GetMapping("/dataprocess")
	public ModelAndView dataprocess (@ModelAttribute Carparking cp) {
		ArrayList<Carparking> cplist = csi.carpark_method(cp);
		ModelAndView obj = new ModelAndView();
		obj.addObject("cplist", cplist);
		obj.setViewName("indexx");
		return obj;
		
	}
}
