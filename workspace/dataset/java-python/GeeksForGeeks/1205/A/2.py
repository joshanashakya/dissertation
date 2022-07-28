

# Python implementation of the above approach 
  
M = 18
  
# Prime numbers upto 100 
prime = [ 2, 3, 5, 7, 11, 13, 17, 19, 23, 
        29, 31, 37, 43, 47, 53, 59, 61, 
        67, 71, 73, 79, 83, 89, 97 ] 
  
# Function to return the count of 
# required numbers from 0 to num 
def count(pos, even, odd, tight, num): 
  
    # Base Case 
    if pos == len(num): 
        if len(num) & 1: 
            odd, even = even, odd 
  
        d = even - odd 
  
        # check if the difference is equal 
        # to any prime number 
        for i in range(24): 
            if d == prime[i]: 
                return 1
        return 0
  
    # If this result is already computed 
    # simply return it 
    if dp[pos][even][odd][tight] != -1: 
        return dp[pos][even][odd][tight] 
  
    ans = 0
  
    # Maximum limit upto which we can place 
    # digit. If tight is 1, means number has 
    # already become smaller so we can place 
    # any digit, otherwise num[pos] 
    limit = 9 if tight else num[pos] 
  
    for d in range(limit + 1): 
        currF = tight 
        currEven = even 
        currOdd = odd 
  
        if d < num[pos]: 
            currF = 1
  
        # If the current position is odd 
        # add it to currOdd, otherwise to 
        # currEven 
        if pos & 1: 
            currOdd += d 
        else: 
            currEven += d 
  
        ans += count(pos + 1, currEven, currOdd, currF, num) 
  
    dp[pos][even][odd][tight] = ans 
    return dp[pos][even][odd][tight] 
  
# Function to convert x into its digit vector 
# and uses count() function to return the 
# required count 
def solve(x): 
    global dp 
    num = [] 
    while x: 
        num.append(x % 10) 
        x //= 10
  
    num.reverse() 
  
    # Initialize dp 
    dp = [[[[-1, -1] for i in range(90)]  
            for j in range(90)] for k in range(M)] 
    return count(0, 0, 0, 0, num) 
  
# Driver Code 
if __name__ == "__main__": 
    dp = [] 
  
    L = 1
    R = 50
    print(solve(R) - solve(L - 1)) 
  
    L = 50
    R = 100
    print(solve(R) - solve(L - 1)) 
  
# This code is contributed by 
# sanjeev2552 

