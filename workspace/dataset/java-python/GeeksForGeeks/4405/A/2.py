

# Python3 implementation of the approach 
  
# Function to sort the array such that 
# negative values do not get affected 
def sortArray(a, n): 
  
    # Store all non-negative values 
    ans=[] 
    for i in range(n): 
        if (a[i] >= 0): 
            ans.append(a[i]) 
  
    # Sort non-negative values 
    ans = sorted(ans) 
  
    j = 0
    for i in range(n): 
  
        # If current element is non-negative then 
        # update it such that all the 
        # non-negative values are sorted 
        if (a[i] >= 0): 
            a[i] = ans[j] 
            j += 1
  
    # Print the sorted array 
    for i in range(n): 
        print(a[i],end = " ") 
  
  
# Driver code 
  
arr = [2, -6, -3, 8, 4, 1] 
  
n = len(arr) 
  
sortArray(arr, n) 
  
# This code is contributed by mohit kumar 29 

