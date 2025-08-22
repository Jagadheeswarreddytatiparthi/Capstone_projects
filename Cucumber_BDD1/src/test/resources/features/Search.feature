Feature:check search feature  
Scenario: Check search button is working or not 
Given login user and search button available
When  Enter <items> and then use keyboard enter key
Then list of relevant output from search element
|items|
|online banking|
|transfer money|