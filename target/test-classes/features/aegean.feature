Feature: verify the aegan airline mobile application
Scenario Outline: verify the login page 
Given user click the my profile icon on home page
When User give the "<ussername>" and "<password>"
Then Verify the error message


Examples:
|ussername|password|
|abarajitha|12345678|

