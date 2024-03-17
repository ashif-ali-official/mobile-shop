package com.achillis.mobileshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achillis.mobileshop.entities.Mobile;
import com.achillis.mobileshop.services.MobileService;

@RestController
@RequestMapping("/mobiles")
public class MobileController {
	
	@Autowired
	private MobileService mobileService;

	@GetMapping("/{modelName}")
	public List<Mobile> getMobileByModelName(@PathVariable String modelName) {
		return mobileService.getMobileByModelName(modelName);
	}
	
	@PostMapping("/addMobile")
	public Mobile addMobileToCatalog(@RequestBody Mobile mobile ){
		return mobileService.addMobileToCatalog(mobile);
	}
	
	@GetMapping("/{year}/{limit}")
	public List<Mobile> getMostSoldMobiles(Integer year, Integer limit){
		return mobileService.getMostSoldMobiles(year, limit);
	}
	
}
