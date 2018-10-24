package fr.foata.nicolas.challenges.coffee.steps;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import fr.foata.nicolas.challenges.coffee.model.ICoffeeBarFactory;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.impl.CoffeeBarFactory;

public class ComplexOrdersSteps {
	
	private static IOrder order = null;
	
	@Given("We entered in a coffee bar with friends")
	public void enterInCoffeeBar() {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order = coffeeBarFactory.createsOrder();
	}
	
	@When("We ask for a $coffeeType1 and for a $coffeeType2")
	public void askACoffee( String coffeeType1 , String coffeeType2 ) {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order.addCoffee( coffeeBarFactory.makesFromString(coffeeType1) );
		order.addCoffee( coffeeBarFactory.makesFromString(coffeeType2) );
	}
	
	/*@When("I ask for a large $coffeeType")
	public void askALargeCoffee( String coffeeType ) {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order.addCoffee( 
				coffeeBarFactory.makesLarger(
						coffeeBarFactory.makesFromString(coffeeType)
				)
		);
	}
	
	@When("I ask for a double large $coffeeType")
	public void askADoubleLargeCoffee( String coffeeType ) {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order.addCoffee( 
				coffeeBarFactory.makesLarger(
						coffeeBarFactory.makesLarger(
								coffeeBarFactory.makesFromString(coffeeType)
						)
				)
		);
	}*/
	
	@Then("The total for us must be $total and the gst must be $gst")
	public void checkAmounts( double total, double gst ) {
		assertEquals( total , order.getTotal() , 0 );
		assertEquals( gst   , order.getGst()   , 0 );
	}
}
