

# Python3 Program to print  
# prime quadruplet  
  
# from math lib import sqrt method 
from math import sqrt 
  
MAX = 100000
  
# Sieve Of Eratosthenes for generating  
# prime number. 
prime = [True] * MAX
  
# Utility function to generate  
# prime numbers  
def sieve() : 
  
    for p in range(2, int(sqrt(MAX)) + 1) : 
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p] == True : 
  
            # Update all multiples of p  
            for i in range(p * 2 , MAX, p) : 
                prime[i] = False
                  
      
# Function to print Prime quadruplet 
def printPrimeQuad(n) : 
  
    for i in range(n - 7) : 
          
        if ( prime[i] and prime[i + 2] and prime[i + 6] 
            and prime[i + 8]) : 
  
            print(i,i + 2,i + 6,i + 8) 
              
          
# Driver code 
if __name__ == "__main__" : 
      
    sieve() 
    n = 20
  
    printPrimeQuad(20) 
      
# This code is contributed by  
# ANKITRAI1 

