

# Python3 program to break a number  
# such that sum of maximum divisors  
# of all parts is minimum 
  
# Function to check if a number is  
# prime or not. 
def isPrime( n): 
    i = 2
      
    while (i * i <= n): 
          
        if (n % i == 0): 
            return False
        i+= 1
  
    return True
      
def minimumSum( n): 
      
    if (isPrime(n)): 
        return 1
      
    # If n is an even number (we can 
    # write it as sum of two primes) 
    if (n % 2 == 0): 
        return 2
      
    # If n is odd and n-2 is prime. 
    if (isPrime(n - 2)): 
        return 2
          
    # If n is odd, n-3 must be even. 
    return 3
  
# Driver code 
n = 27
print(minimumSum(n)) 
  
# This code is contributed by "Abhishek Sharma 44" 

