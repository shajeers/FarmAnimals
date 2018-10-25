package com.animal.farm.model;

public class Parrot<T> extends Bird{
	
	public T companion;
	
	public T getCompanion() {
		return companion;
	}

	public void setCompanion(T companion) {
		this.companion = companion;
	}

	@Override
	public boolean canSwim() {
		return false;
	}
	
	@Override
	public String sound()
	{
		if(companion != null)
		{
			if(companion instanceof Animal)
			{
				Animal animalCompanion = (Animal)companion;
				return animalCompanion.sound();
			}
			else
			{
				return "custom Sound";
			}
		}
		else
		{
			return "Parrot sound";
		}
	}

}
