Large order story

Narrative:
In order to test an order with large and extra large coffees
As a development team
I want to use Behaviour-Driven Development

Scenario:  As a customer, I would like to order a large latte and have the bill (total,GST)
Given I entered in a coffee bar really thirsty
When I take a large REGULAR_LATTE
Then The extra total must be 4.00 and the gst must be 0.40

Scenario:  As a customer, I would like to order a double large soy flat white and have the bill (total,GST)
Given I entered in a coffee bar really thirsty
When I take a double large SOY_FLAT_WHITE
Then The extra total must be 5.0 and the gst must be 0.50