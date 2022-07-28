

# Python program to find minimum 
# XOR value in an array. 
  
# Function to find minimum XOR pair 
def minXOR(arr, n): 
      
    # Sort given array 
    arr.sort(); 
  
    min_xor = 999999
    val = 0
  
    # calculate min xor of  
    # consecutive pairs 
    for i in range (0, n-1): 
        for j in range (i+1, n-1): 
              
            # update minimum xor value 
            # if required 
            val = arr[i] ^ arr[j] 
            min_xor = min(min_xor, val) 
    return min_xor 
  
# Driver program 
arr = [ 9, 5, 3 ] 
n = len(arr) 
  
print(minXOR(arr, n)) 
  
# This code is contributed by Sam007. 

