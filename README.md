#IS2545 - DELIVERABLE 3: Web Test
##xih55@pitt.edu

    1. Issues when coding on this project:
    
        1. Not using wait.unitl correctly at the beginning.
        3. IP was blocked when I was testing login story.
        3. Elements can not be catched sometimes due to complicated suitations on web page.
        4. It takes time thinking about stories and scenarios.
  
    2. Test Design
    
        There are 3 stories and 9 tests.
        
        Story 1:
        User have added items to Cart and then update the quantity of it 
        
        Scenario 1:
        Given I add a iPhone5 in my cart
        And Click go to checkout
        When Change Quantity to 6 and click update
        Then Total will be 72
        
        Scenario 2:        
        Given I add a iphone5 to my cart
        And Click go to checkout
        When I remove it 
        Then cart should be empty
        
        Scenario 3:
        Given I add a iPhone5 in my cart
        When Click continue shopping
        Then I should stay at the page
        
        
        Story 2:
        Users try to log in with username and password
        
        Scenario 1:
        Given typing in with nothing
        When click log in button
        Then User will not be allowed to log in
        
        Scenario 2:
        Given Login in with invalid password and valid username
        When click log in button
        Then User will not be allowed to log in
        
        Scenario 3:
        Given Login in with invalid username and valid password
        When click log in button
        Then User will not be allowed to log in
        
        
        Story 3:
        User try to search some items he/she wants to buy
        
        Scenario 1:
        Given Search any words
        When click search button
        Then there will be no result
        
        Scenario 2:
        Given Search iphone
        When click search button
        Then there will be 5 results
        
        Scenario 3:
        Given Search iphone
        When click search button
        Then there will be one more results
        
        
    All results are in the folder "Results".
