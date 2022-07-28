

# Python 3 implementation of the approach 
  
# Function to find permutation(p)  
# of first N natural numbers such that  
# there are exactly K elements of  
# permutation such that GCD(p[i], i)>1 
def Permutation(n, k): 
    p = [0 for i in range(n + 1)] 
  
    # First place all the numbers 
    # in their respective places 
    for i in range(1, n + 1): 
        p[i] = i 
  
    # Modify for first n-k integers 
    for i in range(1, n - k): 
        p[i + 1] = i 
  
    # In first index place n-k 
    p[1] = n - k 
  
    # Print the permutation 
    for i in range(1, n + 1): 
        print(p[i], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    n = 5
    k = 2
    Permutation(n, k) 
      
# This code is contributed by 
# Surendra_Gangwar 

