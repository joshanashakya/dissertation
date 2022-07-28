

# Python3 program to count numbers  
# with n divisors  
import math; 
  
# applying sieve of eratosthenes  
def sieve(primes, x): 
    primes[1] = False; 
      
    # if a number is prime mark all  
    # its multiples as non prime 
    i = 2; 
    while (i * i <= x): 
        if (primes[i] == True): 
            j = 2; 
            while (j * i <= x): 
                primes[i * j] = False; 
                j += 1; 
        i += 1; 
  
# function that returns numbers of number  
# that have n divisors in range from a to b. 
# x is sqrt(b) + 1.  
def nDivisors(primes, x, a, b, n): 
      
    # result holds number of numbers 
    # having n divisors  
    result = 0;  
  
    # vector to hold all the prime  
    # numbers between 1 and sqrt(b)  
    v = [];  
    for i in range(2, x + 1):  
        if (primes[i]):  
            v.append(i);  
  
    # Traversing all numbers in given range  
    for i in range(a, b + 1):  
          
        # initialising temp as i  
        temp = i;  
  
        # total holds the number of  
        # divisors of i  
        total = 1;  
        j = 0;  
  
        # we need to use that prime numbers that  
        # are less than equal to sqrt(temp) 
        k = v[j]; 
        while (k * k <= temp): 
              
            # holds the exponent of k in prime  
            # factorization of i  
            count = 0;  
  
            # repeatedly divide temp by k till it is  
            # divisible and accordingly increase count  
            while (temp % k == 0): 
                count += 1;  
                temp = int(temp / k);  
  
            # using the formula no.of divisors =  
            # (e1+1)*(e2+1)....  
            total = total * (count + 1); 
            j += 1; 
            k = v[j]; 
  
        # if temp is not equal to 1 then there is  
        # prime number in prime factorization of i  
        # greater than sqrt(i)  
        if (temp != 1):  
            total = total * 2;  
  
        # if i is a ndivisor number  
        # increase result  
        if (total == n):  
            result += 1;  
    return result;  
  
# Returns count of numbers in [a..b]  
# having n divisors.  
def countNDivisors(a, b, n):  
    x = int(math.sqrt(b) + 1);  
  
    # primes[i] = true if i is a prime number  
    # initialising each number as prime  
    primes = [True] * (x + 1); 
    sieve(primes, x);  
  
    return nDivisors(primes, x, a, b, n);  
  
# Driver code  
a = 1; 
b = 7; 
n = 2;  
print(countNDivisors(a, b, n));  
  
# This code is contributed by mits 

