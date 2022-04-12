package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.flightPackage.Fleet;

@Service
public class FleetService 
{
	@Autowired
	FleetDAO fleetDAOImpl;
	
	public void add(Fleet fleet)
	{
		fleetDAOImpl.addFleet(fleet);
	}
	
	public Fleet find(int id)
	{
		return fleetDAOImpl.findFleet(id);
	}
	
	public List<Fleet> findAll()
	{
		return fleetDAOImpl.findAllFleet();
	}
	
	public boolean update(Fleet fleet)
	{
		return fleetDAOImpl.modifyFleet(fleet);
	}
	
	public boolean delete(Fleet fleet)
	{
		return fleetDAOImpl.deleteFleet(fleet);
	}
}
