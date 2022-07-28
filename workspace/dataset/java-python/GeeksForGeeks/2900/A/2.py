

# Python3 program to find the length of the 
# longest increasing sub sequence from the  
# given array such that no two adjacent  
# elements are co prime 
N = 100005
  
# Function to find the length of the 
# longest increasing sub sequence from  
# the given array such that no two  
# adjacent elements are co prime 
def LIS(a, n): 
      
    # To store dp and d value 
    dp = [0 for i in range(N)] 
    d = [0 for i in range(N)] 
  
    # To store required answer 
    ans = 0
  
    # For all elements in the array 
    for i in range(n): 
          
        # Initially answer is one 
        dp[a[i]] = 1
  
        # For all it's divisors 
        for j in range(2, a[i]): 
            if j * j > a[i]: 
                break
            if (a[i] % j == 0): 
                  
                # Update the dp value 
                dp[a[i]] = max(dp[a[i]],  
                               dp[d[j]] + 1) 
                dp[a[i]] = max(dp[a[i]],  
                               dp[d[a[i] // j]] + 1) 
  
                # Update the divisor value 
                d[j] = a[i] 
                d[a[i] // j] = a[i] 
  
        # Check for required answer 
        ans = max(ans, dp[a[i]]) 
  
        # Update divisor of a[i] 
        d[a[i]] = a[i] 
  
    # Return reqired answer 
    return ans 
  
# Driver code 
a = [1, 2, 3, 4, 5, 6] 
  
n = len(a) 
  
print(LIS(a, n)) 
  
# This code is contributed by mohit kumar 

