Feature:  google Search

Scenario Outline:  simple keyword search

Given I am on google homepage
When I enter search "<term>"
And I click on google search button
Then I receive related result return

Examples:
|term             |
|Quality Assurance|
|Software Testing | 








