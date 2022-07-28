

# Python3 implementation of the approach 
  
# Function to return the count of 
# trailing 0s in the given function 
def findTrailingZeros(n): 
      
    # If n is odd 
    if (n & 1): 
        return 0
  
    # If n is even 
    else: 
        ans = 0
  
        # Find the trailing zeros 
        # in n/2 factorial 
        n //= 2
        while (n): 
            ans += n // 5
            n //= 5
  
        # Return the required answer 
        return ans 
  
# Driver code 
  
n = 12
  
print(findTrailingZeros(n)) 
  
# This code is contributed by mohit kumar 29 

