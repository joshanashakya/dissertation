

# Python3 implementation of the approach 
  
# Function to return the x% of n 
def percent(n, x): 
  
    p = (int)(n) * x; 
    p /= 100; 
    return p; 
  
# Function to return the total loss 
def getLoss(price, quantity, X, n): 
  
    # To store the total loss 
    loss = 0; 
  
    for i in range(n): 
  
        # Original price of the item 
        originalPrice = price[i]; 
  
        # The price at which the item will be sold 
        sellingPrice = originalPrice + percent(originalPrice, X[i]); 
  
        # The discounted price of the item 
        afterDiscount = sellingPrice - percent(sellingPrice, X[i]); 
  
        # Loss incurred 
        loss += ((originalPrice - afterDiscount) * quantity[i]); 
  
    return round(loss,2); 
  
# Driver code 
price = [ 20, 48, 200, 100 ]; 
quantity = [ 20, 48, 1, 1 ]; 
X = [ 0, 48, 200, 5 ]; 
  
# Total items 
n = len(X); 
print(getLoss(price, quantity, X, n)); 
  
      
# This code is contributed by mits 

