package fr.foata.nicolas.challenges.coffee.model;

public interface IOrder extends IVoucheable {
	
	public abstract IOrder addCoffees( final ICoffee ... coffees );
	public abstract IOrder addCoffee( final ICoffee coffee );
	
	public abstract Coffees getCoffees();
	public abstract void    setCoffees( Coffees coffees );
	
	public abstract double getGst();
	public abstract double getTotal();
	
}
