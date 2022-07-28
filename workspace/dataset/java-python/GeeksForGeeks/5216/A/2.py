

# Python 3 program to find  
# prime triplets smaller 
# than or equal to n. 
  
# function to detect prime number 
# using sieve method 
# https://www.geeksforgeeks.org/sieve-of-eratosthenes/ 
# to detect prime number 
def sieve(n, prime) : 
      
    p = 2
      
    while (p * p <= n ) : 
          
        # If prime[p] is not changed 
        # , then it is a prime 
        if (prime[p] == True) : 
              
            # Update all multiples of p 
            i = p * 2
          
            while ( i <= n ) : 
                prime[i] = False
                i = i + p 
          
        p = p + 1
          
  
# function to print  
# prime triplets 
def printPrimeTriplets(n) : 
  
    # Finding all primes  
    # from 1 to n 
    prime = [True] * (n + 1) 
    sieve(n, prime) 
      
    print( "The prime triplets from 1 to ", 
                               n , "are :") 
      
    for i in range(2, n - 6 + 1) : 
          
        # triplets of form (p, p+2, p+6) 
        if (prime[i] and prime[i + 2] and
                            prime[i + 6]) : 
            print( i , (i + 2) , (i + 6)) 
              
        # triplets of form (p, p+4, p+6) 
        elif (prime[i] and prime[i + 4] and
                            prime[i + 6]) : 
            print(i , (i + 4) , (i + 6)) 
              
# Driver code 
n = 25
printPrimeTriplets(n) 
  
# This code is contributed by Nikita Tiwari. 

