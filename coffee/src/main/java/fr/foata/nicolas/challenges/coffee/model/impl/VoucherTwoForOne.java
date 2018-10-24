package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.IVoucher;

public class VoucherTwoForOne implements IVoucher {
	
	@Override
	public String getDescription() {
		return "This voucher applies a two for one coffee (cheapest offered)";
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
