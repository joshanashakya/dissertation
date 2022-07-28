

# Python3 program to express N as  
# sum of at-most three prime numbers 
  
# Function to check if a number 
# is prime or not. 
def isPrime(x): 
    if(x == 0 or x == 1) : 
        return 0
    i = 2
    while i * i <= x :  
        if (x % i == 0) : 
            return 0
        i = i + 1
    return 1
  
# Prints at most three prime numbers  
# whose sum is n. 
def findPrimes(n) : 
    if (isPrime(n)): 
          
        # CASE-I  
        print(n, end = " ") 
      
    elif (isPrime(n - 2)) : 
          
        # CASE-II  
        print ("2", end = " ") 
        print (n - 2, end = " " ) 
  
    else: 
        #CASE-III 
        print ( "3", end = " " ) 
        n = n - 3
        i = 0
        while i < n : 
            if (isPrime(i) and isPrime(n - i)) : 
                print(i, end = " ") 
                print ((n - i), end = " ") 
                break
            i = i + 1
  
# Driver Code 
n = 27; 
findPrimes(n);  
  
# This code is contributed by rishabh_jain 

