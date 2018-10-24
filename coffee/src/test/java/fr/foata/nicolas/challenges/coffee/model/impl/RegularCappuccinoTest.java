package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegularCappuccinoTest {

	private RegularCappuccino capuccino = null;

	@Before
	public void setUp() {
		this.capuccino = new RegularCappuccino();
	}
	
	@Test
	public void testCosts() {
		assertEquals( 3.5 , this.capuccino.costs(), 0 );
	}

}
