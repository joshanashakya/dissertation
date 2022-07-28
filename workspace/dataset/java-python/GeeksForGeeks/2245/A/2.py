

# Python3 program to count the ways 
# to break the array in 3 equal parts 
# having equal sum. 
  
# Function to count the no of ways 
def countways(a, n): 
  
    cnt = [0 for i in range(n)] 
    s = 0
  
    # Calculating the sum of the array 
    # and storing it in variable s 
    s = sum(a) 
  
    # Checking s is divisible by 3 or not 
    if (s % 3 != 0): 
        return 0
  
    # Calculating the sum of each part 
    s //= 3
  
    ss = 0
  
    # If the sum of elements from i-th  
    # to n-th equals to sum of part  
    # putting 1 in cnt array otherwise 0. 
    for i in range(n - 1, -1, -1): 
  
        ss += a[i] 
        if (ss == s): 
            cnt[i] = 1
  
    # Calculating the cumulative sum 
    # of the array cnt from the last index. 
    for i in range(n - 2, -1, -1): 
        cnt[i] += cnt[i + 1] 
  
    ans = 0
    ss = 0
  
    # Calculating answer using original 
    # and cnt array. 
    for i in range(0, n - 2): 
        ss += a[i] 
        if (ss == s): 
            ans += cnt[i + 2] 
  
    return ans 
  
# Driver Code 
n = 5
a = [1, 2, 3, 0, 3] 
print(countways(a, n)) 
  
# This code is contributed  
# by mohit kumar 

