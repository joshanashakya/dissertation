

# Python3 implementation of the approach 
  
# Function to find the product of all elements 
# in all subsets in natural numbers from 1 to N 
def product(N) : 
    ans = 1; 
    val = 2 **(N - 1); 
  
    for i in range(1, N + 1) : 
        ans *= (i**val); 
      
    return ans; 
  
  
# Driver Code 
if __name__ == "__main__" : 
  
    N = 2; 
  
    print(product(N)); 
      
# This code is contributed by AnkitRai01 

