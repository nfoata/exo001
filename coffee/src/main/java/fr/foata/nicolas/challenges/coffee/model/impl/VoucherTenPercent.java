package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.ICoffee;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.IVoucher;

public class VoucherTenPercent implements IVoucher {

	@Override
	public String getDescription() {
		return "This voucher applies ten percent discount on the total.";
	}

	@Override
	public double calculateTotal( IOrder order ) {
		double total = this.sum( order );
		double tenPercent = total * 10. / 100. ;
		return total - tenPercent;
	}
	
	private double sum( IOrder order ) {
		double total = 0.;
		for( ICoffee coffee : order.getCoffees() ) {
			total += coffee.costs();
		}
		return total;
	}

}
