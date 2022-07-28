

# Python3 implementation of above approach 
  
# Function to print the maximum intersection  
def max_intersection(center, length, k):  
  
    center.sort();  
  
    # Case 1  
    if (center[2] - center[0] >= 2 * k + length): 
        return 0;  
  
    # Case 2  
    elif (center[2] - center[0] >= 2 * k): 
        return (2 * k - (center[2] - center[0] - length));  
  
    # Case 3  
    else: 
        return length;  
  
# Driver Code  
center = [1, 2, 3];  
L = 1;  
K = 1;  
print(max_intersection(center, L, K));  
  
# This code is contributed 
# by mits 

