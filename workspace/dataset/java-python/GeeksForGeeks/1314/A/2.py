

# Python3 program to count number of 
# divisors of n^2 which are not 
# divisible by divisor of n 
import math as mt 
  
# Function to count divisors of n^2 
# having no factors of 'n' 
def factors(n): 
  
    prime = dict() 
    for i in range(2, mt.ceil(mt.sqrt(n + 1))): 
        while (n % i == 0): 
              
            # Increment count of i-th  
            # prime divisor 
            if i in prime.keys(): 
                prime[i] += 1
            else: 
                prime[i] = 1
                  
            # Find next prime divisor 
            n = n // i 
          
    # Increment count if divisor 
    # still remains 
    if (n > 2): 
        if n in prime.keys(): 
            prime[n] += 1
        else: 
            prime[n] = 1
  
    # Initialize variable for counting  
    # the factors of n^2 and n as ans1  
    # and ans2 respectively 
    ans1 = 1
    ans2 = 1
  
    # Range based for-loop 
    for it in prime: 
  
        # Use formula as discussed in above 
        ans1 *= 2 * prime[it] + 1
        ans2 *= prime[it] + 1
      
    # return the difference of answers 
    return ans1 - ans2 
  
# Driver code 
n = 5
print(factors(n)) 
n = 8
print(factors(n)) 
  
# This code is contributed by  
# Mohit kumar 29 

