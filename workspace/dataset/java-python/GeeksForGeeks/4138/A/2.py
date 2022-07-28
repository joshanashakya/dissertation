

# Python3 Program to count strings with 
# adjacent characters.  
def countStrs(n): 
  
    # Initializing arr[n+1][27] to 0  
    dp = [[0 for j in range(27)]  
             for i in range(n + 1)] 
  
    # Initialing 1st row all 1 from 0 to 25 
    for i in range(0, 26): 
        dp[1][i] = 1
  
    # Begin evaluating from i=2 since  
    # 1st row is set      
    for i in range(2, n + 1): 
        for j in range(0, 26): 
  
            # j=0 is 'A' which can make strings  
            # of length i using strings of length  
            # i-1 and starting with 'B'  
            if(j == 0): 
                dp[i][j] = dp[i - 1][j + 1]; 
            else: 
                dp[i][j] = (dp[i - 1][j - 1] +
                            dp[i - 1][j + 1]) 
  
    # Our result is sum of last row.          
    sum = 0
    for i in range(0, 26): 
        sum = sum + dp[n][i] 
  
    return sum
      
# Driver's Code  
if __name__ == "__main__": 
    n = 3
    print("Total strings are : ", countStrs(n)) 
      
# This code is contributed by Sairahul Jella 

