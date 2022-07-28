

# Python3 program for the above approach 
from math import sqrt,floor 
  
# Function to check whether N is 
# Perfect Square or not 
def isPerfectSquare(N): 
    # Find sqrt 
    sr = sqrt(N) 
  
    return (sr - floor(sr)) == 0
  
# Function to check whether the given 
# pairs of numbers is Betrothed Numbers 
# or not 
def BetrothedNumbers(n,m): 
    Sum1 = 1
    Sum2 = 1
  
    # For finding the sum of all the 
    # divisors of first number n 
    for i in range(2,int(sqrt(n))+1,1): 
        if (n % i == 0): 
            if (isPerfectSquare(n)): 
                Sum1 += i 
            else: 
                Sum1 += i + n/i 
  
    # For finding the sum of all the 
    # divisors of second number m 
    for i in range(2,int(sqrt(m))+1,1): 
        if (m % i == 0): 
            if (isPerfectSquare(m)): 
                Sum2 += i 
            else: 
                Sum2 += i + (m / i) 
  
    if ((n + 1 == Sum2) and (m + 1 == Sum1)): 
        print("YES")     
    else: 
        print("NO") 
  
# Driver Code 
if __name__ == '__main__': 
    N = 9504
    M = 20734
  
    # Function Call 
    BetrothedNumbers(N, M) 
  
# This code is contributed by Surendra_Gangwar 

