#IS2545 - DELIVERABLE 3: Web Test
##xih55@pitt.edu

    Issues when coding on this project:
    
        1. Not using wait.unitl correctly at the beginning.
        3. IP was blocked when I was testing login story.
        3. Elements can not be catched sometimes due to complicated suitations on web page.
        4. It takes time thinking about stories and scenarios.
  
    2.Test Design
        3 stories and 9 tests.
        
        Story 1:
        Cart items
        
        Scenario 1:
        I add a iPhone5 in my cart
        Click go to checkout
        Change Quantity to 6 and click update, Total will be 72
        
        Scenario 2:        
        I add a iphone5 to my cart
        Click go to checkout
        I remove it so that cart should be empty
        
        Scenario 3:
        I add a iPhone5 in my cart
        Click continue shopping
        I should stay at the page
        
        
        Story 2:
        Log in 
        
        Scenario 1:
        Login in with nothing
        User will not be allowed to log in
        
        Scenario 2:
        Login in with invalid password and valid username
        User will not be allowed to log in
        return nothing
        
        Scenario 3:
        Login in with invalid username and valid password
        User will not be allowed to log in
        
        
        Story 3:
        Search words
        
        Scenario 1:
        Search any words
        There will be no result
        
        Scenario 2:
        Search iphone
        There will be 5 results
        
        Scenario 3:
        Search iphone
        There will be one more results
        
        
    All results are in the folder "Results".
