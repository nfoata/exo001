package fr.foata.nicolas.challenges.coffee.steps;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import fr.foata.nicolas.challenges.coffee.model.ICoffeeBarFactory;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.impl.CoffeeBarFactory;

public class LargeOrdersSteps {

private static IOrder order = null;
	
	@Given("I entered in a coffee bar really thirsty")
	public void enterInCoffeeBar() {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order = coffeeBarFactory.createsOrder();
	}
	
	@When("I take a large $coffeeType")
	public void askALargeCoffee( String coffeeType ) {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order.addCoffee( 
				coffeeBarFactory.makesLarger(
						coffeeBarFactory.makesFromString(coffeeType)
				)
		);
	}
	
	@When("I take a double large $coffeeType")
	public void askADoubleLargeCoffee( String coffeeType ) {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order.addCoffee( 
				coffeeBarFactory.makesLarger(
						coffeeBarFactory.makesLarger(
								coffeeBarFactory.makesFromString(coffeeType)
						)
				)
		);
	}
	
	@Then("The extra total must be $total and the gst must be $gst")
	public void checkAmounts( double total, double gst ) {
		assertEquals( total , order.getTotal() , 0 );
		assertEquals( gst   , order.getGst()   , 0 );
	}
	
}
