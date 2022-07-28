

# Python3 implementation of the approach  
import math 
  
# Function to return the total 
# number of required sub-sets  
def totalSubSets(n, l, r): 
      
    MOD = 1000000007 ; 
      
    # Variable to store total elements  
    # which on dividing by 3 give  
    # remainder 0, 1 and 2 respectively  
    zero = (math.floor(r / 3) - 
            math.ceil(l / 3) + 1);  
    one = (math.floor((r - 1) / 3) - 
           math.ceil((l - 1) / 3) + 1);  
    two = (math.floor((r - 2) / 3) - 
           math.ceil((l - 2) / 3) + 1);  
  
    # Create a dp table  
    dp = [[0 for x in range(3)]  
             for y in range(n)]  
              
    dp[0][0] = zero;  
    dp[0][1] = one;  
    dp[0][2] = two;  
  
    # Process for n states and store  
    # the sum (mod 3) for 0, 1 and 2  
    for i in range(1, n): 
  
        # Use of MOD for large numbers  
        dp[i][0] = ((dp[i - 1][0] * zero) + 
                    (dp[i - 1][1] * two) + 
                    (dp[i - 1][2] * one)) % MOD;  
        dp[i][1] = ((dp[i - 1][0] * one) + 
                    (dp[i - 1][1] * zero) + 
                    (dp[i - 1][2] * two)) % MOD;  
        dp[i][2] = ((dp[i - 1][0] * two)+ 
                    (dp[i - 1][1] * one) + 
                    (dp[i - 1][2] * zero)) % MOD;  
  
    # Final answer store at dp[n - 1][0]  
    return dp[n - 1][0]; 
  
# Driver Code 
n = 5;  
l = 10;  
r = 100;  
print(totalSubSets(n, l, r));  
      
# This code is contributed 
# by chandan_jnu 

