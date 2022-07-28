

# Python 3 implementation of the approach 
  
# Function to generate a permutation  
# of integers from 1 to N such that the  
# absolute difference of all the two  
# consecutive integers give K distinct 
# integers 
def printPermutation(N, K): 
  
    # To store the permutation 
    res = list(); 
  
    l, r, flag = 1, N, 0
  
    for i in range(K): 
  
        if flag == False: 
              
            # For sequence 1 2 3... 
            res.append(l) 
            l += 1
      
        else: 
              
            # For sequence N, N-1, N-2... 
            res.append(r); 
            r -= 1; 
  
    # Flag is used to alternate between 
    # the above if else statements 
        flag = flag ^ 1; 
  
    # Taking integers with difference 1 
  
    # If last element added was r + 1 
    if flag == False: 
        for i in range(r, 2, -1): 
            res.append(i) 
  
    # If last element added was l - 1 
    else: 
        for i in range(l, r): 
            res.append(i) 
  
    # Print the permutation 
    for i in res: 
        print(i, end = " ") 
  
# Driver code 
N, K = 10, 4
printPermutation(N, K) 
  
# This code is contributed by 
# Mohit Kumar 29 

