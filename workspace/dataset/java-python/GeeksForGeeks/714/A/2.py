

# Python3 implementation of the approach  
  
import numpy as np 
  
MAX = 100000
bitscount = 32
  
# Array to store bit-wise  
# prefix count  
prefix_count = np.zeros((bitscount,MAX));  
  
# Function to find the prefix sum  
def findPrefixCount(arr, n) : 
  
    # Loop for each bit  
    for i in range(0, bitscount) : 
        # Loop to find prefix count  
        prefix_count[i][0] = ((arr[0] >> i) & 1);  
          
        for j in range(1, n) : 
            prefix_count[i][j] = ((arr[j] >> i) & 1);  
            prefix_count[i][j] += prefix_count[i][j - 1];  
  
# Function to answer query  
def rangeOr(l, r) :  
  
    # To store the answer  
    ans = 0;  
  
    # Loop for each bit  
    for i in range(bitscount) : 
          
        # To store the number of variables  
        # with ith bit set  
        x = 0;  
          
        if (l == 0) : 
            x = prefix_count[i][r];  
        else : 
            x = prefix_count[i][r] - prefix_count[i][l - 1];  
  
        # Condition for ith bit  
        # of answer to be set  
        if (x != 0) : 
            ans = (ans | (1 << i));  
              
    return ans;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 7, 5, 3, 5, 2, 3 ];  
    n = len(arr); 
  
    findPrefixCount(arr, n);  
  
    queries = [ [ 1, 3 ], [ 4, 5 ] ];  
      
    q = len(queries);  
  
    for i in range(q) : 
        print(rangeOr(queries[i][0], queries[i][1])); 
  
# This code is contributed by AnkitRai01 

