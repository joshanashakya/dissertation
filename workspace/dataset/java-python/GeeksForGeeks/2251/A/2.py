

# Python3 implementation of the approach 
  
# Recursive function to return the 
# total ways to reach the n'th stair 
def countWays(n, arr): 
      
    # Base case 
    if (n == 0): 
        return 1
  
    # To store the number of ways 
    no_ways = 0
      
    # Iterate each element of the given array 
    for i in arr: 
          
        # Here consider only the values of 
        # "n - arr[i]" >= 0 because negative values 
        # of n in the stair function are 
        # not defined 
        if (n - i >= 0): 
            no_ways = no_ways + countWays(n - i, arr) 
    return no_ways 
  
# Driver code 
arr = [1, 3, 5] 
n = 5
print(countWays(n, arr)) 

