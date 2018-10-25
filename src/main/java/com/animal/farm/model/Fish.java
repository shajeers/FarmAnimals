package com.animal.farm.model;

enum FishColour {
	GREY, MULTICOLOR; 
}

public abstract class Fish extends Animal{
	
	public enum FishSize {
		SMALL, LARGE; 
	}
	
	public enum FishColour {
		GREY, MULTICOLOR; 
	}
	
	FishSize size;
	FishColour color;
	
	public Fish(FishSize size,FishColour color)
	{
		this.size=size;
		this.color=color;
	}
	
	@Override
	public boolean canSwim()
	{
		return true;
	}
	
	@Override
	public boolean canWalk()
	{
		return false;
	}	

	public FishSize getSize() {
		return size;
	}

	public void setSize(FishSize size) {
		this.size = size;
	}

	public FishColour getColor() {
		return color;
	}

	public void setColor(FishColour color) {
		this.color = color;
	}
	
	public String swim()
	{
		if(canSwim())
		{
			return "Animal Swimming";
		}
		else
		{
			return NOT_SUPPORTED;
		}
	}	
}
