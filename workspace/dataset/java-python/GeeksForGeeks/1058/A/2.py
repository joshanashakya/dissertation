

# Python 3 program to find count of 
# prime pairs in given array. 
from math import sqrt 
  
# Function to find count of prime pairs 
def pairCount(arr, n): 
      
    # Find maximum value in the array 
    max_val = arr[0] 
    for i in range(len(arr)): 
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
    k = int(sqrt(max_val)) + 1
    for p in range(2, k, 1): 
          
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p] == True): 
              
            # Update all multiples of p 
            for i in range(p * 2, max_val + 1, p): 
                prime[i] = False
      
    # Find all primes in arr[] 
    count = 0
    for i in range(0, n, 1): 
        if (prime[arr[i]]): 
                count += 1
  
    # return the count of possible prime  
    # pairs. Number of unique pairs 
    # with N elements is N*(N-1)/2 
    return (count * (count - 1)) / 2
  
# Driver code 
if __name__ =='__main__': 
    arr = [1, 2, 3, 4, 5, 6, 7]  
    n = len(arr) 
    print(int(pairCount(arr, n))) 
      
# This code is contributed by 
# Shahshank_Sharma 

