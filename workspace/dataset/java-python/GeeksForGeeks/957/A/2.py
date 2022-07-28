

# Simple Python3 program to count distinct  
# elements in every window of size k 
import math as mt  
  
# Counts distinct elements in window 
# of size k 
def countWindowDistinct(win, k): 
  
    dist_count = 0
  
    # Traverse the window 
    for i in range(k): 
          
        # Check if element arr[i] exists 
        # in arr[0..i-1] 
        j = 0
        while j < i: 
            if (win[i] == win[j]): 
                break
            else: 
                j += 1
        if (j == i): 
            dist_count += 1
      
    return dist_count 
  
  
# Counts distinct elements in all  
# windows of size k 
def countDistinct(arr, n, k): 
  
    # Traverse through every window 
    for i in range(n - k + 1): 
        print(countWindowDistinct(arr[i:k + i], k)) 
  
# Driver Code 
arr = [1, 2, 1, 3, 4, 2, 3] 
k = 4
n = len(arr) 
countDistinct(arr, n, k) 
  
# This code is contributed by  
# Mohit kumar 29 

