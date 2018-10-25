package com.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import com.animal.farm.model.Bird;
import com.animal.farm.model.Chicken;
import com.animal.farm.model.Duck;
import com.animal.farm.model.Gender;

public class TestingAnimalFarm {
	
	public static final String NOT_SUPPORTED="Not Supported";


	@Test
	public void testDuckBehaviour() {
		
		Duck myDuck = new Duck();		
		assertEquals(myDuck.canSwim(),true);
		assertEquals(myDuck.sound(),"Quack, quack");
	}
	
	@Test
	public void testChickenBehaviour() {
		
		Chicken myChicken = new Chicken(Gender.FEMALE);		
		assertEquals(myChicken.canFly(),false);
		assertEquals(myChicken.sound(),"Cluck, cluck");
		
		//Test Rooster Behaviour
		Chicken myRooster = new Chicken(Gender.MALE);		
		assertEquals(myRooster.canFly(),false);
		assertEquals(myRooster.sound(),"Cock-a-doodle-doo");		
	}	
	
}
