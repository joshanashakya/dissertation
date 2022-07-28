

# Python3 program to count the 
# Number of subarrays with  
# m odd numbers 
  
# function that returns the count  
# of subarrays with m odd numbers 
def countSubarrays(a, n, m): 
    count = 0; 
  
    # traverse for all 
    # possible subarrays 
    for i in range(n):  
        odd = 0; 
        for j in range(i, n):  
            if (a[j] % 2): 
                odd += 1; 
  
            # if count of odd numbers  
            # in subarray is m 
            if (odd == m): 
                count += 1; 
    return count; 
  
# Driver Code 
a = [ 2, 2, 5, 6, 9, 2, 11 ]; 
n = len(a); 
m = 2; 
  
print(countSubarrays(a, n, m)); 
  
# This code is contributed by mits 

