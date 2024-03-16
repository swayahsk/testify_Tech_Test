Feature: Search and place the order for Products

Background:
Given user is on GreenCard Landing page 

@SmokeTests
Scenario Outline: Search Experience for product search in both homepage and offerspage

When user searched with shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offers page 
And check if the product name is the same in offer page and landling page

Examples: 
|Name|
|Tom|
|Beet|
@Function
Scenario: Add product to the card
When user searched with shortname <Name> and extracted actual name of product
And user add three units 
Then User go to the cart
And check if the product name is added in the cart with the same <Name>

Examples: 
|Name|
|Tom|
