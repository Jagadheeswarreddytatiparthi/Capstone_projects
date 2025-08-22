Feature: check validate login page of eBay 
Scenario: Check for valid credentials 
Given login page should be open in default browser
When click on login button and enter email
When  click on continue button
And add password
And click on signin button check status
Then login successfully and open home page
