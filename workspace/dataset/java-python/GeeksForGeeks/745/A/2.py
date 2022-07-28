

# Python3 implementation of the approach  
from math import sqrt  
  
MAX = 1000000
prime = [0]*(MAX + 1);  
  
# Function to update prime[]  
# such prime[i] stores the  
# count of prime numbers <= i  
def updatePrimes() : 
  
    # prime[] marks all prime numbers as true  
    # so prime[i] = 1 if ith number is a prime  
  
    # Initialization  
    for i in range(2, MAX + 1) :  
        prime[i] = 1;  
  
    # 0 and 1 are not primes  
    prime[0] = prime[1] = 0;  
  
    # Mark composite numbers as false  
    # and prime numbers as true  
    for i in range(2, int(sqrt(MAX) + 1)) : 
        if (prime[i] == 1) : 
            for j in range(i*i, MAX, i) :  
                prime[j] = 0;  
  
    # Update prime[] such that  
    # prime[i] will store the count of  
    # all the prime numbers <= i  
    for i in range(1, MAX) : 
        prime[i] += prime[i - 1];  
  
# Function to return the absolute difference  
# between the number of primes and the number  
# of composite numbers in the range [l, r]  
def getDifference(l, r) : 
  
    # Total elements in the range  
    total = r - l + 1;  
  
    # Count of primes in the range [l, r]  
    primes = prime[r] - prime[l - 1];  
  
    # Count of composite numbers  
    # in the range [l, r]  
    composites = total - primes;  
  
    # Return the sbsolute difference  
    return (abs(primes - composites));  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    queries = [ [ 1, 10 ],[ 5, 30 ] ];  
    q = len(queries);  
  
    updatePrimes();  
  
    # Perform queries  
    for i in range(q) : 
        print(getDifference(queries[i][0],  
                            queries[i][1])) 
              
# This code is contributed by AnkitRai01 

