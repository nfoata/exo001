package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.foata.nicolas.challenges.coffee.model.IOrder;

public class VoucherTenPercentTest {

	private IOrder order = null;
	private VoucherTenPercent voucher = null;

	@Before
	public void setUp() {
		CoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		this.voucher = new VoucherTenPercent();
		this.order = coffeeBarFactory.createsOrder();
		this.order.addCoffee( coffeeBarFactory.makesRegularEspresso()   );
		this.order.addCoffee( coffeeBarFactory.makesRegularCappuccino() );
		this.order.addCoffee( coffeeBarFactory.makesRegularLatte()      );
	}
	
	@Test
	public void testCalculateTotal() {
		assertEquals( 9. , this.voucher.calculateTotal(order) , 0 );
	}
	
}
