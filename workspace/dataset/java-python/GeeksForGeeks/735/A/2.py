

# Python3 implementation of above approach  
  
dp = [0]*1024;  
  
# Function to create mask for every number  
def get_binary(u) :  
  
    ans = 0;  
    while (u) : 
        rem = u % 10;  
        ans |= (1 << rem);  
        u //= 10;  
    return ans;  
  
  
# Recursion for Filling DP array  
def recur(u, array, n) :  
  
    # Base Condition  
    if (u == 0) : 
        return 0;  
          
    if (dp[u] != -1) :  
        return dp[u];  
  
    temp = 0;  
    for i in range(n) :  
        mask = get_binary(array[i]);  
  
        # Recurrence Relation  
        if ((mask | u) == u) : 
            dp[u] = max(max(0, dp[u ^ mask]) + array[i], dp[u]);  
  
    return dp[u];  
  
  
# Function to find Maximum Subset Sum  
def solve(array, n)  : 
    i = 0
      
    # Initialize DP array  
    while(i < (1 << 10)) : 
        dp[i] = -1; 
        i += 1
      
    ans = 0;  
  
    i = 0
    # Iterate over all possible masks of 10 bit number 
    while(i < (1 << 10)) : 
        ans = max(ans, recur(i, array, n)); 
          
        i += 1
      
    return ans;  
  
# Driver Code  
if __name__ ==  "__main__" :  
  
    array = [ 22, 132, 4, 45, 12, 223 ] ;  
    n = len(array);  
      
    print(solve(array, n));  
      
    # This code is contributed by AnkitRai01 

