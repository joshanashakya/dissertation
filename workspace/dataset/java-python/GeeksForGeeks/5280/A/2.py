

# Efficient Python3 program to find length  
# of the largest subsequence with GCD  
# greater than 1. 
import math as mt 
  
MAX = 100001
  
# prime[] for storing smallest 
# prime divisor of element 
# count[] for storing the number 
# of times a particular divisor  
# occurs in a subsequence 
prime = [0 for i in range(MAX + 1)] 
countdiv = [0 for i in range(MAX + 1)] 
  
# Simple sieve to find smallest prime  
# factors of numbers smaller than MAX 
def SieveOfEratosthenes(): 
  
    for i in range(2, mt.ceil(mt.sqrt(MAX + 1))): 
      
        if (prime[i] == 0): 
            for j in range(i * 2, MAX + 1, i): 
                prime[j] = i 
      
    # Prime number will have same divisor 
    for i in range(1, MAX): 
        if (prime[i] == 0): 
            prime[i] = i 
  
# Returns length of the largest  
# subsequence with GCD more than 1. 
def largestGCDSubsequence(arr, n): 
  
    ans = 0
    for i in range(n): 
  
        element = arr[i] 
  
        # Fetch total unique prime 
        # divisor of element 
        while (element > 1): 
  
            div = prime[element] 
  
            # Increment count[] of Every  
            # unique divisor we get till now 
            countdiv[div] += 1
  
            # Find maximum frequency of divisor 
            ans = max(ans, countdiv[div]) 
  
            while (element % div == 0): 
                element = element // div 
          
    return ans 
  
# Driver code 
  
# Pre-compute smallest divisor 
# of all numbers 
SieveOfEratosthenes() 
  
arr= [10, 15, 7, 25, 9, 35] 
size = len(arr)  
print(largestGCDSubsequence(arr, size)) 
  
# This code is contributed  
# by Mohit kumar 29 

