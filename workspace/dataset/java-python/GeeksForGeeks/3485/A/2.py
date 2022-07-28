

# Python3 Program for the above approach 
  
# Function returns the minimum  
# cost of the array  
def getMinCost(arr, n): 
    min_ele = min(arr) 
    return min_ele * (n - 1) 
  
# Driver Code 
arr = [4, 2, 5] 
n = len(arr) 
print(getMinCost(arr, n)) 
  
# This code is contributed  
# by Shrikant13 

