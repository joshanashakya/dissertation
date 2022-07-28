

# Python 3 implementation of the approach 
MAXN = 30
  
# Function to return the length of longest 
# contiguous string containing only 4’s from 
# the first N characters of the string 
def countMaxLength(N): 
      
    # Initialize result 
    # Initialize prefix sum array of 
    # characters and product variable 
    pre = [0 for i in range(MAXN)] 
    p = 1
  
    # Preprocessing of prefix sum array 
    pre[0] = 0
    for i in range(1, MAXN, 1): 
        p *= 2
        pre[i] = pre[i - 1] + i * p 
  
    # Initialize variable to store the 
    # string length where N belongs to 
  
    # Finding the string length where 
    # N belongs to 
    for i in range(1, MAXN, 1): 
        if (pre[i] >= N): 
            ind = i 
            break
  
    x = N - pre[ind - 1] 
    y = 2 * ind - 1
  
    if (x >= y): 
        res = min(x, y) 
    else: 
        res = max(x, 2 * (ind - 2) + 1) 
    return res 
  
# Driver Code 
if __name__ == '__main__': 
    N = 25
    print(countMaxLength(N)) 
  
# This code is contributed by 
# Surendra_Gangwar 

