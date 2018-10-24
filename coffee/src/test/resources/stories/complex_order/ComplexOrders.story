Complex order story

Narrative:
In order to test an order with several coffees
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  As customers, we would like to order an espresso + a cappuccino and have the bill (total,GST)
Given We entered in a coffee bar with friends
When We ask for a REGULAR_ESPRESSO and for a REGULAR_CAPPUCCINO
Then The total for us must be 6.50 and the gst must be 0.65

Scenario:  As customers, we would like to order a capuccino + a latte and have the bill (total,GST)
Given We entered in a coffee bar with friends
When We ask for a REGULAR_CAPPUCCINO and for a REGULAR_LATTE
Then The total for us must be 7.00 and the gst must be 0.70

					 
