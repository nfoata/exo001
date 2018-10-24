package fr.foata.nicolas.challenges.coffee.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {
	
	private Order order = null;

	@Before
	public void setUp() {
		this.order = new Order();
	}
	
	@Test
	public void testHasVoucher() {
		this.order.setVoucher(null);
		assertFalse( "Null voucher", this.order.hasVoucher() );
		
		this.order.setVoucher( new NoVoucher() );
		assertFalse( "No Voucher", this.order.hasVoucher() );
		
		this.order.setVoucher( new VoucherTenPercent() );
		assertTrue( "Ten Percent Voucher", this.order.hasVoucher() );
	}
	
	@Test 
	public void testVoucher() {
		NoVoucher voucher = new NoVoucher();
		this.order.setVoucher( voucher );
		assertSame( voucher , this.order.getVoucher() );
	}

}
