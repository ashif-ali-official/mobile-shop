package com.achillis.mobileshop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achillis.mobileshop.entities.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer>{

	public List<Mobile> findByModelName(String modelName);
	
	public List<Mobile> findByLaunchYearOrderBySoldCountDesc(Integer launchYear);
	
}
