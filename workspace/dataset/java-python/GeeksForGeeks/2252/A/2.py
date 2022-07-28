

# Python3 implementation of the approach 
  
# Function to return the total number  
# of ways to reach the n'th stair 
def countWays(n, arr): 
      
    # To store the number of ways  
    # to reach the ith stair 
    count = [0] * (n + 1) 
    count[0] = 1
      
    # Base case 
    if (n == 0): 
        return 1
      
    # For every stair 
    for i in range(1, n + 1): 
          
        # To store the count of ways  
        # till the current stair 
        no_ways = 0
          
        # Every step from the array 
        for j in arr: 
              
            # Here consider only 
            # the values of "i - arr[j]" >= 0 
            # because negative values 
            # indicates reverse climbing 
            # of steps 
            if (i - j >= 0): 
                no_ways += count[i - j] 
            count[i] = no_ways 
  
    return count[n] 
  
# Driver code 
arr = [1, 3, 5] 
n = 5
print(countWays(n, arr)) 

