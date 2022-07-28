

# Python code to count number in the range 
# having the sum of even digits greater 
# than the sum of odd digits 
  
def memo(index, evenSum, oddSum, tight): 
  
    # Base Case 
    if index == len(v): 
  
        # check if condition satisfied or not 
        if evenSum > oddSum: 
            return 1
        else: 
            return 0
  
    # If this result is already computed 
    # simply return it 
    if dp[index][evenSum][oddSum][tight] != -1: 
        return dp[index][evenSum][oddSum][tight] 
  
    # Maximum limit upto which we can place 
    # digit. If tight is 0, means number has 
    # already become smaller so we can place 
    # any digit, otherwise num[index] 
    limit = v[index] if tight else 9
  
    ans = 0
  
    for d in range(limit + 1): 
        currTight = 0
  
        if d == v[index]: 
            currTight = tight 
  
        # if current digit is odd 
        if d % 2 != 0: 
            ans += memo(index + 1, evenSum,  
                        oddSum + d, currTight) 
  
        # if current digit is even 
        else: 
            ans += memo(index + 1, evenSum + d,  
                            oddSum, currTight) 
  
    dp[index][evenSum][oddSum][tight] = ans 
    return ans 
  
# Function to convert n into its digit vector 
# and uses memo() function to return the 
# required count 
def countNum(n): 
    global dp, v 
  
    v.clear() 
    num = [] 
    while n: 
        v.append(n % 10) 
        n //= 10
  
    v.reverse() 
  
    # Initialize dp 
    dp = [[[[-1, -1] for i in range(180)] for j in range(180)] 
        for k in range(18)] 
    return memo(0, 0, 0, 1) 
  
# Driver Code 
if __name__ == "__main__": 
    dp = [] 
    v = [] 
  
    L = 2
    R = 10
    print(countNum(R) - countNum(L - 1)) 
  
# This code is contributed by 
# sanjeev2552 

