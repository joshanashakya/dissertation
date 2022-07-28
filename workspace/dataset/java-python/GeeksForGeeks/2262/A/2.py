

# Python 3 program to count the pairs  
# whose sum of digits is co-prime  
from math import gcd 
# Function to find the elements  
# after doing the sum of digits 
def makePairs(pairs, a, b): 
    # Traverse from a to b 
    for i in range(a,b+1,1): 
        # Find the sum of the digits of the elements 
        # in the given range one by one 
        sumOfDigits = 0
        k = i 
        while(k>0): 
            sumOfDigits += k%10
            k = int(k / 10) 
      
        if (sumOfDigits <= 162): 
            pairs.append(sumOfDigits) 
      
# Function to count the co-prime pairs 
def countCoPrime(a, b): 
    pairs = [] 
      
    # Function to make the pairs  
    # by doing the sum of digits 
    makePairs(pairs, a, b) 
    count = 0
      
    # Count pairs that are co-primes 
    for i in range(0,len(pairs),1): 
            for j in range(i+1,len(pairs),1): 
                if (gcd(pairs[i], pairs[j]) == 1): 
                    count += 1
                      
    return count 
      
# Driver code  
if __name__ == '__main__': 
    a = 12
    b = 15
  
    # Function to count the pairs  
    print (countCoPrime(a, b))  
  
# This code is contributed by 
# Surendra_Gangwar 

