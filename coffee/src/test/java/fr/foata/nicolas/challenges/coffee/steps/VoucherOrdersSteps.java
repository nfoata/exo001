package fr.foata.nicolas.challenges.coffee.steps;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import fr.foata.nicolas.challenges.coffee.model.ICoffeeBarFactory;
import fr.foata.nicolas.challenges.coffee.model.IOrder;
import fr.foata.nicolas.challenges.coffee.model.impl.CoffeeBarFactory;

public class VoucherOrdersSteps {

private static IOrder order = null;
	
	@Given("I entered in a coffee bar with my voucher")
	public void enterInCoffeeBar() {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order = coffeeBarFactory.createsOrder();
	}
	
	@When("I provide my $voucherType voucher and I take a $coffeeType1 with a $coffeeType2")
	public void askACoffee( String voucherType , String coffeeType1 , String coffeeType2 ) {
		ICoffeeBarFactory coffeeBarFactory = CoffeeBarFactory.getInstance();
		order.addCoffee( coffeeBarFactory.makesFromString(coffeeType1) );
		order.addCoffee( coffeeBarFactory.makesFromString(coffeeType2) );
		order.setVoucher( coffeeBarFactory.createsFromVoucherString(voucherType) );
	}
	
	@Then("The total should be $total and the gst should be $gst")
	public void checkAmounts( double total, double gst ) {
		assertEquals( total , order.getTotal() , 0 );
		assertEquals( gst   , order.getGst()   , 0 );
	}
}
