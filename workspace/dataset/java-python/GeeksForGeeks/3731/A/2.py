

# Python3 implementation of the approach 
  
# Function to perform the given queries 
def performQueries(A, q): 
  
    n = len(A) 
      
    # To store the cumulative xor 
    pref_xor = [0 for i in range(n + 1)] 
  
    # Taking cumulative Xor 
    for i in range(1, n + 1): 
        pref_xor[i] = pref_xor[i - 1] ^ A[i - 1] 
  
    # Iterating over the queries 
    for i in q: 
        L = i[0] 
        R = i[1] 
        if (L > R): 
            L, R = R, L 
  
        # If both indices are different and  
        # xor in the range [L, R] is 0 
        if (L != R and 
            pref_xor[R] == pref_xor[L - 1]): 
            print("Yes") 
        else: 
            print("No") 
  
# Driver code 
Arr = [1, 1, 2, 2, 1] 
  
q = [[ 1, 5 ], 
     [ 1, 4 ], 
     [ 3, 4 ]] 
  
performQueries(Arr, q); 
  
# This code is contributed by Mohit Kumar 

