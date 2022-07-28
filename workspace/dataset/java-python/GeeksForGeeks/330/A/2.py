

# Python3 implementation of the approach 
  
# Function to return the count 
# of possible subsets 
def cntSubsets(arr, n): 
  
    # Total possible subsets of n 
    # sized array is (2^n - 1) 
    max = pow(2, n) 
  
    # To store the required 
    # count of subsets 
    result = 0
  
    # Run from i 000..0 to 111..1 
    for i in range(max): 
        counter = i 
  
        # If current subset has consecutive 
        # elements from the array 
        if (counter & (counter >> 1)): 
            continue
        result += 1
  
    return result 
  
# Driver code 
arr = [3, 5, 7] 
n = len(arr) 
  
print(cntSubsets(arr, n)) 
  
# This code is contributed by Mohit Kumar 

