

# Python 3 program to check whether 
# count of distinct characters in a  
# string is Prime or not 
  
# from math library import  
# sqrt method 
from math import sqrt 
  
# Find whether a number  
# is prime or not 
def isPrime(n) : 
  
    # 1 is not prime 
    if n == 1 : 
        return False
  
    # check if there is any  
    # factor or not 
    for i in range(2, int(sqrt(n)) + 1) : 
  
        if n % i == 0 : 
            return False
  
    return True
  
# Count the distinct characters  
# in a string 
def countDistinct(s) : 
  
    # create a dictionary to store  
    # the frequency of characters 
    m = {} 
  
    # dictionary with keys and its 
    # initialize with value 0 
    m = m.fromkeys(s, 0) 
  
    # traverse the string 
    for i in range(len(s)) : 
  
        # increase the frequency  
        # of character 
        m[s[i]] += 1
  
    return len(m.keys()) 
  
# Driver code      
if __name__ == "__main__" : 
  
    str = "geeksforgeeks"
  
    if isPrime(countDistinct(str)) : 
        print("Yes") 
    else : 
        print("No") 
          
# This code is contributed 
# by ANKITRAI1 

