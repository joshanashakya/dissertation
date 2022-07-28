

# Python implementation of the approach 
import sys 
  
# Function to return the minimum 
# number of cubes whose sum is k 
def MinOfCubedDP(k): 
    DP = [0] * (k + 1); 
    j = 1; 
    t = 1; 
    DP[0] = 0; 
    for i in range(1, k + 1): 
        DP[i] = sys.maxsize; 
  
        # While current perfect cube 
        # is less than current element 
        while (j <= i): 
  
            # If i is a perfect cube 
            if (j == i): 
                DP[i] = 1; 
  
            # i = (i - 1) + 1^3 
            elif (DP[i] > DP[i - j]): 
                DP[i] = DP[i - j] + 1; 
  
            # Next perfect cube 
            t += 1; 
            j = t * t * t; 
  
        # Re-initialization for next element 
        t = j = 1; 
    return DP[k]; 
  
  
# Driver code 
num = 15; 
print(MinOfCubedDP(num)); 
  
# This code contributed by Rajput-Ji 

