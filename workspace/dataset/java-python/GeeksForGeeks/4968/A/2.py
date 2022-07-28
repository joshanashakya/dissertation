

# Python3 program to find a subset in which  
# sum of every pair in it is a prime 
import math as mt 
  
MAX = 100001
  
isPrime = [0 for i in range(MAX)] 
  
def sieve(): 
  
    for p in range(2, mt.ceil(mt.sqrt(MAX))):  
          
        # If isPrime[p] is not changed,  
        # then it is a prime 
        if (isPrime[p] == 0) : 
              
            # Update all multiples of p 
            for i in range(2 * p, MAX, p): 
                isPrime[i] = 1
  
def findSubset(a, n): 
  
    cnt1 = 0
  
    # Counting no.of ones in the array 
    for i in range(n):  
        if (a[i] == 1): 
            cnt1+=1
  
    # Case-I: count of ones(1s) > 0 and  
    # an integer > 1 is present in the array 
    if (cnt1 > 0): 
  
        for i in range(n): 
  
            # Find a[i], where a[i] + 1 is prime. 
            if ((a[i] != 1) and
                (isPrime[a[i] + 1] == 0)): 
  
                print(cnt1 + 1) 
  
                # Print all the ones(1s). 
                for j in range(cnt1): 
                    print("1", end = " ") 
  
                print(a[i]) 
                return 0
  
    # Case-II: array contains only ones(1s) 
    if (cnt1 >= 2): 
  
        print(cnt1) 
  
        # Print all ones(1s). 
        for i in range(cnt1): 
            print("1", end = " ") 
  
        print("\n") 
        return 0
      
    # Case-III: array does not contain 1s 
    for i in range(n): 
        for j in range(i + 1, n): 
              
            # Find a pair of integers whose  
            # sum is prime 
            if (isPrime[a[i] + a[j]] == 0): 
                print(2) 
                print(a[i], " ", a[j]) 
  
    # Array contains only a single element. 
    print(-1) 
  
# Driver Code 
sieve() 
A =[ 2, 1, 1] 
n =len(A) 
findSubset(A, n) 
  
# This code is contributed  
# by Mohit kumar 29 

