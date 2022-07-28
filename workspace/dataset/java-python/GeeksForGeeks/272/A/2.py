

# Python3 implementation of Naive method  
# to count all perfect divisors 
  
import math 
  
def isPerfectSquare(x) : 
    sq = (int)(math.sqrt(x)) 
    return (x == sq * sq) 
  
# function to count all prefect divisors 
def countPerfectDivisors(n) : 
      
    # Initialize result 
    cnt = 0
  
        # Consider every number that  
        # can be a divisor of n 
    for i in range(1, (int)(math.sqrt(n)) + 1) : 
  
            # If i is a divisor 
            if ( n % i == 0 ) : 
  
                if isPerfectSquare(i): 
                        cnt = cnt + 1
                if n/i != i and isPerfectSquare(n/i): 
                        cnt = cnt + 1
    return cnt 
      
          
# Driver program to test above function  
print("Total perfect divisor of 16 = ", 
    countPerfectDivisors(16)) 
      
print("Total perfect divisor of 12 = ", 
    countPerfectDivisors(12))     
  
# This code is contributed by Saloni Gupta 

