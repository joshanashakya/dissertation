

# Python implementation of the approach 
MAX = 26; 
  
# Function to return the minimum 
# operations required 
def minOperation(str, len): 
  
    # To store the first and the last 
    # occurrence of all the characters 
    first, last = [0] * MAX, [0] * MAX; 
  
    # Set the first and the last occurrence 
    # of all the characters to -1 
    for i in range(MAX): 
        first[i] = -1; 
        last[i] = -1; 
  
    # Update the occurrences of the characters 
    for i in range(len): 
  
        index = (ord(str[i]) - ord('a')); 
  
        # Only set the first occurrence if 
        # it hasn't already been set 
        if (first[index] == -1): 
            first[index] = i; 
  
        last[index] = i; 
  
    # To store the minimum operations 
    minOp = -1; 
  
    for i in range(MAX): 
  
        # If the frequency of the current 
        # character in the string 
        # is less than 2 
        if (first[i] == -1 or first[i] == last[i]): 
            continue; 
  
        # Count of characters to be 
        # removed so that the string 
        # starts and ends at the 
        # current character 
        cnt = len - (last[i] - first[i] + 1); 
  
        if (minOp == -1 or cnt < minOp): 
            minOp = cnt; 
    return minOp; 
  
# Driver code 
str = "abcda"; 
len = len(str); 
  
print( minOperation(str, len)); 
  
# This code is contributed by 29AjayKumar 

