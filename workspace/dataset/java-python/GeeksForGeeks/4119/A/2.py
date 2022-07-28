

# Python3 implementation of above approach 
import math as mt 
  
# function that returns true 
# if n is prime else false 
def isPrime(n): 
    i = 2
  
    # 1 is not prime 
    if (n == 1): 
        return False
  
    # check if there is any factor or not 
    for i in range(2, mt.ceil(mt.sqrt(n))): 
        if (n % i == 0): 
            return False
  
    return True
  
# function that returns true if the  
# frequencies of all the characters 
# of s are prime 
def check_frequency(s): 
      
    # create a map to store 
    # the frequencies of characters 
    m = dict() 
  
    for i in range(len(s)): 
          
        # update the frequency 
        if s[i] in m.keys(): 
            m[s[i]] += 1
        else: 
            m[s[i]] = 1
              
    # check whether all the frequencies 
    # are prime or not 
    for ch in m: 
        if m[ch] > 0 and isPrime(m[ch]) == False: 
            return False
  
    return True
  
# Driver code 
s = "geeksforgeeks"
  
# if all the frequencies are prime 
if (check_frequency(s)): 
    print("Yes") 
else: 
    print("No") 
          
# This code is contributed  
# by Mohit kumar 29 

