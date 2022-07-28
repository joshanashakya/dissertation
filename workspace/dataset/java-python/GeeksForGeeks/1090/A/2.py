

# Python 3 implementation of the approach 
from math import sqrt 
  
# Function to count number of times 
# prime P divide factorial N 
def checkfact(N, countprime, prime): 
    countfact = 0
    if (prime == 2 or prime == 3): 
        countfact += 1
    divide = prime 
  
    # Lengendre Formula 
    while (int(N / divide ) != 0): 
        countfact += int(N / divide) 
        divide = divide * divide 
  
    if (countfact >= countprime): 
        return True
    else: 
        return False
  
# Function to find count number of times 
# all prime P divide summation 
def check(N): 
      
    # Formula for summation of square after  
    # removing n and constant 6 
    sumsquares = (N + 1) * (2 * N + 1) 
    countprime = 0
  
    # Loop to traverse over all prime P  
    # which divide summation 
    for i in range(2, int(sqrt(sumsquares)) + 1, 1): 
        flag = 0
  
        while (sumsquares % i == 0): 
            flag = 1
            countprime += 1
            sumsquares /= i 
  
        if (flag): 
            if (checkfact(N - 1,  
                countprime, i) == False): 
                return False
            countprime = 0
  
    # If Number itself is a Prime Number 
    if (sumsquares != 1): 
        if (checkfact(N - 1, 1,  
            sumsquares) == False): 
            return False
  
    return True
  
# Driver Code 
if __name__ == '__main__': 
    N = 5
    if(check(N)): 
        print("Yes") 
    else: 
        print("No") 
          
# This code is contributed by 
# Surendra_Gangwar 

