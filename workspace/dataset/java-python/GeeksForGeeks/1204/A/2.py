

# Python3 implementation of the approach  
from math import sqrt 
  
# Sieve of prime numbers  
def primesieve(prime) : 
  
    # Sieve to store whether a  
    # number is prime or not in  
    # O(nlog(log(n)))  
    prime[1] = False;  
  
    for p in range(2, int(sqrt(650)) + 1) : 
        if (prime[p] == True) : 
            for i in range(p * 2, 651, p) :  
                prime[i] = False;  
  
# Function to return sum of digit  
# and sum of square of digit  
def sum_sqsum(n) : 
  
    sum = 0;  
    sqsum = 0;  
  
    # Until number is not  
    # zero  
    while (n) : 
        x = n % 10;  
        sum += x;  
        sqsum += x * x;  
        n //= 10;  
  
    return (sum, sqsum);  
  
# Function to return the count  
# of number form L to R  
# whose sum of digits and  
# sum of square of digits  
# are prime  
def countnumber(L, R):  
  
    prime = [True] * 651;  
  
    primesieve(prime);  
  
    cnt = 0;  
  
    # Iterate for each value  
    # in the range of L to R  
    for i in range(L, R + 1) : 
          
        # digit.first stores sum of digits  
        # digit.second stores sum of  
        # square of digit  
        digit = sum_sqsum(i);  
  
        # If sum of digits and sum of  
        # square of digit both are  
        # prime then increment the count  
        if (prime[digit[0]] and prime[digit[1]]) : 
            cnt += 1;  
  
    return cnt;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    L = 10;  
    R = 20;  
  
    print(countnumber(L, R));  
  
# This code is contributed by AnkitRai01 

