package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.foata.nicolas.challenges.coffee.model.IOrder;

public class NoVoucherTest {

	private IOrder order = null;
	private NoVoucher voucher = null;

	@Before
	public void setUp() {
		CoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		this.voucher = new NoVoucher();
		this.order = coffeeBarFactory.createsOrder();
		this.order.addCoffee( coffeeBarFactory.makesRegularEspresso()   );
		this.order.addCoffee( coffeeBarFactory.makesRegularCappuccino() );
		this.order.addCoffee( coffeeBarFactory.makesRegularLatte()      );
	}
	
	@Test
	public void testCalculateTotal() {
		assertEquals( 10. , this.voucher.calculateTotal(order) , 0 );
	}

}
