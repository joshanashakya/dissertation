

# Python 3 program for Minimum 
# splits in a string such that 
# substring is a power of 4 or 6. 
  
import sys 
  
# Function to find if given number 
# is power of another number or not. 
def isPowerOf(val, base): 
  
    # Divide given number repeatedly 
    # by base value.  
    while (val > 1): 
        if (val % base != 0): 
            return False # not a power  
        val //= base 
  
    return True
  
# Function to find minimum number of 
# partitions of given binary string 
# so that each partition is power of 4 or 6.  
def numberOfPartitions(binaryNo): 
  
    n = len(binaryNo) 
  
    # DP table to store results of 
    # partitioning done at differentindices. 
    dp = [0] * n 
  
    # If the last digit is 1, hence 4^0=1 and 6^0=1 
    if ((ord(binaryNo[n - 1]) - ord('0')) == 0) : 
        dp[n - 1] = -1
    else: 
        dp[n - 1] = 1
  
    # Fix starting position for partition 
    for i in range( n - 2, -1, -1): 
        val = 0
  
        # Binary representation 
        # with leading zeroes is not allowed.  
        if ((ord(binaryNo[i]) - ord('0')) == 0): 
            dp[i] = -1
            continue
  
        dp[i] = sys.maxsize 
  
        # Iterate for all different partitions starting from i 
        for j in range(i, n): 
  
            # Find integer value of current 
            # binary partition. 
            val = (val * 2) + (ord(binaryNo[j]) - ord('0')) 
  
            # Check if the value is a power of 4 or 6 or not 
            # apply recurrence relation 
            if (isPowerOf(val, 4) or isPowerOf(val, 6)): 
                if (j == n - 1): 
                    dp[i] = 1
                  
                else : 
                    if (dp[j + 1] != -1): 
                        dp[i] = min(dp[i], dp[j + 1] + 1) 
  
        # If no partitions are possible, then 
        # make dp[i] = -1 to represent this. 
        if (dp[i] == sys.maxsize): 
            dp[i] = -1
  
    return dp[0] 
  
# Driver code 
if __name__ == "__main__": 
      
    binaryNo = "100110110"
    print(numberOfPartitions(binaryNo)) 
      
# This code is contributed by Ita_c.     

