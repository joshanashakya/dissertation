

# Python3 implementation of the approach  
MOD = 1000000007;  
  
# Function to return the number  
# of ways to reach the kth step  
def number_of_ways(arr, n, k) :  
  
    if (k == 1) : 
        return 1;  
  
    # Create the dp array  
    dp = [-1] * (k + 1);  
  
    # Broken steps  
    for i in range(n) : 
        dp[arr[i]] = 0;  
  
    dp[0] = 1;  
    dp[1] = 1 if (dp[1] == -1) else dp[1];  
  
    # Calculate the number of ways for  
    # the rest of the positions  
    for i in range(2, k + 1) :  
  
        # If it is a blocked position  
        if (dp[i] == 0) : 
            continue;  
  
        # Number of ways to get to the ith step  
        dp[i] = dp[i - 1] + dp[i - 2];  
  
        dp[i] %= MOD;  
      
    # Return the required answer  
    return dp[k];  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 3 ];  
    n = len(arr);  
    k = 6;  
  
    print(number_of_ways(arr, n, k));  
  
# This code is contributed by kanugargng 

