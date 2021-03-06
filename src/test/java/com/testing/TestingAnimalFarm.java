package com.testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.animal.farm.FarmAnimals;
import com.animal.farm.model.Animal;
import com.animal.farm.model.Bird;
import com.animal.farm.model.Butterfly;
import com.animal.farm.model.Cat;
import com.animal.farm.model.Chicken;
import com.animal.farm.model.ClownFish;
import com.animal.farm.model.Dog;
import com.animal.farm.model.Dolphin;
import com.animal.farm.model.Duck;
import com.animal.farm.model.Fish;
import com.animal.farm.model.Gender;
import com.animal.farm.model.Parrot;
import com.animal.farm.model.Shark;

public class TestingAnimalFarm {

	public static final String NOT_SUPPORTED = "Not Supported";

	@Test
	public void testDuckBehaviour() {

		Duck myDuck = new Duck();
		assertEquals(myDuck.canSwim(), true);
		assertEquals(myDuck.sound(), "Quack, quack");
	}

	@Test
	public void testChickenBehaviour() {

		Chicken myChicken = new Chicken(Gender.FEMALE);
		assertEquals(myChicken.canFly(), false);
		assertEquals(myChicken.sound(), "Cluck, cluck");

		// Test Rooster Behaviour
		Chicken myRooster = new Chicken(Gender.MALE);
		assertEquals(myRooster.canFly(), false);
		assertEquals(myRooster.sound(), "Cock-a-doodle-doo");
	}

	@Test
	public void testParrotBehaviour() {

		Parrot<Animal> myParrot1 = new Parrot<>();
		myParrot1.setCompanion(new Dog());
		assertEquals(myParrot1.sound(), "Woof, woof");

		Parrot<Animal> myParrot2 = new Parrot<>();
		myParrot2.setCompanion(new Cat());
		assertEquals(myParrot2.sound(), "Meow");

		Parrot<Animal> myParrot3 = new Parrot<>();
		myParrot3.setCompanion(new Chicken(Gender.MALE));
		assertEquals(myParrot3.sound(), "Cock-a-doodle-doo");

		Parrot<Animal> myParrot4 = new Parrot<>();
		myParrot4.setCompanion(new Duck());
		assertEquals(myParrot4.sound(), "Quack, quack");
	}

	@Test
	public void testFishBehaviour() {

		Shark myShark = new Shark();
		assertEquals(myShark.getSize(), Fish.FishSize.LARGE);
		assertEquals(myShark.getColor(), Fish.FishColour.GREY);
		assertEquals(myShark.canWalk(), false);
		assertEquals(myShark.canSwim(), true);

		ClownFish clownFish = new ClownFish();
		assertEquals(clownFish.getSize(), Fish.FishSize.SMALL);
		assertEquals(clownFish.getColor(), Fish.FishColour.MULTICOLOR);
		assertEquals(clownFish.canWalk(), false);
		assertEquals(clownFish.canSwim(), true);
		assertNotNull(clownFish.sayJokes());
	}

	@Test
	public void testDolphinBehaviour() {
		Dolphin myDolphin = new Dolphin();
		assertNotNull(myDolphin.swim());

	}

	@Test
	public void testButterflyBehaviour() {

		Butterfly butterfly = new Butterfly();

		// Initially should have caterpillar behaviour
		assertEquals(butterfly.canFly(), false);
		assertEquals(butterfly.canWalk(), true);

		// do metamorphosis
		butterfly.metamorphosis();

		// Now should have butterfly behaviour
		assertEquals(butterfly.canFly(), true);
		assertEquals(butterfly.canWalk(), false);
	}

	@Test
	public void testAnimalCount() {
		List<Animal> animals = Arrays.asList(new Butterfly(), new Cat(), new Dog(), new Duck(),
				new Chicken(Gender.FEMALE), new Chicken(Gender.MALE), new ClownFish(), new Dolphin(), new Parrot(),
				new Shark());

		// Only Parrot & Duck can fly
		assertEquals(FarmAnimals.flyingAnimals(animals).size(), 2);

		// Except Fishes, all other Animals can walk
		assertEquals(FarmAnimals.walkingAnimals(animals).size(), 7);

		// The Birds - chick, rooster,duck & parrot can sing
		assertEquals(FarmAnimals.singingAnimals(animals).size(), 4);

		// The Fishes - Shark, ClownFish & Dolphin can swim
		assertEquals(FarmAnimals.swimmingAnimals(animals).size(), 3);

	}

	@Test
	public void testSecondLang() {
		Chicken myRooster = new Chicken(Gender.MALE);
		assertEquals(myRooster.sound(), "Cock-a-doodle-doo");
		assertEquals(myRooster.soundSecondLang(), "Kokkara Koooo");

	}

}
