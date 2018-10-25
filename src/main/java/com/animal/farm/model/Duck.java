package com.animal.farm.model;

public class Duck extends Bird{
	
	@Override
	public boolean canSwim()
	{
		return true;
	}	
	
	@Override
	public String sound()
	{
		return "Quack, quack";
	}

}
