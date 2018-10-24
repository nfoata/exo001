package fr.foata.nicolas.challenges.coffee.model;

public interface IOrder extends Iterable<ICoffee>, IVoucheable {
	
	public abstract IOrder addCoffees( final ICoffee ... coffees );
	public abstract IOrder addCoffee( final ICoffee coffee );
	
	public abstract double getGst();
	public abstract double getTotal();
	
}
