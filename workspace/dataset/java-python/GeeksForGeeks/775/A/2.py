

# Check if the given two number  
# are friendly pair or not. 
import math 
  
# Returns sum of all factors of n. 
def sumofFactors(n): 
  
    # Traversing through all prime factors. 
    res = 1
    for i in range(2, int(math.sqrt(n)) + 1): 
  
        count = 0; curr_sum = 1; curr_term = 1
        while (n % i == 0): 
            count += 1
  
            # THE BELOW STATEMENT MAKES 
            # IT BETTER THAN ABOVE METHOD 
            # AS WE REDUCE VALUE OF n. 
            n = n // i 
  
            curr_term *= i 
            curr_sum += curr_term 
          
        res *= curr_sum 
      
    # This condition is to handle 
    # the case when n is a prime 
    # number greater than 2. 
    if (n >= 2): 
        res *= (1 + n) 
  
    return res 
  
# Function to return gcd of a and b 
def gcd(a, b): 
  
    if (a == 0): 
        return b 
    return gcd(b % a, a) 
  
# Function to check if the given two  
# number are friendly pair or not. 
def checkFriendly(n, m): 
  
    # Finding the sum of factors of n and m 
    sumFactors_n = sumofFactors(n) 
    sumFactors_m = sumofFactors(m) 
  
    # Finding gcd of n and sum of its factors. 
    gcd_n = gcd(n, sumFactors_n) 
  
    # Findig gcd of m and sum of its factors. 
    gcd_m = gcd(m, sumFactors_m) 
  
    # checking is numerator and denominator   
    # of abundancy index of both number are  
    # equal or not. 
    if (n // gcd_n == m // gcd_m and
        sumFactors_n // gcd_n == sumFactors_m // gcd_m): 
        return True
  
    else: 
        return False
  
# Driver code 
n = 6; m = 28
if(checkFriendly(n, m)): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed by Anant Agarwal. 

