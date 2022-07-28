

# Python 3 program to find numbers that are product 
# of exactly two distinct prime numbers 
  
import math  
# Function to check whether a number 
# is a PerfectSquare or not 
def isPerfectSquare(x): 
   
    sr = math.sqrt(x) 
   
    return ((sr - math.floor(sr)) == 0) 
  
# Function to check if a number is a 
# product of exactly two distinct primes 
def isProduct( num): 
    cnt = 0
   
    i = 2
    while cnt < 2 and i * i <= num: 
        while (num % i == 0) : 
            num //= i 
            cnt += 1
        i += 1
   
    if (num > 1): 
        cnt += 1
   
    return cnt == 2
   
# Function to find numbers that are product 
# of exactly two distinct prime numbers. 
def findNumbers(N): 
    # Vector to store such numbers 
    vec = [] 
   
    for i in range(1,N+1) : 
        if (isProduct(i) and not isPerfectSquare(i)) : 
   
            # insert in the vector 
            vec.append(i) 
   
    # Print all numers till n from the vector 
    for i in range(len( vec)): 
        print(vec[i] ,end= " ") 
   
# Driver function 
if __name__=="__main__": 
      
    N = 30 
    findNumbers(N) 

