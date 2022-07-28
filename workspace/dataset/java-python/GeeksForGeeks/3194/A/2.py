

# Python3 implementation of the approach 
  
# Function to return Xor in a range 
# of a binary array 
def xorRange(pre, l, r): 
  
    # To store the count of 1s 
    cntOnes = pre[r] 
    if (l - 1 >= 0): 
        cntOnes -= pre[l - 1] 
  
    # If number of ones are even 
    if (cntOnes % 2 == 0): 
        return 0
  
    # If number of ones are odd 
    else: 
        return 1
  
# Function to perform the queries 
def performQueries(queries, q, a, n): 
      
    # To store prefix sum 
    pre = [0 for i in range(n)] 
  
    # pre[i] stores the number of 
    # 1s from pre[0] to pre[i] 
    pre[0] = a[0] 
    for i in range(1, n): 
        pre[i] = pre[i - 1] + a[i] 
  
    # Perform queries 
    for i in range(q): 
        print(xorRange(pre, queries[i][0],  
                            queries[i][1])) 
  
# Driver code 
a = [ 1, 0, 1, 1, 0, 1, 1 ] 
n = len(a) 
  
# Given queries 
queries = [[ 0, 3 ], [ 0, 2 ]] 
q = len(queries) 
  
performQueries(queries, q, a, n) 
  
# This code is contributed by Mohit Kumar 

