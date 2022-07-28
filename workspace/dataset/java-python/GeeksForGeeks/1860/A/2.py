

# Python implementation of the approach 
import sys 
  
# Function to return the minimum possible value 
# of |K - X| where X is the bitwise AND of 
# the elements of some sub-array 
def closetAND(arr, n, k): 
    ans = sys.maxsize; 
  
    # Check all possible sub-arrays 
    for i in range(n): 
  
        X = arr[i]; 
        for j in range(i,n): 
            X &= arr[j]; 
  
            # Find the overall minimum 
            ans = min(ans, abs(k - X)); 
  
            # No need to perform more AND operations 
            # as |k - X| will increase 
            if (X <= k): 
                break; 
    return ans; 
  
# Driver code 
arr = [4, 7, 10 ]; 
n = len(arr); 
k = 2; 
print(closetAND(arr, n, k)); 
  
# This code is contributed by PrinciRaj1992 

