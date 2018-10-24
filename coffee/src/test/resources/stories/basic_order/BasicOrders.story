Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  As a customer, I would like to order an espresso and have the bill (total,GST)
Given I entered in a coffee bar
When I ask for a REGULAR_ESPRESSO
Then The total must be 3.00 and the gst must be 0.30

Scenario:  As a customer, I would like to order a capuccino and have the bill (total,GST)
Given I entered in a coffee bar
When I ask for a REGULAR_CAPPUCCINO
Then The total must be 3.50 and the gst must be 0.35

Scenario:  As a customer, I would like to order a latte and have the bill (total,GST)
Given I entered in a coffee bar
When I ask for a REGULAR_LATTE
Then The total must be 3.50 and the gst must be 0.35

Scenario:  As a customer, I would like to order a flat white and have the bill (total,GST)
Given I entered in a coffee bar
When I ask for a REGULAR_FLAT_WHITE
Then The total must be 3.50 and the gst must be 0.35

Scenario:  As a customer, I would like to order a soy flat white and have the bill (total,GST)
Given I entered in a coffee bar
When I ask for a SOY_FLAT_WHITE
Then The total must be 4.0 and the gst must be 0.40
					 
