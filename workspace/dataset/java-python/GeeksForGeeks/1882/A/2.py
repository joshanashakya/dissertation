

# Python3 implementation of the approach 
  
# Function to return the bitwise OR of 
# all the binary strings 
def strBitwiseOR(arr, n): 
    res="" 
    max_size = -(2**32) 
      
    # Get max size and reverse each string 
    # Since we have to perform OR operation 
    # on bits from right to left 
    # Reversing the string will make it easier 
    # to perform operation from left to right 
    for i in range(n): 
        max_size = max(max_size, len(arr[i])) 
        arr[i] = arr[i][::-1] 
      
    for i in range(n): 
          
        # Add 0s to the end of strings 
        # if needed 
        s = "" 
        for j in range(max_size - len(arr[i])): 
            s += '0'
          
        arr[i] = arr[i] + s 
          
    # Perform OR operation on each bit 
    for i in range(max_size): 
        curr_bit = 0
        for j in range(n): 
            curr_bit = curr_bit | ord(arr[j][i]) 
          
        res += chr(curr_bit) 
      
    # Reverse the resultant string 
    # to get the final string 
    res=res[::-1] 
  
    # Return the final string 
    return res 
  
  
# Driver code 
arr = ["10", "11", "1000001"] 
n = len(arr) 
print(strBitwiseOR(arr, n)) 
  
# This code is contributed by shubhamsingh10 

