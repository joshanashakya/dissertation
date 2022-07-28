

# Python Program to find the count of 
# numbers in a range where digit d 
# occurs exactly K times 
M = 20
  
# states - position, count, tight, nonz 
dp = [] 
  
# d is required digit and K is occurrence 
d, K = None, None
  
# This function returns the count of 
# required numbers from 0 to num 
def count(pos, cnt, tight, nonz, num: list): 
  
    # Last position 
    if pos == len(num): 
        if cnt == K: 
            return 1
        return 0
  
    # If this result is already computed 
    # simply return it 
    if dp[pos][cnt][tight][nonz] != -1: 
        return dp[pos][cnt][tight][nonz] 
  
    ans = 0
  
    # Maximum limit upto which we can place 
    # digit. If tight is 1, means number has 
    # already become smaller so we can place 
    # any digit, otherwise num[pos] 
    limit = 9 if tight else num[pos] 
  
    for dig in range(limit + 1): 
        currCnt = cnt 
  
        # Nonz is true if we placed a non 
        # zero digit at the starting of 
        # the number 
        if dig == d: 
            if d != 0 or not d and nonz: 
                currCnt += 1
  
        currTight = tight 
  
        # At this position, number becomes 
        # smaller 
        if dig < num[pos]: 
            currTight = 1
  
        # Next recursive call, also set nonz 
        # to 1 if current digit is non zero 
        ans += count(pos + 1, currCnt,  
                currTight, (nonz or dig != 0), num) 
  
    dp[pos][cnt][tight][nonz] = ans 
    return dp[pos][cnt][tight][nonz] 
  
  
# Function to convert x into its digit vector and uses 
# count() function to return the required count 
def solve(x): 
    global dp, K, d 
  
    num = [] 
    while x: 
        num.append(x % 10) 
        x //= 10
  
    num.reverse() 
  
    # Initialize dp 
    dp = [[[[-1, -1] for i in range(2)]  
            for j in range(M)] for k in range(M)] 
    return count(0, 0, 0, 0, num) 
  
# Driver Code 
if __name__ == "__main__": 
  
    L = 11
    R = 100
    d = 2
    K = 1
    print(solve(R) - solve(L - 1)) 
  
# This code is contributed by 
# sanjeev2552 

