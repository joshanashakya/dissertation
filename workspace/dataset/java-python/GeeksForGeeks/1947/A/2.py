

# Python3 implementation of the approach 
  
# Function to sum of all subsets  
# of a given array 
c = [] 
ans = 0
  
def subsetSum(i, curr): 
    global ans, c 
      
    # Base case 
    if (i == len(c)): 
        ans += curr 
        return
  
    # Recursively calling subsetSum 
    subsetSum(i + 1, curr + c[i]) 
    subsetSum(i + 1, curr) 
  
# Function to generate the subsets 
def subsetGen(arr, i, n): 
    global ans, c 
      
    # Base-case 
    if (i == n): 
  
        # Finding the sum of all the subsets 
        # of the generated subset 
        subsetSum(0, 0) 
        return
  
    # Recursively accepting and rejecting 
    # the current number 
    subsetGen(arr, i + 1, n) 
    c.append(arr[i]) 
    subsetGen(arr, i + 1, n) 
    del c[-1] 
  
# Driver code 
arr = [1, 1] 
n = len(arr) 
  
subsetGen(arr, 0, n) 
  
print(ans) 
  
# This code is contributed by Mohit Kumar 

