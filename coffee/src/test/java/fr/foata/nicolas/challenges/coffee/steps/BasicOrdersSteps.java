package fr.foata.nicolas.challenges.coffee.steps;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import fr.foata.nicolas.challenges.coffee.model.ICoffeeBarFactory;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.impl.CoffeeBarFactory;

public class BasicOrdersSteps extends Steps {

	private static IOrder order = null;
	
	@Given("I entered in a coffee bar")
	public void enterInCoffeeBar() {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order = coffeeBarFactory.createsOrder();
	}
	
	@When("I ask for a $coffeeType")
	public void askACoffee( String coffeeType ) {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order.addCoffee( coffeeBarFactory.makesFromString(coffeeType) );
	}
	
	@Then("The total must be $total and the gst must be $gst")
	public void checkAmounts( double total, double gst ) {
		assertEquals( total , order.getTotal() , 0 );
		assertEquals( gst   , order.getGst()   , 0 );
	}
}
