

# Python 3 implementation of the approach 
from math import sqrt 
  
# Function to return the required 
# prime number from the array 
def getPrime(arr, n): 
      
    # Find maximum value in the array 
    max_val = arr[0] 
    for i in range(len(arr)): 
          
        # USE SIEVE TO FIND ALL PRIME NUMBERS LESS 
        # THAN OR EQUAL TO max_val 
        # Create a boolean array "prime[0..n]". A 
        # value in prime[i] will finally be false 
        # if i is Not a prime, else true. 
        if(arr[i] > max_val): 
            max_val = arr[i] 
  
    prime = [True for i in range(max_val + 1)] 
   
    # Remaining part of SIEVE 
    prime[0] = False
    prime[1] = False
    for p in range(2, int(sqrt(max_val)) + 1, 1): 
          
        # If prime[p] is not changed, then 
        # it is a prime 
        if (prime[p] == True): 
              
            # Update all multiples of p 
            for i in range(p * 2, max_val + 1, p): 
                prime[i] = False
  
    # To store the maximum prime number 
    maximum = -1
    for i in range(n): 
          
        # If current element is prime 
        # then update the maximum prime 
        if (prime[arr[i]]): 
            maximum = max(maximum, arr[i]) 
  
    # Return the maximum prime 
    # number from the array 
    return maximum 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 10, 15, 7, 6, 8, 13] 
    n = len(arr) 
  
    print(getPrime(arr, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

