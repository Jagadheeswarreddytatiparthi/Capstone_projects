Feature: Check remove button functinality 
Scenario: Remove an item from the cart
Given eBay website home page where already item is added to cart
When item is added to cart successfully
When click on remove button to remove item from cart
Then item is removed successfully
