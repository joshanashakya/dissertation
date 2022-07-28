

# Python3 program to find sum of non-primes  
# in given array  
  
# from math lib. import sqrt 
from math import sqrt 
  
# Function to return the sum of  
# non-prime elements from the array  
def nonPrimeSum(arr, n) : 
      
    # Find maximum value in the array  
    max_val = max(arr) 
  
    # USE SIEVE TO FIND ALL PRIME NUMBERS   
    # LESS THAN OR EQUAL TO max_val  
    # Create a boolean array "prime[0..n]".  
    # A value in prime[i] will finally be  
    # false if i is Not a prime, else true.  
    prime = [True] * (max_val + 1)  
  
    # Remaining part of SIEVE  
    prime[0] = False
    prime[1] = False
      
    for p in range(2, int(sqrt(max_val)) + 1) : 
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if (prime[p] == True) : 
  
            # Update all multiples of p  
            for i in range(p * 2, max_val + 1, p) : 
                prime[i] = False
          
    # Sum all non-prime elements in arr[]  
    sum = 0
    for i in range(0, n) :  
        if (not prime[arr[i]]) : 
            sum += arr[i] 
  
    return sum
  
# Driver code  
if __name__ == "__main__" : 
  
    arr= [ 1, 3, 7, 4, 9, 8 ]  
    n = len(arr)  
  
    print(nonPrimeSum(arr, n)) 
  
# This code is contributed by Ryuga 

