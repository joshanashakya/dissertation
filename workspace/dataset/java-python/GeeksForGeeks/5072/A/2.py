

# Python3 implementation of  
# above approach  
from math import sqrt 
  
# Function to find maximum GCD  
# of N integers with product P  
def maxGCD(N, P): 
  
    ans = 1
  
    # map to store prime factors of P  
    prime_factors = {} 
      
    # prime factorization of P  
    for i in range(2, int(sqrt(P) + 1)) : 
  
        while (P % i == 0) : 
              
            if i not in prime_factors : 
                prime_factors[i] = 0
          
            prime_factors[i] += 1
            P //= i 
          
    if (P != 1) : 
        prime_factors[P] += 1
  
    # traverse all prime factors and  
    # multiply its 1/N power to the result  
    for key, value in prime_factors.items() : 
        ans *= pow(key, value // N)  
  
    return ans 
  
# Driver code  
if __name__ == "__main__" :  
  
    N, P = 3, 24
  
    print(maxGCD(N, P)) 
  
# This code is contributed by Ryuga 

