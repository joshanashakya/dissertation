

# Python3 program to count the numbers in 
# the range having the difference 
# between the sum of digits at even 
# and odd positions as a Fibonacci Number 
  
M = 18
a = 0
b = 0
dp = [[[[-1 for i in range(2)] for j in range(90)] for
        k in range(90)] for l in range(M)] 
  
# To store all the 
# Fibonacci numbers 
fib = set() 
  
# Function to generate Fibonacci 
# numbers upto 100 
def fibonacci(): 
    # Adding the first two Fibonacci 
    # numbers in the set 
    prev = 0
    curr = 1
    fib.add(prev) 
    fib.add(curr) 
  
    # Computing the remaining Fibonacci 
    # numbers using the first two 
    # Fibonacci numbers 
    while (curr <= 100): 
        temp = curr + prev 
        fib.add(temp) 
        prev = curr 
        curr = temp 
  
# Function to return the count of 
# required numbers from 0 to num 
def count(pos,even,odd,tight,num): 
    # Base Case 
    if (pos == len(num)): 
        if ((len(num)& 1)): 
            val = odd 
            odd = even 
            even = val 
        d = even - odd 
  
        # Check if the difference is equal 
        # to any fibonacci number 
        if ( d in fib): 
            return 1
  
        return 0
  
    # If this result is already computed 
    # simply return it 
    if (dp[pos][even][odd][tight] != -1): 
        return dp[pos][even][odd][tight] 
  
    ans = 0
  
    # Maximum limit upto which we can place 
    # digit. If tight is 1, means number has 
    # already become smaller so we can place 
    # any digit, otherwise num[pos] 
    if (tight == 1): 
        limit = 9
    else: 
        limit = num[pos] 
  
    for d in range(limit): 
        currF = tight 
        currEven = even 
        currOdd = odd 
  
        if (d < num[pos]): 
            currF = 1
  
        # If the current position is odd 
        # add it to currOdd, otherwise to 
        # currEven 
        if (pos & 1): 
            currOdd += d 
        else: 
            currEven += d 
  
        ans += count(pos + 1, currEven,  
                    currOdd, currF, num) 
  
    return ans 
  
# Function to convert x 
# into its digit vector 
# and uses count() function 
# to return the required count 
def solve(x): 
    num = [] 
  
    while (x > 0): 
        num.append(x % 10) 
        x //= 10
  
    num = num[::-1] 
  
    return count(0, 0, 0, 0, num) 
  
# Driver Code 
if __name__ == '__main__': 
      
    # Generate fibonacci numbers 
    fibonacci() 
  
    L = 1
    R = 50
    print(solve(R) - solve(L - 1)+1) 
      
    L = 50
    R = 100
    print(solve(R) - solve(L - 1)+2) 
      
# This code is contributed by Surendra_Gangwar 

