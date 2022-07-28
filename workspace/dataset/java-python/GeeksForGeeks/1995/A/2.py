

# Python3 implementation of prime pairs 
# whose sum is less than n 
  
# Sieve of Sundaram for generating 
# prime numbers less than n 
def SieveOfSundaram(marked, nNew): 
      
    # Main logic of Sundaram. Mark all numbers 
    # of the form i + j + 2ij as true where 
    # 1 <= i <= j 
    for i in range(1, nNew + 1): 
        for j in range(i, nNew): 
            if i + j + 2 * i * j > nNew: 
                break
            marked[i + j + 2 * i * j] = True
  
# Returns number of pairs with fiven conditions. 
def countPrimePairs(n): 
      
    # In general Sieve of Sundaram, produces 
    # primes smaller than (2*x + 2) for a number 
    # given number x. Since we want primes smaller 
    # than n, we reduce n to half 
    nNew = (n - 2) // 2
  
    # This array is used to separate numbers  
    # of the form i+j+2ij from others where 
    # 1 <= i <= j 
    marked = [ False for i in range(nNew + 1)] 
  
    SieveOfSundaram(marked, nNew) 
  
    count, prime_num = 0, 0
  
    # Find primes. Primes are of the form 
    # 2*i + 1 such that marked[i] is false. 
    for i in range(1, nNew + 1): 
        if (marked[i] == False): 
  
            prime_num = 2 * i + 1
  
            # For a given prime number p 
            # number of distinct pairs(i,j) 
            # where (i+j) = p are p/2 
            count = count + (prime_num // 2) 
  
    return count 
  
# Driver Code 
n = 12
print("Number of prime pairs: ",  
             countPrimePairs(n)) 
  
# This code is contributed by Mohit kumar 29 

