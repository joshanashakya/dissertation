

# Python3 program to find the Absolute 
# Difference between the Sum of Non-Prime  
# numbers and Prime numbers of an Array 
import sys 
  
# Function to find the difference  
# between the sum of non-primes  
# and the sum of primes of an array. 
def CalculateDifference(arr, n): 
  
    # Find maximum value in the array 
    max_val = -1
    for i in range(0, n): 
        if(arr[i] > max_val): 
            max_val = arr[i] 
      
    # USE SIEVE TO FIND ALL PRIME NUMBERS 
    # LESS THAN OR EQUAL TO max_val 
    # Create a boolean array "prime[0..n]".  
    # A value in prime[i] will finally be  
    # false if i is Not a prime, else true. 
    prime = [True for i in range(max_val + 1)]  
  
    # Remaining part of SIEVE 
    prime[0] = False
    prime[1] = False
    p = 2
    while (p * p <= max_val):  
          
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p] == True:  
              
            # Update all multiples of p  
            for i in range(p * 2,  
                           max_val + 1, p):  
                prime[i] = False
        p += 1
  
    # Store the sum of primes in  
    # S1 and the sum of non primes  
    # in S2 
    S1 = 0
    S2 = 0
    for i in range (0, n): 
  
        if prime[arr[i]]:  
  
            # the number is prime 
            S1 += arr[i] 
          
        elif arr[i] != 1:  
  
            # the number is non-prime 
            S2 += arr[i] 
  
    # Return the absolute difference 
    return abs(S2 - S1) 
  
# Driver code 
      
# Get the array 
arr = [ 1, 3, 5, 10, 15, 7 ] 
n = len(arr) 
  
# Find the absolute difference 
print(CalculateDifference(arr, n)) 
  
# This code is contributed 
# by ihritik 

