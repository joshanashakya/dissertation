

# Python 3 implementation of the approach 
MAX = 10005
MOD = 1000000007
  
# Function to return the count of numbers 
# from the range [0, n] whose digit sum 
# is a multiple of k using bottom-up dp 
def countNum(idx, sum, tight, num, len1, k): 
    if (len1 == idx): 
        if (sum == 0): 
            return 1
        else: 
            return 0
    if (dp[idx][sum][tight] != -1): 
        return dp[idx][sum][tight] 
    res = 0
  
    # The digit in this index can 
    # only be from [0, num[idx]] 
    if (tight == 0): 
        limit = num[idx] 
  
    # The digit in this index can 
    # be anything from [0, 9] 
    else: 
        limit = 9
    for i in range(limit + 1): 
          
        # new_tight is the flag value 
        # for the next position 
        new_tight = tight 
        if (tight == 0 and i < limit): 
            new_tight = 1
        res += countNum(idx + 1,(sum + i) % k,  
                      new_tight, num, len1, k) 
        res %= MOD 
  
    # res can't be negative 
    if (res < 0): 
        res += MOD 
    dp[idx][sum][tight] = res 
    return dp[idx][sum][tight] 
  
# Function to process the string to 
# a vector of digits from MSD to LSD 
def process(s): 
    num = [] 
    for i in range(len(s)): 
        num.append(ord(s[i]) - ord('0')) 
    return num 
  
# Driver code 
if __name__ == '__main__': 
      
    # For large input number n 
    n = "98765432109876543210"
  
    # Total number of digits in n 
    len1 = len(n) 
  
    k = 58
      
    # To store the states of the dp 
    dp = [[[-1 for i in range(2)] 
               for j in range(101)]  
               for k in range(MAX)] 
  
    # Process the string to a vector 
    # of digits from MSD to LSD 
    num = process(n) 
  
    print(countNum(0, 0, 0, num, len1, k)) 
  
# This code is contributed by Surendra_Gangwar 

