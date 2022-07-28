

# Python3 function to calculate the number of  
# ways to achieve sum x in n no of throws  
import numpy as np 
  
mod = 1000000007; 
  
dp = np.zeros((55,55));  
  
# Function to calculate recursively the  
# number of ways to get sum in given  
# throws and [1..m] values  
def NoofWays(face, throws, sum) :  
  
    # Base condition 1  
    if (sum == 0 and throws == 0) : 
        return 1;  
  
    # Base condition 2  
    if (sum < 0 or throws == 0) : 
        return 0;  
  
    # If value already calculated dont  
    # move into re-computation  
    if (dp[throws][sum] != -1) : 
        return dp[throws][sum];  
  
    ans = 0;  
    for i in range(1, face + 1) :  
  
        # Recusively moving for sum-i in  
        # throws-1 no of throws left  
        ans += NoofWays(face, throws - 1, sum - i);  
  
    # Inserting present values in dp  
    dp[throws][sum] = ans; 
      
    return ans; 
  
  
# Driver function  
if __name__ == "__main__" :  
  
    faces = 6; throws = 3; sum = 12;  
  
    for i in range(55) : 
        for j in range(55) : 
            dp[i][j] = -1
  
    print(NoofWays(faces, throws, sum)) ;  
      
# This code is contributed by AnkitRai01 

