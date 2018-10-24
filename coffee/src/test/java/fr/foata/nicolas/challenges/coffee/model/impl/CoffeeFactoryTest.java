package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.foata.nicolas.challenges.coffee.model.ECoffeeType;

public class CoffeeFactoryTest {

	private CoffeeBarFactory coffeeFactory = null;

	@Before
	public void setUp() {
		this.coffeeFactory = CoffeeBarFactory.getInstance();
	}
	
	@Test
	public void testGetInstance() {
		assertSame( CoffeeBarFactory.getInstance() , this.coffeeFactory );
	}
	
	@Test
	public void testMakesFromCoffeeType() {
		assertTrue( "An espresso is expected"      , this.coffeeFactory.makesFromCoffeeType( ECoffeeType.REGULAR_ESPRESSO   ) instanceof RegularEspresso  );
		assertTrue( "A capuccino is expected"      , this.coffeeFactory.makesFromCoffeeType( ECoffeeType.REGULAR_CAPPUCCINO ) instanceof RegularCappuccino );
		assertTrue( "A latte is expected"          , this.coffeeFactory.makesFromCoffeeType( ECoffeeType.REGULAR_LATTE      ) instanceof RegularLatte     );
		assertTrue( "A flat white is expected"     , this.coffeeFactory.makesFromCoffeeType( ECoffeeType.REGULAR_FLAT_WHITE ) instanceof RegularFlatWhite );
		assertTrue( "A soy flat white is expected" , this.coffeeFactory.makesFromCoffeeType( ECoffeeType.SOY_FLAT_WHITE     ) instanceof SoyFlatWhite     );
		// assertTrue( this.coffeeFactory.makesFromCoffeeType( ECoffeeType.REGULAR_FLAT_WHITE ) instanceof RegularFlatWhite );
	}
	
	@Test
	public void testMakesFromString() {
		assertTrue( "An espresso is expected"      , this.coffeeFactory.makesFromString( "REGULAR_ESPRESSO"   ) instanceof RegularEspresso  );
		assertTrue( "A capuccino is expected"      , this.coffeeFactory.makesFromString( "REGULAR_CAPPUCCINO" ) instanceof RegularCappuccino );
		assertTrue( "A latte is expected"          , this.coffeeFactory.makesFromString( "REGULAR_LATTE"      ) instanceof RegularLatte     );
		assertTrue( "A flat white is expected"     , this.coffeeFactory.makesFromString( "REGULAR_FLAT_WHITE" ) instanceof RegularFlatWhite );
		assertTrue( "A soy flat white is expected" , this.coffeeFactory.makesFromString( "SOY_FLAT_WHITE"     ) instanceof SoyFlatWhite     );
		// assertTrue( this.coffeeFactory.makesFromCoffeeType( ECoffeeType.REGULAR_FLAT_WHITE ) instanceof RegularFlatWhite );
	}
	
	@Test
	public void testMakesRegularEspresso() {
		assertTrue( "An espresso is expected" , this.coffeeFactory.makesRegularEspresso() instanceof RegularEspresso  );
	}
	
	@Test
	public void testMakesRegularCapuccino() {
		assertTrue( "A capuccino is expected" , this.coffeeFactory.makesRegularCappuccino() instanceof RegularCappuccino );
	}
	
	@Test
	public void testMakesRegularLatte() {
		assertTrue( "A latte is expected" , this.coffeeFactory.makesRegularLatte() instanceof RegularLatte );
	}
	
	@Test
	public void testMakesRegularFlatWhite() {
		assertTrue( "A flat white is expected" , this.coffeeFactory.makesRegularFlatWhite() instanceof RegularFlatWhite );
	}
	
	@Test
	public void testMakesSoyFlatWhite() {
		assertTrue( "A soy flat white is expected" , this.coffeeFactory.makesSoyFlatWhite() instanceof SoyFlatWhite );
	}
	
	@Test
	public void testMakesLarger() {
		RegularEspresso espresso = (RegularEspresso)this.coffeeFactory.makesFromCoffeeType( ECoffeeType.REGULAR_ESPRESSO );
		assertTrue( "A larger coffee is expected" , this.coffeeFactory.makesLarger(espresso) instanceof Large );
	}

}
