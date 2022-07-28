

# Python3 implementation 
dp = [[-1 for i in range(1001)] for j in range(1001)] 
  
# Function to return the maximum sum 
# divisible by k from elements of v 
def find_max(i, sum, v, k): 
    if (i == len(v)): 
        return 0
  
    if (dp[i][sum] != -1): 
        return dp[i][sum] 
  
    ans = 0
      
    # check if sum of elements excluding the 
    # current one is divisible by k 
    if ((sum + find_max(i + 1, sum, v, k)) % k == 0): 
        ans = find_max(i + 1, sum, v, k) 
      
    # check if sum of elements including the 
    # current one is divisible by k 
    if((sum + v[i] + find_max(i + 1,(sum + v[i]) % k, v, k)) % k == 0): 
          
        # Store the maximum 
        ans = max(ans, v[i] + find_max(i + 1,(sum + v[i]) % k, v, k)) 
      
    dp[i][sum] = ans 
  
    return dp[i][sum] 
  
# Driver code 
if __name__ == '__main__': 
    arr = [43, 1, 17, 26, 15] 
    k = 16
    print(find_max(0, 0, arr, k)) 
  
# This code is contributed by Surendra_Gangwar 

