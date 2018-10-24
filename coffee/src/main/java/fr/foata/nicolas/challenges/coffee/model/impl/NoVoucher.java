package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.ICoffee;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.IVoucher;

public class NoVoucher implements IVoucher {

	@Override
	public String getDescription() {
		return "No Voucher";
	}

	@Override
	public double calculateTotal( IOrder order ) {
		double total = 0.;
		for( ICoffee coffee : order.getCoffees() ) {
			total += coffee.costs();
		}
		return total;
	}

}
