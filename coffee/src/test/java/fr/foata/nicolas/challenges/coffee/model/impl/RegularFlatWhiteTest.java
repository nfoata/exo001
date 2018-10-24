package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegularFlatWhiteTest {

	private RegularFlatWhite flatWhite = null;

	@Before
	public void setUp() {
		this.flatWhite = new RegularFlatWhite();
	}
	
	@Test
	public void testCosts() {
		assertEquals( 3.5 , this.flatWhite.costs(), 0 );
	}

}
