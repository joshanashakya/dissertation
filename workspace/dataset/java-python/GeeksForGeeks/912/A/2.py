

# Python3 implementation of the above approach 
import math as mt 
  
# Function to calculate the value of the 
def findingValues(m, n, mth, nth): 
  
    # Calculate value of d using formula 
    d = ((abs(mth - nth)) / 
          abs((m - 1) - (n - 1))) 
  
    # Calculate value of a using formula 
    a = mth - ((m - 1) * d) 
  
    # Return pair 
    return a, d 
  
# Function to calculate value sum 
# of first p numbers of the series 
def findSum(m, n, mth, nth, p): 
      
    # First calculate value of a and d 
    a,d = findingValues(m, n, mth, nth) 
  
    # Calculate the sum by using formula 
    Sum = (p * (2 * a + (p - 1) * d)) / 2
  
    # Return the Sum 
    return Sum
  
# Driver Code 
m = 6
n = 10
mTerm = 12
nTerm = 20
p = 5
  
print(findSum(m, n, mTerm, nTerm, p)) 
  
# This code is contributed by  
# Mohit Kumar 29 

