package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.foata.nicolas.challenges.coffee.model.ICoffee;

public class LargeTest {

	private ICoffee coffee  = null;
	private Large   large   = null;
	private Large   exLarge = null;

	@Before
	public void setUp() {
	   this.coffee  = new ICoffee(){ public double costs(){ return 3.5; }};
	   this.large   = new Large( this.coffee );
	   this.exLarge = new Large( this.large  );
	}
	
	@Test
	public void testCosts() {
		assertEquals( 4.0 , this.large.costs()   , 0);
		assertEquals( 4.5 , this.exLarge.costs() , 0);
	}

}
