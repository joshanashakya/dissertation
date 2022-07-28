

# Python3  program to check if the 
# given number is prime using 
# Wheel Factorization Method 
import math 
  
# Function to check if a given 
# number x is prime or not 
def isPrime( N): 
  
    isPrime = True; 
    # The Wheel for checking 
    # prime number 
    arr= [ 7, 11, 13, 17, 
                19, 23, 29, 31 ] 
  
    # Base Case 
    if (N < 2) : 
        isPrime = False
      
    # Check for the number taken 
    # as basis 
    if (N % 2 == 0 or N % 3 == 0
        or N % 5 == 0): 
        isPrime = False
      
    # Check for Wheel 
    # Here i, acts as the layer 
    # of the wheel 
    for i in range(0,int(math.sqrt(N)), 30) : 
  
        # Check for the list of 
        # Sieve in arr[] 
        for c in  arr: 
  
            # If number is greater 
            # than sqrt(N) break 
            if (c > int(math.sqrt(N))): 
                break
              
            # Check if N is a multiple 
            # of prime number in the 
            # wheel 
            else : 
                if (N % (c + i) == 0) : 
                    isPrime = False
                    break
  
            # If at any iteration 
            # isPrime is false, 
            # break from the loop 
            if (not isPrime): 
                break
  
    if (isPrime): 
        print("Prime Number") 
    else: 
        print("Not a Prime Number") 
  
# Driver's Code 
if __name__ == "__main__": 
    N = 121
  
    # Function call for primality 
    # check 
    isPrime(N) 
  
# This code is contributed by chitranayal 

