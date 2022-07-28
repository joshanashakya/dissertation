

# Python3 program to find the product of 
# the multiplication of 
# prime numbers in all possible subsets. 
prime = [True for i in range(100)] 
  
# Sieve method to check prime or not 
def sieve(n, prime): 
      
    # Initially mark all primes 
    for i in range(1, n + 1): 
        prime[i] = True
    prime[0] = prime[1] = False
  
    # Iterate and mark all the 
    # non primes as false 
    for i in range(2, n + 1): 
        if (prime[i]): 
              
            # Multiples of prime marked as false 
            for j in range(2 * i, n + 1, i): 
                prime[j] = False
  
# Function to find the Sum 
# of Sum of all the subset 
def SumOfSubset(a, n): 
  
    # Get the maximum element 
    maxi = max(a) 
  
    # Declare a sieve array 
  
    # Sieve function called 
    sieve(maxi, prime) 
  
    # Number of times an element 
    # contributes to the answer 
    times = pow(2, n - 1) 
  
    Sum = 1
  
    # Iterate and check 
    for i in range(n): 
          
        # If prime 
        if (prime[a[i]]): 
            Sum = Sum * (pow(a[i], times)) # Contribution 
  
    return Sum
  
# Driver Code 
a = [3, 7] 
n = len(a) 
print(SumOfSubset(a, n)) 
  
# This code is contributed  
# by Mohit Kumar 

