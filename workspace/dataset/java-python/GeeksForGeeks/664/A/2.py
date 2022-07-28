

# Python3 implementation of the approach  
  
# Function to return the count of  
# required numbers from 0 to num  
def count(pos, Sum, rem, tight, nonz, num):  
  
    # Last position  
    if pos == len(num):  
        if rem == 0 and Sum == n:  
            return 1
        return 0
  
    # If this result is already computed  
    # simply return it 
    if dp[pos][Sum][rem][tight] != -1:  
        return dp[pos][Sum][rem][tight]  
      
    ans = 0
  
    # Maximum limit upto which we can place  
    # digit. If tight is 1, means number has  
    # already become smaller so we can place  
    # any digit, otherwise num[pos] 
    if tight: 
        limit = 9
    else:  
        limit = num[pos] 
      
    for d in range(0, limit + 1):  
  
        # If the current digit is zero  
        # and nonz is 1, we can't place it  
        if d == 0 and nonz: 
            continue
              
        currSum = Sum + d  
        currRem = (rem * 10 + d) % m  
        currF = int(tight or (d < num[pos]))  
        ans += count(pos + 1, currSum, currRem,  
                     currF, nonz or d, num)  
      
    dp[pos][Sum][rem][tight] = ans 
    return ans 
  
# Function to convert x into its digit  
# vector and uses count() function to  
# return the required count  
def solve(x):  
  
    num = [] 
    global dp 
      
    while x > 0:  
        num.append(x % 10)  
        x //= 10
      
    num.reverse()  
  
    # Initialize dp  
    dp = [[[[-1, -1] for i in range(M)]  
                     for j in range(165)]  
                     for k in range(M)] 
    return count(0, 0, 0, 0, 0, num)  
  
# Driver code  
if __name__ == "__main__": 
  
    L, R = 1, 100
      
    # n is the sum of digits and number  
    # should be divisible by m 
    n, m, M = 8, 2, 20
      
    # States - position, sum, rem, tight  
    # sum can have values upto 162, if we  
    # are dealing with numbers upto 10^18  
    # when all 18 digits are 9, then sum  
    # is 18 * 9 = 162  
    dp = [] 
  
    print(solve(R) - solve(L))  
      
# This code is contributed by Rituraj Jain 

