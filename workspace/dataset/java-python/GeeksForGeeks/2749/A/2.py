

# Python3 implementation of the approach 
import sys 
TEN = 10
  
# Function to return the minimum number 
# that can be formed after removing 
# the digits which is a multiple of 4 
def minNum(str, len1): 
    res = sys.maxsize 
  
    # For every digit of the number 
    for i in range(len1): 
          
        # Check if the current digit 
        # is divisible by 4 
        if (str[i] == '4' or str[i] == '8'): 
            res = min(res, ord(str[i]) - ord('0')) 
  
    for i in range(len1 - 1): 
        for j in range(i + 1, len1, 1): 
            num = (ord(str[i]) - ord('0')) * TEN + \ 
                  (ord(str[j]) - ord('0')) 
  
            # If any subsequence of two 
            # digits is divisible by 4 
            if (num % 4 == 0): 
                res = min(res, num) 
  
    if (res == sys.maxsize): 
        return -1
    else: 
        return res 
  
# Driver code 
if __name__ == '__main__': 
    str = "17"
    len1 = len(str) 
  
    print(minNum(str, len1)) 
      
# This code is contributed by Surendra_Gangwar 

