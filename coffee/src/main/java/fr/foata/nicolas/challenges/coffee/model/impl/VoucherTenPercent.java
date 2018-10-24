package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.IVoucher;

public class VoucherTenPercent implements IVoucher {

	private IOrder order = null;
	
	public VoucherTenPercent() {
		this( null ) ;
	}
	
	public VoucherTenPercent( IOrder order ) {
		super();
		this.setOrder(order);
	}
	
	private void setOrder( IOrder order ) {
		this.order = order;
	}
	
	@Override
	public String getDescription() {
		return "This voucher applies ten percent discount on the total.";
	}

	@Override
	public double calculateTotal() {
		
		return 0;
	}

	@Override
	public double calculateGst() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
