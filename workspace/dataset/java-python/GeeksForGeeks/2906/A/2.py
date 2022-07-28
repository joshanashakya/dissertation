

# Python3 program to count ways to write  
# 'n' as sum of digits  
  
# Function to count 'num' as sum of  
# digits(1, 2, 3, 4)  
def countWays(num):  
  
    # Initialize dp[] array  
    dp = [0] * (num + 1);  
  
    MOD = 100000000 + 7;  
      
    # Base case  
    dp[1] = 2;  
  
    for i in range(2, num + 1): 
          
        # Initialize the current dp[]  
        # array as '0'  
        dp[i] = 0;  
  
        for j in range(1, 4):  
              
            # if i == j then there is only  
            # one way to write with element  
            # itself 'i'  
            if(i - j == 0): 
                dp[i] += 1;  
  
            # If j == 1, then there exist  
            # two ways, one from '1' and  
            # other from '4' 
            elif (j == 1): 
                dp[i] += dp[i - j] * 2;  
  
            # if i - j is positive then  
            # pick the element from 'i-j'  
            # element of dp[] array  
            elif(i - j > 0): 
                dp[i] += dp[i - j];  
  
        # Check for modulas  
        if(dp[i] >= MOD):  
            dp[i] %= MOD;  
  
    # return the final answer  
    return dp[num];  
  
# Driver code  
n = 3;  
print(countWays(n));  
  
# This code is contributed by mits 

