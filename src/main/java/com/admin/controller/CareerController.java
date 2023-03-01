package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entities.Career;
import com.admin.service.CareerService;

@RestController
@CrossOrigin("*")
public class CareerController {
			
			@Autowired
			private CareerService careerService;
		
			@PostMapping("/career")
			public Career createCareer(@RequestBody Career career) {
				return this.careerService.createCareer(career);
			}
			
			@GetMapping("/{careerId}")
			public Career getSingleCareer(@PathVariable String careerId) {
				return this.careerService.getCareer(Integer.parseInt(careerId));
			}
			
			@GetMapping("/allcareers")
			public List<Career> getAllCareer(){
				return this.careerService.getAllCareers();
			}
			
			@DeleteMapping("/{careerId}")
		    public void deleteUser(@PathVariable("careerId") Integer careerId){
		        this.careerService.deleteCareer(careerId);
		    }
		    
		    @PutMapping("/updateCareer")
		    public  Career updateCareer(@RequestBody Career career) {
				return this.careerService.updateCareer(career);
		    }
}
