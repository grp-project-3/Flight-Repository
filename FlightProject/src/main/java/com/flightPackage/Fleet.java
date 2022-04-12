package com.flightPackage;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Fleet 
{
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull(message="Code should be given for each flight")
	@Size(min=4,max=6)
	private String code;
	
	@NotNull(message="Model name must be mention")
	private String model;
	
	@NotNull
	@Column(name="Economy Seats")
	private int totalEconomySeats;
	
	@NotNull
	@Column(name="Premium Seats")
	private int totalPremiumSeats;
	
	@NotNull
	@Column(name="Business Seats")
	private int totalBusinessSeats;
	
	public Fleet() {}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getCode() 
	{
		return code;
	}

	public void setCode(String code) 
	{
		this.code = code;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public int getTotalEconomySeats() 
	{
		return totalEconomySeats;
	}

	public void setTotalEconomySeats(int totalEconomySeats) 
	{
		this.totalEconomySeats = totalEconomySeats;
	}

	public int getTotalPremiumSeats() 
	{
		return totalPremiumSeats;
	}

	public void setTotalPremiumSeats(int totalPremiumSeats) 
	{
		this.totalPremiumSeats = totalPremiumSeats;
	}

	public int getTotalBusinessSeats() 
	{
		return totalBusinessSeats;
	}

	public void setTotalBusinessSeats(int totalBusinessSeats) 
	{
		this.totalBusinessSeats = totalBusinessSeats;
	}
}
