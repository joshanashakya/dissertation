

# Python3 Program to  
# check whether a  
# given number is left 
# truncatable prime  
# or not. 
  
# Function to calculate  
# x raised to the power y  
def power(x, y) : 
      
    if (y == 0) : 
        return 1
    elif (y % 2 == 0) : 
        return(power(x, y // 2) *
               power(x, y // 2)) 
    else : 
        return(x * power(x, y // 2) *
                power(x, y // 2)) 
  
# Generate all prime  
# numbers less than n. 
def sieveOfEratosthenes(n, isPrime) : 
      
    # Initialize all entries 
    # of boolean array 
    # as true. A value in 
    # isPrime[i] will finally 
    # be false if i is Not a 
    # prime, else true 
    # bool isPrime[n+1]; 
    isPrime[0] = isPrime[1] = False
    for i in range(2, n+1) : 
        isPrime[i] = True
          
    p=2
    while(p * p <= n) : 
          
        # If isPrime[p] is not 
        # changed, then it is 
        # a prime 
        if (isPrime[p] == True) : 
              
            # Update all multiples 
            # of p 
            i=p*2
            while(i <= n) : 
                isPrime[i] = False
                i = i + p 
                  
        p = p + 1
          
# Returns true if n is 
# right-truncatable,  
# else false 
def leftTruPrime(n) : 
    temp = n 
    cnt = 0
  
    # Counting number of 
    # digits in the input 
    # number and checking 
    # whether it contains 
    # 0 as digit or not. 
    while (temp != 0) : 
          
        # counting number  
        # of digits. 
        cnt=cnt + 1 
          
        # checking whether 
        # digit is 0 or not 
        temp1 = temp % 10;  
        if (temp1 == 0) : 
              
            # if digit is 0, 
            # return false. 
            return False 
          
        temp = temp // 10
  
    # Generating primes  
    # using Sieve 
    isPrime = [None] * (n + 1) 
    sieveOfEratosthenes(n, isPrime) 
  
    # Checking whether the 
    # number remains prime 
    # when the leading  
    # ("left") digit is 
    # successively removed 
    for i in range(cnt, 0, -1) : 
      
        # Checking number by  
        # successively removing 
        # leading ("left") digit. 
        # n=113, cnt=3 
        # i=3 mod=1000 n%mod=113 
        # i=2 mod=100 n%mod=13 
        # i=3 mod=10 n%mod=3  
        mod = power(10, i) 
  
        # checking prime 
        if (isPrime[n % mod] != True) :  
              
            # if not prime, 
            # return false 
            return False 
              
    # if remains prime 
    # , return true 
    return True 
  
# Driver program 
n = 113
  
if (leftTruPrime(n)) : 
    print(n, "is left truncatable prime") 
else : 
    print(n, "is not left truncatable prime") 
      
# This code is contributed by Nikita Tiwari. 

