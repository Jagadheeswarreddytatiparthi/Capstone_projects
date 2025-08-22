Feature:check validate login page 
Scenario Outline: Check for valid and invalid credentials 
Given login page should be open in default browser
When click on login button and enter <username1>
And add <password1>
And click on signin button check <status>
Then login successfully and open home page
Examples:
|username1|password1|status|
|438547|password|fail|
|dmmdkf|djfjv|fail|
|username|hjywdalw|fail|
|username|password|success|