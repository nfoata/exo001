package fr.foata.nicolas.challenges.coffee.model.impl;

import fr.foata.nicolas.challenges.coffee.model.ICoffee;

public class RegularEspresso implements ICoffee {

	@Override
	public double costs() {
		return 3.;
	}

}
