Feature: check add to cart button functionality 
Scenario: Search for an item and add it to cart
Given eBay website home page 
When search for a item 
And  click add to cart button
Then item is added to cart successfully
