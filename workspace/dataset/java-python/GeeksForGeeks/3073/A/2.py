

# Python 3 program to find 
# modular inverse of  
# all numbers from 1 
# to n using naive 
# method 
  
  
# A naive method to find modular 
# multiplicative inverse of 'a' 
# under modulo 'prime' 
  
def modInverse(a, prime) : 
    a = a % prime 
    for x in range(1,prime) : 
        if ((a*x) % prime == 1) : 
            return x 
        
    return -1
      
   
def printModIverses(n, prime) : 
    for i in range(1,n+1) : 
        print( modInverse(i, prime) ,end= " ") 
    
# Driver Program 
n = 10
prime = 17
  
printModIverses(n, prime) 
  
# This code is contributed 
# by Nikita Tiwari. 

