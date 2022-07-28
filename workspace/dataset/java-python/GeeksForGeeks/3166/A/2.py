

# Python3 implementation of the approach  
def operations(op, n, k): 
  
    i, count = 0, 0
  
    # To store the normalized value 
    # of all the operations 
    nVal = 0
  
    # Minimum possible value for 
    # a series of operations 
    minimum = 10**9
    for i in range(n): 
        nVal += op[i] 
        minimum = min(minimum , nVal) 
  
        # If k can be reduced with 
        # first (i + 1) operations 
        if ((k + nVal) <= 0): 
            return (i + 1) 
  
    # Impossible to reduce k 
    if (nVal >= 0): 
        return -1
  
    # Number of times all the operations 
    # can be performed on k without 
    # reducing it to <= 0 
    times = (k - abs(minimum )) // abs(nVal) 
  
    # Perform operations 
    k = (k - (times * abs(nVal))) 
    count = (times * n) 
  
    # Final check 
    while (k > 0): 
        for i in range(n): 
            k = k + op[i] 
            count += 1
            if (k <= 0): 
                break
  
    return count 
  
# Driver code 
op = [-60, 65, -1, 14, -25] 
n = len(op) 
k = 100000
  
print(operations(op, n, k)) 
  
# This code is contributed  
# by mohit kumar 

