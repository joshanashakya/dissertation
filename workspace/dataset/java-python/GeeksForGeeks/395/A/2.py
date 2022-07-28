

# Python3 program to find the number 
# of interesting primes up to N 
import math 
  
# Function to check if a number 
# is prime or not 
def isPrime(n): 
  
    flag = 1
  
    # If n is divisible by any 
    # number between 2 and sqrt(n), 
    # it is not prime 
    i = 2
    while(i * i <= n): 
        if (n % i == 0): 
            flag = 0
            break
        i += 1
      
    return (True if flag == 1 else False) 
  
# Function to check if a number 
# is perfet square or not 
def isPerfectSquare(x): 
  
    # Find floating povalue of 
    # square root of x. 
    sr = math.sqrt(x) 
  
    # If square root is an integer 
    return ((sr - math.floor(sr)) == 0) 
  
# Function to find the number of interesting 
# primes less than equal to N. 
def countInterestingPrimes(n): 
  
    answer = 0
    for i in range(2, n): 
  
        # Check whether the number 
        # is prime or not 
        if (isPrime(i) != None) : 
  
            # Iterate for values of b 
            j = 1
            while(j * j * j * j <= i): 
  
                # Check condition for a 
                if (isPerfectSquare(i - j * j * j * j)) : 
                    answer += 1
                    break
                j += 1
  
    # Return the required answer 
    return answer 
  
# Driver code 
if __name__=='__main__':  
  
    N = 10
  
    print(countInterestingPrimes(N)) 
  
# This code is contributed by AbhiThakur 

