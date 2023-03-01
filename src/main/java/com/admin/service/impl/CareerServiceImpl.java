package com.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entities.Career;
import com.admin.repo.CareerRepo;
import com.admin.service.CareerService;

@Service
public class CareerServiceImpl implements CareerService {
	
	@Autowired
	private CareerRepo careerRepo;

	@Override
	public Career createCareer(Career career) {
		Career local=this.careerRepo.save(career);
		return local;
	}

	@Override
	public Career getCareer(Integer careerid) {
		return this.careerRepo.findById(careerid).get();
	}

	@Override
	public List<Career> getAllCareers() {
		return this.careerRepo.findAll();
	}

	@Override
	public void deleteCareer(Integer careerId) {
		this.careerRepo.deleteById(careerId);
	}

	@Override
	public Career updateCareer(Career career) {
		this.careerRepo.save(career);
		return career;
	}

}
