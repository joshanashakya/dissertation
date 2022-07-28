

# Python3 program to find the sum of prime  
# factors of all numbers in range [L-R]  
  
def isPrime(n): 
      
    i = 2
    while i * i <= n: 
  
        # n has a factor, hence not a prime  
        if (n % i == 0): 
            return False
        i += 1
          
    # we reach here if n has no factors  
    # and hence n is a prime number  
    return True
      
def sum(l, r): 
    sum = 0
  
    # iterate from lower to upper  
    for i in range(l, r + 1) : 
  
        # if i is prime, it has no factors  
        if (isPrime(i)) : 
            continue
        for j in range(2, i): 
  
            # check if j is a prime factor of i  
            if (i % j == 0 and isPrime(j)) : 
                sum += j 
          
    return sum
      
# Driver code 
if __name__ == "__main__": 
        l = 18
        r = 25
        print(sum(l, r)) 
  
# This code is contributed by ita_c 

