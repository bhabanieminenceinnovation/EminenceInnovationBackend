package com.admin.service;

import java.util.List;

import com.admin.entities.Career;

public interface CareerService {

	Career createCareer(Career career);

	Career getCareer(Integer careerid);

	List<Career> getAllCareers();

	void deleteCareer(Integer careerId);

	Career updateCareer(Career career);

}
