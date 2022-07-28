

# Python 3 implementation of the approach 
  
# Function to return the minimum 
# operations required 
def minOperations(n, m): 
    if (m % n != 0): 
        return -1
  
    minOperations = 0
    q = int(m / n) 
  
    # Counting all 2s 
    while (q % 2 == 0): 
        q = int(q / 2) 
        minOperations += 1
  
    # Counting all 3s 
    while (q % 3 == 0): 
        q = int(q / 3) 
        minOperations += 1
  
    # If q contained only 2 and 3 
    # as the only prime factors 
    # then it must be 1 now 
    if (q == 1): 
        return minOperations 
  
    return -1
  
# Driver code 
if __name__ == '__main__': 
    n = 120
    m = 51840
    print(minOperations(n, m)) 
      
# This code is contributed by 
# Surendra_Gangwar 

