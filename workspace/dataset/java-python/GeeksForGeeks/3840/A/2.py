

# Python3 implementation of the approach 
  
# Function to return the value of F(N) 
def getValueOfF(n): 
  
    # Base cases 
    if (n == 1): 
        return 0
    if (n == 2): 
        return 1
  
    cnt = 0
  
    # Count the number of times a number 
    # if divisible by 2 
    while (n % 2 == 0): 
        cnt += 1
        n /= 2
  
    # Return the summation 
    return 2 * cnt 
  
# Driver code 
n = 20
print(getValueOfF(n)) 
  
# This code is contributed by mohit kumar 

