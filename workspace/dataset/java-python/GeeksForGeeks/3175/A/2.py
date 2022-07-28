

# Python 3 implementation of the approach 
  
# Function that returns true if n 
# can be represented as the sum of 
# exactly k distinct positive integers 
def solve(n,k): 
    # If n can be represented as 
    # 1 + 2 + 3 + ... + (k - 1) + (k + x) 
    if (n >= (k * (k + 1)) // 2): 
        return True
  
    return False
  
# Driver code 
if __name__ == '__main__': 
    n = 12
    k = 4
  
    if (solve(n, k)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

