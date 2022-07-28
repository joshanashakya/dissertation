

# Python3 implementation of the approach 
  
MAX = 1000000
MOD = 10**9 + 7
  
# Declare result array globally 
result = [0 for i in range(MAX + 1)] 
fact = [0 for i in range(MAX + 1)] 
  
# Function to precompute the product 
# of factorials upto MAX 
def preCompute(): 
  
    # Initialize base condition if n = 0 
    # then factorial of 0 is equal to 1 
    # and answer for n = 0 is 1 
    fact[0] = 1
    result[0] = 1
  
    # Iterate loop from 1 to MAX 
    for i in range(1, MAX + 1): 
  
        # factorial(i) = factorial(i - 1) * i 
        fact[i] = ((fact[i - 1] % MOD) * i) % MOD 
  
        # Result for current n is   
        # equal to result[i-1]  
        # multiplied by the factorial of i 
        result[i] = ((result[i - 1] % MOD) * 
                     (fact[i] % MOD)) % MOD 
  
# Function to perform the queries 
def performQueries(q, n): 
  
    # Precomputing the result tiMAX 
    preCompute() 
  
    # Perform queries 
    for i in range(n): 
        print(result[q[i]]) 
  
# Driver code 
q = [4, 5] 
n = len(q) 
  
performQueries(q, n) 
  
# This code is contributed by Mohit Kumar 

