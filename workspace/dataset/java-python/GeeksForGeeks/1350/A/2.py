

# Python 3 implementation of above approach 
from math import gcd,sqrt 
  
# Function to calculate all common divisors 
# of two given numbers 
# a, b --> input integer numbers 
def sumcommDiv(a, b): 
    # find gcd of a, b 
    n = gcd(a, b) 
  
    # Find the sum of divisors of n. 
    sum = 0
    N = int(sqrt(n))+1
    for i in range(1,N,1): 
        # if 'i' is factor of n 
        if (n % i == 0): 
            # check if divisors are equal 
            if (n / i == i): 
                sum += i 
            else: 
                sum += (n / i) + i 
          
    return sum
  
# Driver program to run the case 
if __name__ == '__main__': 
    a = 10
    b = 15
    print("Sum =",int(sumcommDiv(a, b))) 
  
# This code is contributed by  
# Surendra_Gangwar 

