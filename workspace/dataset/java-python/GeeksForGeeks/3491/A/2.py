

# Python3 implementation of  
# the above approach 
  
# Function to count the  
# total number of items 
def items(n, a): 
  
    # Sort the prices 
    a.sort() 
  
    # Choose the last element 
    z = a[n-1] 
  
    # Initial count of item 
    x = 1
  
    # Sum to keep track of  
    # the total price  
    # of free items 
    s = 0
    for i in range(0, n-1): 
  
        s += a[i] 
  
        # If total is less than  
        # or equal to z then  
        # we will add 1 to the answer 
        if (s <= z): 
            x+= 1
        else: 
            break
    return x 
  
n = 5
a = [5, 3, 1, 5, 6] 
print(items(n, a)) 

