package com.animal.farm.model;

public class Butterfly extends Animal {

	private Animal state = new CaterpillarState();

	@Override
	public boolean canFly() {
		return state.canFly();
	}

	@Override
	public boolean canWalk() {
		return state.canWalk();
	}

	public void metamorphosis() {
		state = new ButterflyState();
	}

	private class CaterpillarState extends Animal {
		@Override
		public boolean canFly() {
			return false;
		}

		@Override
		public boolean canWalk() {
			return true;
		}
	}

	private class ButterflyState extends Animal {
		@Override
		public boolean canFly() {
			return true;
		}

		@Override
		public boolean canWalk() {
			return false;
		}
	}

}
