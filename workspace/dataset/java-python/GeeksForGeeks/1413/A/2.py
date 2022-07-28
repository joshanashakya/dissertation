

import sys     
  
# Function to find minimum XOR pair 
def minXOR(arr, n): 
      
    # Sort given array 
    arr.sort() 
   
    minXor =  int(sys.float_info.max) 
    val = 0
   
    # calculate min xor of consecutive pairs 
    for i in range(0,n-1): 
        val = arr[i] ^ arr[i + 1]; 
        minXor = min(minXor, val); 
      
    return minXor 
  
# Driver program 
arr = [9, 5, 3] 
n = len(arr) 
print(minXOR(arr, n)) 
   
# This code is contributed by Sam007. 

