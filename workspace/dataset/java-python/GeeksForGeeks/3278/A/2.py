

# Python3 implementation of the approach 
  
MAX = 1001
prefix = [[0 for i in range(MAX)]  
             for j in range(MAX)] 
ar = [0 for i in range(MAX)] 
  
# Function to calculate the prefix 
def cal_prefix(n, arr): 
      
    # Creating one based indexing 
    for i in range(n): 
        ar[i + 1] = arr[i] 
  
    # Initilizing and creating prefix array 
    for i in range(1, 1001, 1): 
        for j in range(n + 1): 
            prefix[i][j] = 0
  
        for j in range(1, n + 1): 
              
            # Creating a prefix array for every 
            # possible value in a given range 
            if ar[j] <= i: 
                k = 1
            else: 
                k = 0
            prefix[i][j] = prefix[i][j - 1] + k 
  
# Function to return the kth largest element 
# in the index range [l, r] 
def ksub(l, r, n, k): 
    lo = 1
    hi = 1000
  
    # Binary searching through the 2d array 
    # and only checking the range in which 
    # the sub array is a part 
    while (lo + 1 < hi): 
        mid = int((lo + hi) / 2) 
        if (prefix[mid][r] - 
            prefix[mid][l - 1] >= k): 
            hi = mid 
        else: 
            lo = mid + 1
  
    if (prefix[lo][r] - 
        prefix[lo][l - 1] >= k): 
        hi = lo 
  
    return hi 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 4, 2, 3, 5, 7, 6] 
    n = len(arr) 
    k = 4
  
    # Creating the prefix array 
    # for the given array 
    cal_prefix(n, arr) 
  
    # Queries 
    queries = [[1, n, 1], 
               [2, n - 2, 2], 
               [3, n - 1, 3]] 
    q = len(queries) 
  
    # Perform queries 
    for i in range(q): 
        print(ksub(queries[i][0],  
                   queries[i][1], n, queries[i][2])) 
          
# This code is contributed by 
# Surendra_Gangwar 

