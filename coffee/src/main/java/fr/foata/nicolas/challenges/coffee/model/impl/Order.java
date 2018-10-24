package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.Coffees;
import fr.foata.nicolas.challenges.coffee.model.ICoffee;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.IVoucher;

public class Order implements IOrder {

	// Attributes
	private Coffees  coffees = null;
	private IVoucher voucher = null;

	// Constructors
	public Order() {
		this( new Coffees() , new NoVoucher() );
	}
	public Order( IVoucher voucher ) {
		this( new Coffees() , voucher );
	}
	public Order( Coffees coffees , IVoucher voucher ) {
		super();
		this.setCoffees(coffees);
		this.setVoucher(voucher);
	}
	
	// Methods to be an IOrder
	@Override
	public IOrder addCoffees( final ICoffee ... coffees ) {
		for( ICoffee coffee : coffees ) {
			this.addCoffee(coffee);
		}
		return this;
	}
	
	@Override
	public IOrder addCoffee( final ICoffee coffee ) {
		this.coffees.add(coffee);
		return this;
	}
	
	@Override
	public double getGst() {
		return this.getTotal() * 10. / 100.;
	}

	@Override
	public double getTotal() {
		return this.voucher.calculateTotal( this );
	}
	
	// Methods to be a IVoucheable
	@Override
	public boolean hasVoucher() {
		return this.voucher != null && !(this.voucher instanceof NoVoucher);
	}

	@Override
	public void setVoucher(IVoucher voucher) {
		this.voucher = voucher;
	}

	@Override
	public IVoucher getVoucher() {
		return this.voucher;
	}

	@Override
	public Coffees getCoffees() {
		return this.coffees;
	}
	
	@Override
	public void setCoffees(Coffees coffees) {
		this.coffees = coffees;
	}
	
}
