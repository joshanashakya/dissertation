

# Python3 implementation of the  
# above approach 
  
# Function to find the sum 
# of minimum of all subsequence 
def findMinSum(arr, n): 
  
    occ = n - 1
    Sum = 0
    for i in range(n): 
        Sum += arr[i] * pow(2, occ) 
        occ -= 1
      
    return Sum
  
# Driver code 
arr = [1, 2, 4, 5] 
n = len(arr) 
  
print(findMinSum(arr, n)) 
  
# This code is contributed  
# by mohit kumar 

