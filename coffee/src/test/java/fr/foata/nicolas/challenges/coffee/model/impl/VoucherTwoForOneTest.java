package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.foata.nicolas.challenges.coffee.model.IOrder;

public class VoucherTwoForOneTest {

	private IOrder order = null;
	private VoucherTwoForOne voucher = null;

	@Before
	public void setUp() {
		CoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		this.voucher = new VoucherTwoForOne();
		this.order = coffeeBarFactory.createsOrder();
		this.order.addCoffee( coffeeBarFactory.makesRegularEspresso()   );
		this.order.addCoffee( coffeeBarFactory.makesRegularCappuccino() );
		this.order.addCoffee( coffeeBarFactory.makesRegularLatte()      );
	}
	
	@Test
	public void testCalculateTotal() {
		assertEquals( 7. , this.voucher.calculateTotal(order) , 0 );
	}

}
