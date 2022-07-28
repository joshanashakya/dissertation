

# Python3 implementation of the approach 
  
# Function to return the row and 
# the column of the given integer 
def solve(n): 
  
    low = 1
    high = 10**4
    x, p = n, 0
  
    # Binary search for the row number 
    while (low <= high): 
        mid = (low + high) // 2
        sum = (mid * (mid + 1)) // 2
  
        # Condition to get the maximum 
        # x that satisfies the criteria 
        if (x - sum >= 1): 
            p = mid 
            low = mid + 1
        else : 
            high = mid - 1
  
    start, end, y, q = 1, 10**4, 1, 0
  
    # Binary search for the column number 
    while (start <= end): 
        mid = (start + end) // 2
        sum = (mid * (mid + 1)) // 2
  
        # Condition to get the maximum 
        # y that satisfies the criteria 
        if (y + sum <= n): 
            q = mid 
            start = mid + 1
        else: 
            end = mid - 1
  
    # Get the row and the column number 
    x = x - (p * (p + 1)) // 2
    y = y + (q * (q + 1)) // 2
    r = x 
    c = q + 1 - n + y 
  
    # Return the pair 
    return r, c 
  
# Driver code 
n = 5
  
r, c = solve(n) 
print(r, c) 
  
# This code is contributed by Mohit Kumar 

