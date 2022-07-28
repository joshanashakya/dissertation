

# Python 3 implementation of the  
# above approach 
MAXN = 10000000
  
# Function to find the minimum  
# number of steps 
def minimumSteps(n, m, a, b): 
      
    # If n exceeds M 
    if (n > m): 
        return MAXN 
  
    # If N reaches the target 
    if (n == m): 
        return 0
  
    # The minimum of both the states 
    # will be the answer 
    return min(1 + minimumSteps(n * a, m, a, b),  
               1 + minimumSteps(n * b, m, a, b)) 
  
# Driver code 
if __name__ == '__main__': 
    n = 120
    m = 51840
    a = 2
    b = 3
    print(minimumSteps(n, m, a, b)) 
  
# This code is contributed by 
# Surendra_Gangwar 

