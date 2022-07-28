

# Python3 program to implement the  
# above approach  
  
from math import sqrt 
  
# Fucntion to pre-store primes  
def SieveOfEratosthenes(MAX, primes) :  
  
    prime = [True]*(MAX + 1);  
  
    # Sieve method to check if prime or not  
    for p in range(2,int(sqrt(MAX)) + 1) :  
        if (prime[p] == True) : 
            # Multiples  
            for i in range(p**2, MAX + 1, p) :  
                prime[i] = False;  
  
    # Pre-store all the primes  
    for i in range(2, MAX + 1) : 
        if (prime[i]) : 
            primes.append(i);  
  
# Function to find the longest subsequence  
def findLongest(A, n) :  
  
    # Hash map  
    mpp = {}; 
    primes = []; 
      
    # Call the function to pre-store the primes 
    SieveOfEratosthenes(A[n - 1], primes); 
      
    dp = [0] * n ; 
      
    # Initialize last element with 1 
    # as that is the longest possible 
    dp[n - 1] = 1; 
    mpp[A[n - 1]] = n - 1; 
      
    # Iterate from the back and find the longest 
    for i in range(n-2,-1,-1) : 
          
        # Get the number 
        num = A[i]; 
          
        # Initialize dp[i] as 1 
        # as the element will only me in 
        # the subsequence  
        dp[i] = 1; 
        maxi = 0; 
          
        # Iterate in all the primes and 
        # multiply to get the next element 
        for it in primes : 
              
            # Next element if multiplied with it 
            xx = num * it; 
              
            # If exceeds the last element 
            # then break 
            if (xx > A[n - 1]) : 
                break; 
                  
            # If the number is there in the array 
            elif xx in mpp : 
                # Get the maximum most element 
                dp[i] = max(dp[i], 1 + dp[mpp[xx]]); 
                  
        # Hash the element 
        mpp[A[i]] = i; 
          
    ans = 1; 
          
    # Find the longest 
    for i in range(n) : 
        ans = max(ans, dp[i]); 
          
    return ans;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    a = [ 1, 2, 5, 6, 12, 35, 60, 385 ];  
    n = len(a);  
      
    print(findLongest(a, n));  
  
# This code is contributed by AnkitRai01 

