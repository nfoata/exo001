package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SoyFlatWhiteTest {

	private SoyFlatWhite soyFlatWhite = null;

	@Before
	public void setUp() {
		this.soyFlatWhite = new SoyFlatWhite();
	}
	
	@Test
	public void testCosts() {
		assertEquals( 4. , this.soyFlatWhite.costs(), 0 );
	}

}
