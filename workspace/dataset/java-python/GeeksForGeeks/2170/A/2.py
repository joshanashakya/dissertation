

# Python3 program to find numbers with  
# exactly n distinct prime factor numbers 
# from a to b 
import math 
  
# Stores all primes less than and  
# equals to sqrt(10^8) = 10000 
primes = []; 
  
# Generate all prime numbers less than  
# or equals to sqrt(10^8) = 10000 
# using sieve of sundaram 
def segmentedSieve(): 
  
    n = 10000; # Square root of 10^8 
  
    # In general Sieve of Sundaram, produces 
    # primes smaller than (2*x + 2) for a  
    # given number x. Since we want primes  
    # smaller than n=10^4, we reduce n to half 
    nNew = int((n - 2) / 2); 
  
    # This array is used to separate  
    # numbers of the form i+j+2ij 
    # from others where 1 <= i <= j 
    marked = [False] * (nNew + 1); 
  
    # Main logic of Sundaram. Mark all  
    # numbers of the form i + j + 2ij  
    # as true where 1 <= i <= j 
    for i in range(1, nNew + 1): 
        j = i; 
        while ((i + j + 2 * i * j) <= nNew): 
            marked[i + j + 2 * i * j] = True; 
            j += 1; 
  
    # Since 2 is a prime number 
    primes.append(2); 
  
    # Remaining primes are of the  
    # form 2*i + 1 such that  
    # marked[i] is false. 
    for i in range(1, nNew + 1): 
        if (marked[i] == False): 
            primes.append(2 * i + 1); 
  
# Function to count all numbers  
# from a to b having exactly n  
# prime factors 
def Nfactors(a, b, n): 
  
    segmentedSieve(); 
  
    # result --> all numbers between  
    # a and b having exactly n prime 
    # factors 
    result = 0; 
  
    # check for each number 
    for i in range(a, b + 1): 
  
        # tmp --> stores square root of   
        # current number because all prime  
        # factors are always less than and 
        # equal to square root of given number 
        # copy --> it holds the copy of  
        #           current number 
        tmp = math.sqrt(i); 
        copy = i; 
  
        # count --> it counts the number of  
        # distinct prime factors of number 
        count = 0; 
  
        # check divisibility of 'copy' with  
        # each prime less than 'tmp' and   
        # divide it until it is divisible 
        # by current prime factor 
        j = 0; 
        while (primes[j] <= tmp): 
            if (copy % primes[j] == 0): 
                  
                # increment count for 
                # distinct prime 
                count += 1; 
                while (copy % primes[j] == 0): 
                    copy = (copy // primes[j]); 
            j += 1; 
  
        # if number is completely divisible 
        # then at last 'copy' will be 1 else  
        # 'copy' will be prime, so increment 
        # count by one 
        if (copy != 1): 
            count += 1; 
  
        # if number has exactly n distinct  
        # primes then increment result by one 
        if (count == n): 
            result += 1; 
  
    return result; 
  
# Driver Code 
a = 1; 
b = 100; 
n = 3; 
print(Nfactors(a, b, n)); 
  
# This code is contributed 
# by chandan_jnu 

