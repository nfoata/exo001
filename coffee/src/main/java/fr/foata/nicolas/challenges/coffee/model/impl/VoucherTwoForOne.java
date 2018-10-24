package fr.foata.nicolas.challenges.coffee.model.impl;

import java.util.Comparator;

import fr.foata.nicolas.challenges.coffee.model.Coffees;
import fr.foata.nicolas.challenges.coffee.model.ICoffee;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.IVoucher;

public class VoucherTwoForOne implements IVoucher {
	
	@Override
	public String getDescription() {
		return "This voucher applies a two for one coffee (cheapest offered)";
	}

	@Override
	public double calculateTotal( IOrder order ) {
		Coffees coffees   = this.sortCoffees( order.getCoffees() );
		int limit = this.computeNbOfCoffeesForTheBill( coffees.size() );
		int index = 0 ;
		double total = 0.;
		for( ICoffee coffee : coffees ) {
			if( index >= limit ) {
				break;
			}
			total += coffee.costs();
			index++;
		}
		return total;
	}
	
	private Coffees sortCoffees( Coffees coffees ) {
		coffees.sort( new Comparator<ICoffee>() {
			public int compare(ICoffee coffee1, ICoffee coffee2) { 
		        return (int)( (coffee2.costs() - coffee1.costs()) * 100); 
			} 
		});
		return coffees;
	}

	private int computeNbOfCoffeesForTheBill( int nbOfCoffees ) {
		int halfOfCoffees = nbOfCoffees / 2;
		return nbOfCoffees % 2 == 0 ? halfOfCoffees : halfOfCoffees + 1 ;
	}
}
