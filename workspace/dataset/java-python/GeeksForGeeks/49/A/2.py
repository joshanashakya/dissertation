

# Python3 program to find sum of divisors  
# of all the divisors of a natural number. 
import math as mt 
  
# Returns sum of divisors of all  
# the divisors of n 
def sumDivisorsOfDivisors(n): 
  
    # Calculating powers of prime factors  
    # and storing them in a map mp[]. 
    mp = dict() 
    for j in range(2, mt.ceil(mt.sqrt(n))): 
  
        count = 0
        while (n % j == 0): 
            n //= j 
            count += 1
  
        if (count): 
            mp[j] = count 
  
    # If n is a prime number 
    if (n != 1): 
        mp[n] = 1
  
    # For each prime factor, calculating  
    # (p^(a+1)-1)/(p-1) and adding it to answer. 
    ans = 1
    for it in mp: 
        pw = 1
        summ = 0
  
        for i in range(mp[it] + 1, 0, -1): 
            summ += (i * pw) 
            pw *= it 
      
        ans *= summ 
  
    return ans 
  
# Driver Code 
n = 10
print(sumDivisorsOfDivisors(n)) 
      
# This code is contributed 
# by mohit kumar 29 

