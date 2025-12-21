package com.hms.doclogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.doclogin.repository.MedicineRepository;
import com.hms.entity.Medicine;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v3")
public class MedicineController {
	
	@Autowired
	private MedicineRepository medicineRepository;
	
	@PostMapping("/insert")
	public Medicine createAppointment(@RequestBody Medicine medicine) {
		return medicineRepository.save(medicine) ;
		
	}
	
	@GetMapping("/medicine")
	public List<Medicine> getAllMedicine(){
		
		return medicineRepository.findAll();
		
	}
	

}
