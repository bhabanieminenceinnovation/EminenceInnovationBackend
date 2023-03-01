package com.admin.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.entities.Career;


public interface CareerRepo extends JpaRepository<Career, Integer> {


}
