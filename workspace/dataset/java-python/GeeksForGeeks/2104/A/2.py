

# Python3 program to find the minimum  
# number of operations required to sum to N  
  
# Function to return the minimum  
# operations required to sum to a  
# number reprented by the binary string S  
def findMinOperations(S) : 
  
    # Reverse the string to consider  
    # it from LSB to MSB  
    S = S[: : -1] 
    n = len(S)  
  
    # initialise the dp table  
    dp = [[0] * 2] * (n + 1) 
  
    # If S[0] = '0', there is no need  
    # to perform any operation  
    if (S[0] == '0') : 
        dp[0][0] = 0
      
    else : 
          
        # If S[0] = '1', just perform a  
        # single operation(i.e Add 2^0)  
        dp[0][0] = 1
      
    # Irrespective of the LSB, dp[0][1] is  
    # always 1 as there is always the need  
    # of making the suffix of the binary  
    # string of the form "11....1" as  
    # suggested by the definition of dp[i][1]  
    dp[0][1] = 1
  
    for i in range(1, n) :  
          
        if (S[i] == '0') : 
  
            # Transition from dp[i - 1][0]  
            dp[i][0] = dp[i - 1][0] 
  
            """  
            1. Transition from dp[i - 1][1]  
                by just doing 1 extra operation 
                of subtracting 2^i  
            2. Transition from dp[i - 1][0] by  
                just doing 1 extra operation of 
                subtracting 2^(i+1)  
            """
            dp[i][1] = 1 + min(dp[i - 1][1],  
                               dp[i - 1][0]) 
          
        else : 
  
            # Transition from dp[i - 1][1]  
            dp[i][1] = dp[i - 1][1];  
  
            """  
            1. Transition from dp[i - 1][1] by  
                just doing 1 extra operation  
                of adding 2^(i+1)  
            2. Transition from dp[i - 1][0] by  
                just doing 1 extra operation 
                of adding 2^i  
            """
            dp[i][0] = 1 + min(dp[i - 1][0],  
                               dp[i - 1][1]) 
  
    return dp[n - 1][0] 
  
# Driver Code  
if __name__ == "__main__" : 
      
    S = "100"
    print(findMinOperations(S)) 
  
    S = "111";  
    print(findMinOperations(S))  
  
# This code is contributed by Ryuga 

