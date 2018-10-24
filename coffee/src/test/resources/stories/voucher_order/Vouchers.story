Voucher story

Narrative:
In order to test the voucher on an order
As a development team
I want to use Behaviour-Driven Development

Scenario:  As a customer, I would like to order a latte and an espresso and have a promotion with my voucher 2 for 1
Given I entered in a coffee bar with my voucher
When I provide my TWO_FOR_ONE voucher and I take a REGULAR_LATTE with a REGULAR_ESPRESSO
Then The total should be 3.50 and the gst should be 0.35


Scenario:  As a customer, I would like to order an espresso and a latte (change ranking) and have a promotion with my voucher 2 for 1
Given I entered in a coffee bar with my voucher
When I provide my TWO_FOR_ONE voucher and I take a REGULAR_ESPRESSO with a REGULAR_LATTE
Then The total should be 3.50 and the gst should be 0.35


Scenario:  As a customer, I would like to order two latte and have a promotion with my voucher 2 for 1
Given I entered in a coffee bar with my voucher
When I provide my TWO_FOR_ONE voucher and I take a REGULAR_ESPRESSO with a REGULAR_LATTE
Then The total should be 3.50 and the gst should be 0.35

