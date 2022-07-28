

# Python3 program to sort only  
# non primes 
  
# from math import sqrt method 
from math import sqrt 
  
# Create a boolean array "prime[0..n]"  
# and initialize all entries it as true. 
# A value in prime[i] will  finally be false  
# if i is Not a prime, else true.  
prime = [0] * 100005
  
def SieveOfEratosthenes(n) : 
  
    for i in range(len(prime)) : 
        prime[i] = True
          
    prime[1] = False
  
    for p in range(2, int(sqrt(n)) + 1) : 
          
        # If prime[p] is not changed,  
        # then it is a prime      
        if prime[p] == True : 
  
            # Update all multiples of p  
            for i in range(p * 2, n, p) : 
                prime[i] = False
  
  
# Function to print the array such that  
# only non primes are sorted  
def sortedArray(arr, n) : 
      
    SieveOfEratosthenes(100005) 
  
    # list v will store all non  
    # prime numbers  
    v = [] 
  
    # If not prime, insert into list 
    for i in range(n) : 
        if prime[arr[i]] == 0 : 
            v.append(arr[i]) 
  
    # sorting list of non primes  
    v.sort() 
  
    j = 0
  
    # print the required array 
    for i in range(n) : 
  
        if prime[arr[i]] == True : 
            print(arr[i],end = " ") 
        else : 
            print(v[j],end = " ") 
            j += 1
              
  
# Driver code 
if __name__ == "__main__" : 
  
    n = 6
    arr = [100, 11, 500, 2, 17, 1] 
      
    sortedArray(arr, n) 
      
# This code is contributed by  
# ANKITRAI1 

