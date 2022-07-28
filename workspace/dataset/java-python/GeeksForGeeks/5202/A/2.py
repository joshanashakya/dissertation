

# Python3 implementation of the approach 
  
# Function to find the farthest 
# smaller number in the right side 
def farthest_min(a, n): 
      
    # To store minimum element 
    # in the range i to n 
    suffix_min = [0 for i in range(n)] 
    suffix_min[n - 1] = a[n - 1] 
    for i in range(n - 2, -1, -1): 
        suffix_min[i] = min(suffix_min[i + 1], a[i]) 
  
    for i in range(n): 
        low = i + 1
        high = n - 1
        ans = -1
  
        while (low <= high): 
            mid = (low + high) // 2
  
            # If currnet element in the suffix_min 
            # is less than a[i] then move right 
            if (suffix_min[mid] < a[i]): 
                ans = mid 
                low = mid + 1
            else: 
                high = mid - 1
  
        # Print the required answer 
        print(ans, end = " ") 
  
# Driver code 
a = [3, 1, 5, 2, 4] 
n = len(a) 
  
farthest_min(a, n) 
  
# This code is contributed by Mohit Kumar 

