Feature: Check the username is editable or not 
Scenario: Change the current username of eBay account
Given Ebay website homepage
When click on sign button and entering using email and password
When click on account settings and click on personal info
When click on edit and change the username
Then username is successfully changed.
