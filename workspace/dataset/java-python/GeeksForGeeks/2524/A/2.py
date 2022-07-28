

# Python3 implementation of the approach 
  
# Function to return the minimum number of 
# integers that need to be removed from the 
# array to form a sub-array with Sum k 
def FindMinNumber(arr, n, k): 
    i = 0
    j = 0
  
    # Stores the minimum number of 
    # integers that need to be removed 
    # from the array 
    min_num = 10**9
  
    found = False
  
    Sum = 0
  
    while (i < n): 
  
        Sum = Sum + arr[i] 
  
        # If current Sum is equal to 
        # k, update min_num 
        if (Sum == k): 
            min_num = min(min_num, 
                        ((n - (i + 1)) + j)) 
            found = True
          
        # If current Sum is greater than k 
        elif (Sum > k): 
  
            # Decrement the Sum until it 
            # becomes less than or equal to k 
            while (Sum > k): 
                Sum = Sum - arr[j] 
                j += 1
            if (Sum == k): 
                min_num = min(min_num,  
                            ((n - (i + 1)) + j)) 
                found = True
              
        i += 1
  
    if (found): 
        return min_num 
  
    return -1
  
# Driver code 
arr = [1, 3, 2, 5, 6] 
n = len(arr) 
k = 5
  
print(FindMinNumber(arr, n, k)) 
  
# This code is contributed by mohit kumar 

