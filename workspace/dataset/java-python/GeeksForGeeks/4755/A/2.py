

# Python3 implementation of the approach 
  
# Function that returns true if n is a 
# power of 2 i.e. n has only 1 set bit 
def is_power_of_two(n): 
  
    return 0 if(n & (n - 1)) else 1; 
  
# Function to return the count 
# of all valid sub-arrays 
def countSubArrays(arr, n): 
  
    # To store the count of valid sub-arrays 
    cnt = 0; 
  
    for j in range(n): 
        xorval = 0; 
        for k in range(j, n): 
  
            # num = 2 ^ arr[k] 
            num = 1 << arr[k]; 
            xorval ^= num; 
  
            # If frequency of all the elements of the 
            # sub-array is even or there is only a 
            # single element with odd frequency 
            if (xorval == 0 or is_power_of_two(xorval)): 
                cnt += 1; 
  
    # Return the required count 
    return cnt; 
  
# Driver code 
arr = [ 1, 2, 3, 1, 2, 3, 4 ]; 
n = len(arr); 
print(countSubArrays(arr, n)); 
  
# This code is contributed by mits 

