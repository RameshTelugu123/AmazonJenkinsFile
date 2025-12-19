Feature: Search funtionality

Scenario Outline:Working on non sponsered product
  Given launch url
  When Enter "<productName>" in the search bar and press Enter 
  And Click on the first non-sponsored product
  And On the product detail page, validate that the product title and price are visible
  And Click Add to Cart
  Then Verify confirmation message appears: Added to Cart
  Examples:
|productName|
|wirelessmouse|
  