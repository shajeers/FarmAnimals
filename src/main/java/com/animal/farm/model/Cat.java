package com.animal.farm.model;

public class Cat extends Animal{

	@Override
	public boolean canWalk() {
		return true;
	}

	@Override
	public boolean canMakeSound() {
		return true;
	}

	@Override
	public boolean canSwim() {
		return false;
	}

	@Override
	public String sound()
	{
		return "Meow";
	}
}
