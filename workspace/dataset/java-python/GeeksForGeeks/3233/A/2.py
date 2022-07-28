

# Python 3 implementation to find distinct 
# powers of N that add up to K 
  
from math import pow
  
# Function to return the highest power 
# of N not exceeding K 
def highestPower(n,k): 
    i = 0
    a = pow(n, i) 
  
    # Loop to find the highest power 
    # less than K 
    while (a <= k): 
        i += 1
        a = pow(n, i) 
    return i - 1
  
# Initializing the PowerArray 
# with all 0's. 
b = [0 for i in range(50)] 
  
# Function to print 
# the distinct powers of N 
# that add upto K 
def PowerArray(n, k): 
    while (k): 
        # Getting the highest 
        # power of n before k 
        t = highestPower(n, k) 
  
        # To check if the power 
        # is being used twice or not 
        if (b[t]): 
            # Print -1 if power 
            # is being used twice 
            print(-1) 
            return 0
  
        else: 
            # If the power is not visited, 
            # then mark the power as visited 
            b[t] = 1
  
        # Decrementing the value of K 
        k -= pow(n, t) 
  
    # Printing the powers of N 
    # that sum up to K 
    for i in range(50): 
        if (b[i]): 
            print(i,end = ', ') 
  
# Driver code 
if __name__ == '__main__': 
    N = 3
    K = 40
    PowerArray(N, K) 
      
# This code is contributed by Surendra_Gangwar 

