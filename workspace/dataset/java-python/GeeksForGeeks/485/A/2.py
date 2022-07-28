

# Python3 implementation of the approach 
  
# Function to return the count of sub-arrays 
# such that the average of elements present 
# in the sub-array is greater than the 
# average of the elements not present 
# in the sub-array 
def countSubarrays(a, n): 
      
    # Initialize the count variable 
    count = 0
  
    # Initialize prefix sum array 
    pre = [0 for i in range(n + 1)] 
  
    # Preprocessing prefix sum 
    for i in range(1, n + 1): 
        pre[i] = pre[i - 1] + a[i - 1] 
  
    for i in range(1, n + 1): 
        for j in range(i, n + 1): 
  
            # Calculating sum and count 
            # to calculate averages 
            sum1 = pre[j] - pre[i - 1] 
            count1 = j - i + 1
            sum2 = pre[n] - sum1 
  
            if n-count1 == 0: 
                count2 = 1
            else: 
                count2 = n - count1 
  
            # Calculating averages 
            includ = sum1 // count1 
            exclud = sum2 // count2 
  
            # Increment count if including avg 
            # is greater than excluding avg 
            if (includ > exclud): 
                count += 1
          
    return count 
  
# Driver code 
arr = [6, 3, 5 ] 
n = len(arr) 
print(countSubarrays(arr, n)) 
  
# This code is contributed by mohit kumar 

