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

	public boolean canSwim()
	{
		return false;
	}
	
	public boolean canMakeSound()
	{
		return true;
	}
	
	public String sound()
	{
		if(canMakeSound())
		{
			return "Animal Sound";
		}
		else
		{
			return NOT_SUPPORTED;
		}
	}
	
	public String soundSecondLang()
	{
		if(canMakeSound())
		{
			return "Mrigham Ocha";
		}
		else
		{
			return NOT_SUPPORTED;
		}
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
