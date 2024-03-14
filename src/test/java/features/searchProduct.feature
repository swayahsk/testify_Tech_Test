Feature: Search and place the order for Products

Scenario: Search Experience for product search in both homepage and offerspage

Given user is on GreenCard Landing page 
When user searched with shortname "Tom" and extracted actual name of product
Then user searched for "Tom" shortname in offers page 
And check if the product name is the same in offer page and landling page
