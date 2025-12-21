package com.hms.doclogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.doclogin.repository.AppointmentRepository;
import com.hms.entity.Appointment;

@RestController
@RequestMapping("/api/v2")
public class AppointmentController {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@PostMapping("/insert")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentRepository.save(appointment) ;
		
	}
	
	public List<Appointment> getAllAppointment(){
		return appointmentRepository.findAll();
		
	}

}
