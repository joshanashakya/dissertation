

# Python3 implementation of the approach 
  
# Function to return the count 
# of the required numbers 
def countNum(N, arr): 
  
    # To store the count of  
    # required numbers 
    count = 0
  
    for i in range(N): 
  
        # Initialize sum to 0 
        Sum = 0
        for j in range(N): 
  
            # If current element and the 
            # chosen element are same 
            if (i == j): 
                continue
  
            # Add all other numbers of array 
            else: 
                Sum += arr[j] 
  
        # If Sum is divisible by the  
        # chosen element 
        if (Sum % arr[i] == 0): 
            count += 1
      
    # Return the count 
    return count 
  
# Driver code 
arr = [3, 10, 4, 6, 7] 
n = len(arr) 
print(countNum(n, arr)) 
  
# This code is contributed 
# by Mohit Kumar 

