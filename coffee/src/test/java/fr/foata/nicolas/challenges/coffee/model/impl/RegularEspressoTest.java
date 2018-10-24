package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegularEspressoTest {

	private RegularEspresso espresso = null;

	@Before
	public void setUp() {
	   this.espresso = new RegularEspresso();
	}
	
	@Test
	public void testCosts() {
		assertEquals( 3.0 , this.espresso.costs(), 0 );
	}

}
