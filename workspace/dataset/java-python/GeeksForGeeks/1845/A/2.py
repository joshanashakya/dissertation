

# Python3 implementation of the approach 
  
# Function to return the required count 
def count(n): 
      
    # To store the count of numbers 
    cnt = 0
    p = 1
    while (p <= n): 
        cnt = cnt + 1
          
        # Every power of 2 contains  
        # only 1 set bit 
        p *= 2
    return cnt 
  
# Driver code 
n = 7
print(count(n)); 

