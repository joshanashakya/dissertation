

# Python3 program to find the Absolute Difference  
# between the Product of Non-Prime numbers  
# and Prime numbers of an Array  
  
    
# Function to find the difference between  
# the product of non-primes and the  
# product of primes of an array.  
def calculateDifference(arr, n):  
    # Find maximum value in the array  
    max_val = max(arr) 
    
    # USE SIEVE TO FIND ALL PRIME NUMBERS LESS  
    # THAN OR EQUAL TO max_val  
    # Create a boolean array "prime[0..n]". A  
    # value in prime[i] will finally be false  
    # if i is Not a prime, else true.  
  
    prime    = (max_val + 1) * [True] 
    
    # Remaining part of SIEVE  
    prime[0] = False
    prime[1] = False
    p = 2
  
    while p * p <= max_val:  
  
        # If prime[p] is not changed, then  
        # it is a prime  
        if prime[p] == True:  
    
            # Update all multiples of p  
            for i in range(p * 2, max_val+1, p):  
                prime[i] = False
        p += 1
    
    # Store the product of primes in P1 and  
    # the product of non primes in P2  
    P1 = 1 ; P2 = 1
    for i in range(n): 
  
        if prime[arr[i]]: 
            # the number is prime  
            P1 *= arr[i] 
  
        elif arr[i] != 1:  
            # the number is non-prime  
            P2 *= arr[i] 
    
    # Return the absolute difference  
    return abs(P2 - P1) 
    
# Driver Code  
if __name__ == '__main__': 
    arr   = [ 1, 3, 5, 10, 15, 7 ]  
    n     = len(arr) 
    
    # Find the absolute difference  
    print(calculateDifference(arr, n)) 
# This code is contributed  
# by Harshit Saini  

