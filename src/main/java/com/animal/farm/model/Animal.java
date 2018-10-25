package com.animal.farm.model;

public abstract class Animal {
	
	public static final String NOT_SUPPORTED="Not Supported";
	
	public boolean canWalk()
	{
		return true;
	}
	
	public boolean canFly()
	{
		return false;
	}

	public String walk()
	{
		if(canWalk())
		{
			return "Animal walking";
		}
		else
		{
			return NOT_SUPPORTED;
		}
	}
	
	public String fly()
	{
		if(canFly())
		{
			return "Animal flying";
		}
		else
		{
			return NOT_SUPPORTED;
		}
	}
}
