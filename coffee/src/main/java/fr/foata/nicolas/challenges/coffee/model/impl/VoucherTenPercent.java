package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.IVoucher;

public class VoucherTenPercent implements IVoucher {

	@Override
	public String getDescription() {
		return "This voucher applies ten percent discount on the total.";
	}

	@Override
	public double calculateTotal( IOrder order ) {
		return 0;
	}

}
