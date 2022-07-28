

# Python3 implementation of the above approach 
  
# Function to check whether a string  
# is a prime number or not 
def checkPrime(number) :     
      num = int(number) 
      for i in range(2, int(num**0.5)) : 
            if((num % i) == 0) : 
                 return False
      return True
  
# A recursive function to find the minimum 
# number of segments the given string can  
# be divided such that every segment is a prime 
def splitIntoPrimes(number) : 
      # If the number is null 
      if( number == '' ) : 
           return 0
  
      # checkPrime function is called to check if  
      # the number is a prime or not. 
      if( len(number)<= 6 and checkPrime(number) ) :   
           return 1
      else : 
           numLen = len(number) 
  
           # A very large number denoting maximum 
           ans = 1000000
  
           # Consider a minimum of 6 and length  
           # since the primes are less than 10 ^ 6 
           for i in range( 1, (min( 6, numLen ) + 1) ) :     
                 if( checkPrime( number[:i] ) ) : 
  
                        # Recursively call the function 
                        # to check for the remaining string 
                        val = splitIntoPrimes( number[i:] ) 
                        if(val != -1) : 
  
                               # Evaluating minimum splits  
                               # into Primes for the suffix  
                               ans = min(ans, 1 + val)    
       
           # Checks if no combination found   
           if( ans == 1000000 ) :    
                 return -1
           return ans 
             
# Driver code 
print(splitIntoPrimes("13499315")) 
print(splitIntoPrimes("43")) 

