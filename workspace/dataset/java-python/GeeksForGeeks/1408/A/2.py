

# Python3 implementation of the approach 
  
# Function to return the summ of the elements 
# of all possible pairs from the array 
def summPairs(arr, n): 
  
    # To store the required summ 
    summ = 0
  
    # Nested loop for all possible pairs 
    for i in range(n): 
        for j in range(n): 
  
            # Add the summ of the elements 
            # of the current pair 
            summ += (arr[i] + arr[j]) 
  
    return summ 
  
# Driver code 
arr = [1, 2, 3] 
n = len(arr) 
  
print(summPairs(arr, n)) 
  
# This code is contributed by Mohit Kumar 

