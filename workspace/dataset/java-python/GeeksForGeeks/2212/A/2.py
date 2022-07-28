

# Python3 Program to find Equidigital  
# Numbers till n  
import math 
MAX = 10000;  
  
# Array to store all prime less  
# than and equal to MAX.  
primes = [];  
  
# Utility function for sieve of sundaram  
def sieveSundaram():  
  
    # In general Sieve of Sundaram, produces  
    # primes smaller than (2*x + 2) for a number  
    # given number x. Since we want primes smaller  
    # than MAX, we reduce MAX to half. This array  
    # is used to separate numbers of the form  
    # i+j+2ij from others where 1 <= i <= j  
    marked = [False] * int(MAX / 2 + 1);  
  
    # Main logic of Sundaram. Mark all numbers which  
    # do not generate prime number by doing 2*i+1  
    for i in range(1, int((math.sqrt(MAX) - 1) / 2) + 1):  
        for j in range((i * (i + 1)) << 1,  
                    int(MAX / 2) + 1, 2 * i + 1):  
            marked[j] = True;  
  
    # Since 2 is a prime number  
    primes.append(2);  
  
    # Print other primes. Remaining primes  
    # are of the form 2*i + 1 such that  
    # marked[i] is false.  
    for i in range(1, int(MAX / 2) + 1):  
        if (marked[i] == False):  
            primes.append(2 * i + 1);  
  
# Returns true if n is a Equidigital  
# number, else false.  
def isEquidigital(n): 
  
    if (n == 1):  
        return True;  
  
    # Count digits in original number  
    original_no = n;  
    sumDigits = 0;  
    while (original_no > 0): 
        sumDigits += 1;  
        original_no = int(original_no / 10); 
  
    # Count all digits in prime factors of n  
    # pDigit is going to hold this value.  
    pDigit = 0;  
    count_exp = 0;  
    p = 0; 
    i = 0; 
    while (primes[i] <= int(n / 2)):  
          
        # Count powers of p in n  
        while (n % primes[i] == 0): 
              
            # If primes[i] is a prime factor,  
            p = primes[i];  
            n = int(n / p);  
  
            # Count the power of prime factors  
            count_exp += 1; 
  
        # Add its digits to pDigit.  
        while (p > 0):  
            pDigit += 1;  
            p = int(p / 10);  
  
        # Add digits of power of prime  
        # factors to pDigit.  
        while (count_exp > 1):  
            pDigit += 1;  
            count_exp = int(count_exp / 10); 
        i += 1; 
  
    # If n!=1 then one prime factor  
    # still to be summed up;  
    if (n != 1):  
        while (n > 0): 
            pDigit += 1;  
            n = int(n / 10);  
  
    # If digits in prime factors and  
    # digits in original number are same,  
    # then return true. Else return false.  
    return (pDigit == sumDigits);  
  
# Driver code  
  
# Finding all prime numbers before  
# limit. These numbers are used to 
# find prime factors.  
sieveSundaram();  
  
print("Printing first few Equidigital",  
      "Numbers using isEquidigital()");  
for i in range(1, 20):  
    if (isEquidigital(i)):  
        print(i, end = " ");  
          
# This code is contributed by mits 

