

# Python 3 program to find  
# sum of prime divisors of N 
N = 1000005
  
# Function to check if the 
# number is prime or not. 
def isPrime(n): 
      
    # Corner cases 
    if n <= 1: 
        return False
    if n <= 3: 
        return True
  
    # This is checked so that   
    # we can skip middle five  
    # numbers in below loop 
    if n % 2 == 0 or n % 3 == 0: 
        return False
  
    i = 5
    while i * i <= n: 
        if (n % i == 0 or
            n % (i + 2) == 0): 
            return False
        i = i + 6
  
    return True
  
# function to find sum  
# of prime divisors of N 
def SumOfPrimeDivisors(n): 
    sum = 0
    for i in range(1, n + 1) : 
        if n % i == 0 : 
            if isPrime(i): 
                sum += i 
      
    return sum
  
# Driver code 
n = 60
print("Sum of prime divisors of 60 is " + 
              str(SumOfPrimeDivisors(n))) 
  
# This code is contributed 
# by ChitraNayal 

