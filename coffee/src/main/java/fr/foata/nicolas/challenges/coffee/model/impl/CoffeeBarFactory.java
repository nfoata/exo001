package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.ECoffeeType;
import fr.foata.nicolas.challenges.coffee.model.EVoucherType;
import fr.foata.nicolas.challenges.coffee.model.ICoffee;
import fr.foata.nicolas.challenges.coffee.model.ICoffeeBarFactory;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.IVoucher;

public class CoffeeBarFactory implements ICoffeeBarFactory {

    private static class CoffeeFactoryHolder {       
        private final static CoffeeBarFactory instance = new CoffeeBarFactory();
    }
	
    public static CoffeeBarFactory getInstance() {
        return CoffeeFactoryHolder.instance;
    }
    
    private CoffeeBarFactory() { }
    
	@Override
	public IOrder createsOrder() {
		return new Order();
	}
	
	@Override
	public IVoucher createsFromVoucherType(EVoucherType voucherType) {
		switch( voucherType ) {
			case TEN_PERCENT :
				return new VoucherTenPercent();
			case TWO_FOR_ONE :
				return new VoucherTwoForOne();
		}
		throw new IllegalArgumentException("Voucher type is not valid.");
	}
	
	@Override
	public IVoucher createsFromVoucherString(String voucherType) {
		return this.createsFromVoucherType( EVoucherType.valueOf(voucherType) );
	}

	@Override
	public ICoffee makesFromCoffeeType( final ECoffeeType coffeeType ) {
		switch( coffeeType ) {
			case REGULAR_ESPRESSO : 
				return this.makesRegularEspresso();
			case REGULAR_CAPPUCCINO :
				return this.makesRegularCappuccino();
			case REGULAR_LATTE :
				return this.makesRegularLatte();
			case REGULAR_FLAT_WHITE :
				return this.makesRegularFlatWhite();
			case SOY_FLAT_WHITE :
				return this.makesSoyFlatWhite();
		}
		throw new IllegalArgumentException("Coffee type is not valid.");
	}

	@Override
	public ICoffee makesFromString( final String coffeeType ) {
		return this.makesFromCoffeeType( ECoffeeType.valueOf(coffeeType) );
	}

	@Override
	public ICoffee makesRegularEspresso() {
		return new RegularEspresso();
	}

	@Override
	public ICoffee makesRegularCappuccino() {
		return new RegularCappuccino();
	}

	@Override
	public ICoffee makesRegularLatte() {
		return new RegularLatte();
	}

	@Override
	public ICoffee makesRegularFlatWhite() {
		return new RegularFlatWhite();
	}

	@Override
	public ICoffee makesSoyFlatWhite() {
		return new SoyFlatWhite();
	}

	@Override
	public ICoffee makesLarger( ICoffee coffee ) {
		return new Large( coffee );
	}

}
