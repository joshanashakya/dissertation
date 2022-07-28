

# Python3 implementation of the approach 
import math as mt 
  
# Function that returns True if sub-str1ing 
# starting at i and ending at j in str1  
# is a palindrome 
def isPalindrome(str1, i, j): 
  
    while (i < j): 
        if (str1[i] != str1[j]): 
            return False
        i += 1
        j -= 1
      
    return True
      
# Function to count all palindromic substr1ing 
# whose lwngth is a prime number 
def countPrimePalindrome(str1, Len): 
  
    prime = [True for i in range(Len + 1)] 
  
    # 0 and 1 are non-primes 
    prime[0], prime[1] = False, False
    for p in range(2, mt.ceil(mt.sqrt(Len + 1))): 
  
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p]): 
  
            # Update all multiples of p greater  
            # than or equal to the square of it 
            # numbers which are multiple of p  
            # and are less than p^2 are already  
            # been marked. 
            for i in range(2 * p, Len + 1, p): 
                prime[i] = False
          
    # To store the required number  
    # of sub-str1ings 
    count = 0
  
    # Starting from the smallest prime  
    # till the largest Length of the  
    # sub-str1ing possible 
    for j in range(2, Len + 1): 
  
        # If j is prime 
        if (prime[j]): 
  
            # Check all the sub-str1ings of  
            # Length j 
            for i in range(Len + 1 - j): 
  
                # If current sub-str1ing is a palindrome 
                if (isPalindrome(str1, i, i + j - 1)): 
                    count += 1
              
    return count 
  
# Driver Code 
s = "geeksforgeeks"
Len = len(s) 
  
print( countPrimePalindrome(s, Len)) 
  
# This code is contributed by  
# Mohit kumar 29 

