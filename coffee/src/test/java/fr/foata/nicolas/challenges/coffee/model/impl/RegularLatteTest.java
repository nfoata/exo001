package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegularLatteTest {

	private RegularLatte latte = null;

	@Before
	public void setUp() {
		this.latte = new RegularLatte();
	}
	
	@Test
	public void testCosts() {
		assertEquals( 3.5 , this.latte.costs(), 0 );
	}

}
