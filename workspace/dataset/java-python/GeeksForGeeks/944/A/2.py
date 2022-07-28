

# Python3 implementation of the approach 
from math import gcd as __gcd 
  
maxLen = 30
  
# Array to store segment-tree 
seg = [0 for i in range(3 * maxLen)] 
  
# Function to build segment-tree to 
# answer range GCD queries 
def build(l, r, inn, arr): 
      
    # Base-case 
    if (l == r): 
        seg[inn] = arr[l] 
        return seg[inn] 
  
    # Mid element of the range 
    mid = (l + r) // 2
  
    # Merging the result of  
    # left and right sub-tree 
    seg[inn] = __gcd(build(l, mid, 
                           2 * inn + 1, arr),  
                     build(mid + 1, r,  
                           2 * inn + 2, arr)) 
  
    return seg[inn] 
  
# Function to perform range GCD queries 
def query(l, r, l1, r1, inn): 
      
    # Base-cases 
    if (l1 <= l and r <= r1): 
        return seg[inn] 
    if (l > r1 or r < l1): 
        return 0
  
    # Mid-element 
    mid = (l + r) // 2
  
    # Calling left and right child 
    x=__gcd(query(l, mid, l1, r1, 
                  2 * inn + 1),  
            query(mid + 1, r, l1, r1, 
                  2 * inn + 2)) 
    return x 
  
# Function to find the required length 
def findLen(arr, n): 
      
    # Buildinng the segment tree 
    build(0, n - 1, 0, arr) 
  
    # Two pointer variables 
    i = 0
    j = 0
  
    # To store the finnal answer 
    ans = 10**9
  
    # Loopinng 
    while (i < n): 
  
        # Incrementinng j till we  
        # don't get a gcd value of 1 
        while (j < n and query(0, n - 1, 
                               i, j, 0) != 1): 
            j += 1
  
        if (j == n): 
            break; 
  
        # Updatinng the finnal answer 
        ans = minn((j - i + 1), ans) 
  
        # Incrementinng i 
        i += 1
  
        # Updatinng j 
        j = max(j, i) 
  
    # Returninng the finnal answer 
    if (ans == 10**9): 
        return -1
    else: 
        return ans 
  
# Driver code 
arr = [2, 2, 2] 
n = len(arr) 
  
print(findLen(arr, n)) 
  
# This code is contributed by Mohit Kumar 

