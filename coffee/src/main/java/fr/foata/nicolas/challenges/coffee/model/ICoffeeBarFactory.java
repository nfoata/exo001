package fr.foata.nicolas.challenges.coffee.model;

public interface ICoffeeBarFactory {
	
	public static ICoffeeBarFactory getInstance() { return null; }

	public abstract IOrder   createsOrder();
	public abstract IVoucher createsFromVoucherString( final String voucherType );
	public abstract IVoucher createsFromVoucherType( final EVoucherType voucherType );
	
	public abstract ICoffee makesFromCoffeeType( final ECoffeeType coffeeType );	
	public abstract ICoffee makesFromString( final String coffeeType );
	public abstract ICoffee makesRegularEspresso();
	public abstract ICoffee makesRegularCappuccino();
	public abstract ICoffee makesRegularLatte();
	public abstract ICoffee makesRegularFlatWhite();
	public abstract ICoffee makesSoyFlatWhite();
	public abstract ICoffee makesLarger( ICoffee coffee );
	
}
