package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.ICoffee;
import fr.foata.nicolas.challenges.coffee.model.IIngredientDecorator;

public class Large implements IIngredientDecorator {

	private ICoffee coffee = null;
	
	public Large ( ICoffee coffee ) {
		super();
		this.setCoffee(coffee);
	}
	
	private void setCoffee( ICoffee coffee ) {
		this.coffee = coffee;
	}
	
	@Override
	public double costs() {
		return this.coffee.costs() + 0.5;
	}

}
