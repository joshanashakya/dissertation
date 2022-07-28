

# Python3 program to find the Smallest number 
# with given sum of digits and 
# sum of square of digits 
  
dp=[[-1 for i in range(8101)]for i in range(901)] 
  
# Top down dp to find minimum number of digits with 
# given sum of dits a and sum of square of digits as b 
def minimumNumberOfDigits(a,b): 
    # Invalid condition  
    if (a > b or a < 0 or b < 0 or a > 900 or b > 8100): 
        return -1
          
    # Number of digits satisfied 
    if (a == 0 and b == 0): 
        return 0
          
    # Memoization 
    if (dp[a][b] != -1): 
        return dp[a][b] 
          
    # Initialize ans as maximum as we have to find the 
    # minimum number of digits 
    ans = 101
      
    #Check for all possible combinations of digits 
    for i in range(9,0,-1): 
          
        # recurrence call 
        k = minimumNumberOfDigits(a - i, b - (i * i)) 
          
        # If the combination of digits cannot give sum as a 
        # and sum of square of digits as b  
        if (k != -1): 
            ans = min(ans, k + 1) 
              
    # Returns the minimum number of digits 
    dp[a][b] = ans 
    return ans 
  
# Function to print the digits that gives 
# sum as a and sum of square of digits as b 
def printSmallestNumber(a,b): 
    # initialize the dp array as 
    for i in range(901): 
        for j in range(8101): 
            dp[i][j]=-1
              
    # base condition 
    dp[0][0] = 0
      
    # function call to get the minimum number of digits 
    k = minimumNumberOfDigits(a, b) 
      
    # When there does not exists any number 
    if (k == -1 or k > 100): 
        print(-1,end='') 
    else: 
        # Printing the digits from the most significant digit 
          
        while (a > 0 and b > 0): 
              
            # Trying all combinations 
            for i in range(1,10): 
                  
                #checking conditions for minimum digits 
                if (a >= i and b >= i * i and
                    1 + dp[a - i][b - i * i] == dp[a][b]): 
                    print(i,end='') 
                    a -= i 
                    b -= i * i 
                    break
# Driver Code 
if __name__=='__main__': 
    a = 18
    b = 162
# Function call to print the smallest number 
    printSmallestNumber(a,b) 
      
# This code is contributed by sahilshelangia 

