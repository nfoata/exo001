package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.foata.nicolas.challenges.coffee.model.ECoffeeType;
import fr.foata.nicolas.challenges.coffee.model.EVoucherType;

public class CoffeeBarFactoryTest {

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
	}
	
	@Test
	public void testMakesFromString() {
		assertTrue( "An espresso is expected"      , this.coffeeFactory.makesFromString( "REGULAR_ESPRESSO"   ) instanceof RegularEspresso  );
		assertTrue( "A capuccino is expected"      , this.coffeeFactory.makesFromString( "REGULAR_CAPPUCCINO" ) instanceof RegularCappuccino );
		assertTrue( "A latte is expected"          , this.coffeeFactory.makesFromString( "REGULAR_LATTE"      ) instanceof RegularLatte     );
		assertTrue( "A flat white is expected"     , this.coffeeFactory.makesFromString( "REGULAR_FLAT_WHITE" ) instanceof RegularFlatWhite );
		assertTrue( "A soy flat white is expected" , this.coffeeFactory.makesFromString( "SOY_FLAT_WHITE"     ) instanceof SoyFlatWhite     );
		try {
			this.coffeeFactory.makesFromString( "NOT_EXIST" );
            fail("An illegal exception is expected given the coffee type does not exist");
        } catch (IllegalArgumentException e) {
        	assertTrue("Exception enum thrown as expected", e.getMessage().matches(".*ECoffeeType.NOT_EXIST.*") );
        } catch (Exception e) {
        	fail("Not the correct exception has been launched");
        }
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
	
	@Test
	public void testCreatesOrder() {
		assertTrue( "An order is expected" , this.coffeeFactory.createsOrder() instanceof Order );
	}
	
	@Test
	public void testCreatesFromVoucherType() {
		assertTrue( "A 10% voucher is expected"   , this.coffeeFactory.createsFromVoucherType( EVoucherType.TEN_PERCENT ) instanceof VoucherTenPercent );
		assertTrue( "A 2For1 voucher is expected" , this.coffeeFactory.createsFromVoucherType( EVoucherType.TWO_FOR_ONE ) instanceof VoucherTwoForOne  );
	}
	
	@Test
	public void testCreatesFromVoucherString() {
		assertTrue( "A 10% voucher is expected"   , this.coffeeFactory.createsFromVoucherString( "TEN_PERCENT" ) instanceof VoucherTenPercent );
		assertTrue( "A 2For1 voucher is expected" , this.coffeeFactory.createsFromVoucherString( "TWO_FOR_ONE" ) instanceof VoucherTwoForOne  );
		try {
			this.coffeeFactory.createsFromVoucherString( "NOT_EXIST" );
            fail("An illegal exception is expected given the voucher type does not exist");
        } catch (IllegalArgumentException e) {
        	assertTrue("Exception enum thrown as expected", e.getMessage().matches(".*EVoucherType.NOT_EXIST.*") );
        } catch (Exception e) {
        	fail("Not the correct exception has been launched");
        }
	}

}
