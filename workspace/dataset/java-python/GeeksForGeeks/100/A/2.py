

# Python3 implementation of the above approach  
from math import sqrt; 
  
N = 100005
  
# To store number of divisors and  
# Prefix sum of such numbers  
d = [0] * N 
pre = [0] * N 
  
# Function to find the number of integers  
# 1 < x < N for which x and x + 1 have  
# the same number of positive divisors  
def Positive_Divisors() : 
      
    # Count the number of divisors  
    for i in range(N) : 
  
        # Run a loop upto sqrt(i)  
        for j in range(1, int(sqrt(i)) + 1) : 
  
            # If j is divisor of i  
            if (i % j == 0) : 
  
                # If it is perfect square  
                if (j * j == i) : 
                    d[i] += 1
                else : 
                    d[i] += 2
  
    ans = 0
  
    # x and x+1 have same number of  
    # positive divisors  
    for i in range(2, N) :  
        if (d[i] == d[i - 1]) : 
            ans += 1
        pre[i] = ans 
      
# Driver code  
if __name__ == "__main__" :  
  
    # Function call  
    Positive_Divisors() 
  
    n = 15
  
    # Required answer  
    print(pre[n])  
  
# This code is contributed by Ryuga 

