

# Python3 implementation of the above approach  
from collections import defaultdict 
  
# Function to find the maximum sum  
def maxValue(a, n):  
   
    first = defaultdict(lambda:0) 
    last = defaultdict(lambda:0) 
      
    pr = [None] * n  
    pr[0] = a[0]  
    
    for i in range(1, n):   
    
        # Build prefix sum array  
        pr[i] = pr[i - 1] + a[i]  
    
        # If the value hasn't been encountered before,  
        # It is the first occurrence  
        if first[a[i]] == 0:  
            first[a[i]] = i  
    
        # Keep updating the last occurrence  
        last[a[i]] = i  
       
    
    ans = 0 
    
    # Find the maximum sum with same first and last value  
    for i in range(0, n):   
        start = first[a[i]]  
        end = last[a[i]]  
        ans = max(ans, pr[end] - pr[start - 1])  
       
    return ans  
   
    
# Driver Code  
if __name__ == "__main__":  
   
    arr =  [1, 3, 5, 2, 4, 18, 2, 3]   
    n = len(arr)  
    
    print(maxValue(arr, n))  
    
# This code is contributed by Rituraj Jain 

