package com.animal.farm;

import java.util.ArrayList;
import java.util.List;

import com.animal.farm.model.Animal;
import com.animal.farm.model.Bird;

public class FarmAnimals {

	public static List<Animal> flyingAnimals(List<Animal> animalGroup) {
		List<Animal> flyingAnimals = new ArrayList<Animal>();

		for (Animal animal : animalGroup) {
			if (animal.canFly()) {
				flyingAnimals.add(animal);
			}
		}
		return flyingAnimals;
	}

	public static List<Animal> walkingAnimals(List<Animal> animalGroup) {
		List<Animal> walkingAnimals = new ArrayList<Animal>();

		for (Animal animal : animalGroup) {
			if (animal.canWalk()) {
				walkingAnimals.add(animal);
			}
		}
		return walkingAnimals;
	}

	public static List<Animal> swimmingAnimals(List<Animal> animalGroup) {
		List<Animal> swimmingAnimals = new ArrayList<Animal>();

		for (Animal animal : animalGroup) {
			if (animal.canSwim()) {
				swimmingAnimals.add(animal);
			}
		}
		return swimmingAnimals;
	}

	public static List<Animal> singingAnimals(List<Animal> animalGroup) {
		List<Animal> singingAnimals = new ArrayList<Animal>();

		for (Animal animal : animalGroup) {

			if (animal instanceof Bird) {

				Bird bird = (Bird) animal;
				if (bird.canSing()) {
					singingAnimals.add(animal);
				}
			}
		}
		return singingAnimals;
	}

}
