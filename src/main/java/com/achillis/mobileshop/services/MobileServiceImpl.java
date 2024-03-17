package com.achillis.mobileshop.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achillis.mobileshop.entities.Mobile;
import com.achillis.mobileshop.repositories.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService{

	@Autowired
	private MobileRepository mobileRepository;
	
	@Override
	public Mobile addMobileToCatalog(Mobile mobile) {
		return mobileRepository.save(mobile);
	}
	
	@Override
	public List<Mobile> getMobileByModelName(String modelName) {
		return mobileRepository.findByModelName(modelName);
	}
	
	@Override
	public List<Mobile> getMostSoldMobiles(Integer year, Integer limit) {
		List<Mobile> mobileList = mobileRepository.findByLaunchYearOrderBySoldCountDesc(year);
		List<Mobile> limitMobileList = new ArrayList<>();
		for(int i=0;i<limit;i++) {
			limitMobileList.add(mobileList.get(i));
		}
		return limitMobileList; 
	}
	
}
