package com.animal.farm.model;

public class Chicken extends Bird{
	
	Gender gender;
	
	public Chicken(Gender gender)
	{
		this.gender=gender;
	}
	
	@Override
	public boolean canFly() {
		return false;
	}
	
	@Override
	public String sound()
	{
		if(gender.equals(Gender.MALE))
		{
			return "Cock-a-doodle-doo";
		}
		else
		{
			return "Cluck, cluck";
		}
	}

}
