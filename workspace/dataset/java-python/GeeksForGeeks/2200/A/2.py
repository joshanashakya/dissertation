

# Python3 implementation of the approach 
  
# Function to return the maximum count  
# of required elements 
def findMax(arr, n): 
    res = 0
      
    # For every element in the array starting  
    # from the second element 
    for i in range(1, n): 
          
        # Check all the elements on the left  
        # of current element which are divisible  
        # by the current element 
        count = 0
        for j in range(0, i): 
            if arr[j] % arr[i] == 0: 
                count += 1
        res = max(count, res) 
    return res 
  
# Driver code 
arr = [8, 1, 28, 4, 2, 6, 7] 
n = len(arr) 
print(findMax(arr, n)) 

