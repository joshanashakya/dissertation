

# Python3 implementation of the approach 
from math import gcd 
  
# Function to return the required count  
def cntSubArr(arr, n) : 
  
    # To store the final answer  
    ans = 0;  
  
    for i in range(n) : 
  
        # To store the GCD starting from  
        # index 'i'  
        curr_gcd = 0;  
  
        # Loop to find the gcd of each subarray  
        # from arr[i] to arr[i...n-1]  
        for j in range(i, n) : 
            curr_gcd = gcd(curr_gcd, arr[j]);  
  
            # Increment the count if curr_gcd = 1  
            ans += (curr_gcd == 1); 
  
    # Return the final answer  
    return ans;  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 1, 1, 1 ];  
    n = len(arr);  
  
    print(cntSubArr(arr, n));  
  
# This code is contributed by AnkitRai01 

