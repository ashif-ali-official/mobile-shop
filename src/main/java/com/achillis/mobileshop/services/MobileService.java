package com.achillis.mobileshop.services;

import java.util.List;

import com.achillis.mobileshop.entities.Mobile;

public interface MobileService {

	public Mobile addMobileToCatalog(Mobile mobile);
	
	public List<Mobile> getMobileByModelName(String modelName);
	
	public List<Mobile> getMostSoldMobiles(Integer year, Integer limit);
	
}
