

# Python3 program to count the Number  
# of subarrays with m odd numbers  
# O(N) approach  
  
# function that returns the count  
# of subarrays with m odd numbers  
def countSubarrays(a, n, m):  
    count = 0
    prefix = [0] * n  
    odd = 0
  
    # traverse in the array  
    for i in range(n): 
        prefix[odd] += 1
  
        # if array element is odd  
        if (a[i] & 1):  
            odd += 1
  
        # when number of odd elements>=M  
        if (odd >= m):  
            count += prefix[odd - m]  
  
    return count  
      
# Driver Code  
a = [2, 2, 5, 6, 9, 2, 11] 
n = len(a)  
m = 2
  
print(countSubarrays(a, n, m)) 
  
# This code is contributed 29Ajaykumar 

