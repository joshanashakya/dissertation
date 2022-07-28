

# Python3 implementation of th approach  
import numpy as np 
N = 100
  
dp = np.zeros((N, 3));  
v = np.zeros((N, 3)); 
  
# Function to return the number of  
# sub-sequences divisible by 3  
def findCnt(s, i, r) : 
  
    # Base-cases  
    if (i == len(s)) :  
          
        if (r == 0) : 
            return 1;  
        else : 
            return 0;  
  
    # If the state has been solved  
    # before then return its value  
    if (v[i][r]) : 
        return dp[i][r];  
  
    # Marking the state as solved  
    v[i][r] = 1;  
  
    # Recurrence relation  
    dp[i][r] = findCnt(s, i + 1, (r * 2 + 
                      (ord(s[i]) - ord('0'))) % 3) + \ 
               findCnt(s, i + 1, r);  
  
    return dp[i][r];  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "11";  
  
    print(findCnt(s, 0, 0) - 1);  
  
# This code is contributed by AnkitRai01 

