package com.animal.farm.model;

public abstract class Bird extends Animal{	
	
	public static final String NOT_SUPPORTED="Not Supported";
	
	@Override
	public boolean canFly()
	{
		return true;
	}

	public boolean canSing()
	{
		return true;
	}
	
	public String sing()
	{
		if(canSing())
		{
			return "Bird singing";
		}
		else
		{
			return NOT_SUPPORTED;
		}
	}
}
