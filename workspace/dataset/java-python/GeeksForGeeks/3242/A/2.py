

# Python 3 implementation of the approach 
  
# Function to return the minimum cost 
def MinimumCost(a, n, x): 
      
    # Re-compute the array 
    for i in range(1, n, 1): 
        a[i] = min(a[i], 2 * a[i - 1]) 
  
    ind = 0
  
    sum = 0
  
    # Add answers for set bits 
    while (x): 
          
        # If bit is set 
        if (x & 1): 
            sum += a[ind] 
  
        # Increase the counter 
        ind += 1
  
        # Right shift the number 
        x = x >> 1
  
    return sum
  
# Driver code 
if __name__ == '__main__': 
    a = [20, 50, 60, 90] 
    x = 7
    n = len(a) 
    print(MinimumCost(a, n, x)) 
  
# This code is contributed by 
# Surendra_Gangwar 

