

# Python3 Implementation of the above approach 
import numpy as np; 
import sys 
  
dp = np.zeros((1000,1000)) ;  
  
INT_MAX = sys.maxsize; 
  
# Checking for prime  
def isprime(num) :  
  
    if (num <= 1) : 
        return False;  
    for i in range(2, int(num ** (1/2)) + 1) : 
        if (num % i == 0) : 
            return False;  
    return True;  
  
# Conversion of string to int  
def convert(s, i, j) :  
  
    temp = 0;  
    for k in range(i, j + 1) :  
        temp = temp * 10 + (ord(s[k]) - ord('0'));  
  
    return temp;  
  
# Function to get the minimum splits  
def solve(s, i, j) :  
  
    # Convert the segment to integer or long long  
    num = convert(s, i, j);  
    # Number is prime  
    if (isprime(num)) : 
        return 0;  
  
    # If a single digit is prime  
    if (i == j and isprime(num)) : 
        return 0;  
  
    # If single digit is not prime  
    if (i == j and isprime(num) == False) : 
        return INT_MAX;  
  
    if (dp[i][j]) : 
        return dp[i][j];  
  
    ans = INT_MAX;  
      
    for k in range(i, j) :  
        # Recur for left segment  
        left = solve(s, i, k);  
        if (left == INT_MAX) : 
            continue;  
  
        # Recur for right segment  
        right = solve(s, k + 1, j);  
        if (right == INT_MAX) : 
            continue;  
      
        # Minimum from left and right segment  
        ans = min(ans, 1 + left + right);  
      
    dp[i][j] = ans;  
      
    return ans; 
  
# Driver code     
if __name__ == "__main__" :  
  
    s = "2352";  
    n = len(s);  
  
    cuts = solve(s, 0, n - 1);  
    if (cuts != INT_MAX) : 
        print(cuts);  
      
    else : 
        print("Not Possible");  
  
# This code is converted by Yash_R  

