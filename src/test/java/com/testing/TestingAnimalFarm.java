package com.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import com.animal.farm.model.Bird;

public class TestingAnimalFarm {
	
	public static final String NOT_SUPPORTED="Not Supported";

	@Test
	public void testBirdBehaviour() {
		
		Bird mybird = new Bird();		
		assertEquals(mybird.canFly(),true);
		assertEquals(mybird.canSing(),true);
	}
	
}
