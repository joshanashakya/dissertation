

# A DP based 
# Python 3  
# program to print 
# first n Tribinacci 
# numbers. 
  
def printTrib(n) : 
  
    dp = [0] * n 
    dp[0] = dp[1] = 0; 
    dp[2] = 1; 
  
    for i in range(3,n) : 
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]; 
  
    for i in range(0,n) : 
        print(dp[i] , " ", end="") 
          
  
# Driver code 
n = 10
printTrib(n) 
  
# This code is contributed by Nikita Tiwari. 

