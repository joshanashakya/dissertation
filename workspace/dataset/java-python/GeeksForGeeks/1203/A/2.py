

# Python3 implementation of the approach  
import numpy as np 
  
MOD = (int)(1e9 + 7)  
  
# Function to find the count of integers  
# obtained by replacing '?' in a given  
# string such that formed integer  
# gives remainder 5 when it is divided by 13  
def modulo_13(s, n) : 
      
    dp = np.zeros((n + 1, 13)); 
      
    # Initialise  
    dp[0][0] = 1;  
  
    for i in range(n) :  
        for j in range(10) : 
            nxt = ord(s[i]) - ord('0');  
  
            # Place digit j at ? position  
            if (s[i] == '?') : 
                nxt = j;  
  
            # Get the remainder  
            for k in range(13) : 
                rem = (10 * k + nxt) % 13;  
                dp[i + 1][rem] += dp[i][k];  
                dp[i + 1][rem] %= MOD;  
          
            if (s[i] != '?') : 
                break;  
  
    # Return the required answer  
    return int(dp[n][5]);  
  
# Driver code  
if __name__ == "__main__" :  
    s = "?44";  
    n = len(s);  
  
    print(modulo_13(s, n));  
  
# This code is contributed by AnkitRai01 

