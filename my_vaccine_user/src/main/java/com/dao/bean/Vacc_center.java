package com.dao.bean;

public class Vacc_center
{
	private int center_id;
	private String center_name, state, district, address;
	
	public int getCenter_id() 
	{
		return center_id;
	}
	
	public void setCenter_id(int center_id)
	{
		this.center_id = center_id;
	}

	public String getCenter_name() 
	{
		return center_name;
	}

	public void setCenter_name(String center_name) 
	{
		this.center_name = center_name;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getDistrict()
	{
		return district;
	}

	public void setCity(String district)
	{
		this.district = district;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	
}
