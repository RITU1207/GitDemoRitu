Feature: Application login

Scenario: Home page default page
Given user is on netbanking landing page
When user is login using username "jim" and password "1234"
Then Home page is populated
And Cards displayed "true" 

Scenario: Home page default page
Given user is on netbanking landing page
When user is login using username "jhon" and password "4321"
Then Home page is populated
And Cards displayed "false"