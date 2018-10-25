package com.animal.farm.model;

import com.animal.farm.behaviour.Jockable;

public class ClownFish extends Fish implements Jockable{

	public ClownFish() {
		super(FishSize.SMALL, FishColour.MULTICOLOR);
	}

	@Override
	public String sayJokes() {		
		return "Super Funny Joke!!!";
	}
}
