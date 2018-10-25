package com.animal.farm.model;

import com.animal.farm.behaviour.Swimmable;

public class Dolphin extends Animal implements Swimmable{


	public String swim() {
		return "Dolphins Swimming";
	}
	
	@Override
	public boolean canWalk()
	{
		return false;
	}	

}
