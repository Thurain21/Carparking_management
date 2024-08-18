package com.pjdc.thurain.sampleOne.Car_parking_management.service.serviceimpl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.pjdc.thurain.sampleOne.Car_parking_management.model.Carparking;
import com.pjdc.thurain.sampleOne.Car_parking_management.service.Carparking_service;

@Service
public class Carpark_ServiceImpl implements Carparking_service{

	private ArrayList<Carparking> cplist = new ArrayList<Carparking>();
	
	@Override
	public ArrayList<Carparking> carpark_method(Carparking cp) {
		cplist.add(cp);
		return cplist;
	}
	
}
