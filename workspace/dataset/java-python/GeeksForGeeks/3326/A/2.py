

# Python3 program to find Maximum 
# number of partitions such that 
# we can get a sorted array. 
  
# Function to find maximum partitions. 
def maxPartitions(arr, n): 
  
    ans = 0; max_so_far = 0
    for i in range(0, n):  
  
        # Find maximum in prefix arr[0..i] 
        max_so_far = max(max_so_far, arr[i]) 
  
        # If maximum so far is equal to  
        # index, we can make a new partition  
        # ending at index i. 
        if (max_so_far == i): 
            ans += 1
      
    return ans 
  
# Driver code 
arr = [1, 0, 2, 3, 4]  
n = len(arr) 
print(maxPartitions(arr, n)) 
  
# This code is contributed by Smitha Dinesh Semwal. 

