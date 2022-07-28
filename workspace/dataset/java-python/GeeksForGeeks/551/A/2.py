

# Python 3 program to print the 
# Number which has the maximum number 
# of distinct prime factors of 
# numbers in range m to n 
  
# Function to return the maximum number 
def maximumNumberDistinctPrimeRange(m, n): 
  
    # array to store the number  
    # of distinct primes 
    factorCount = [0] * (n + 1) 
  
    # true if index 'i' is a prime 
    prime = [False] * (n + 1) 
  
    # initializing the number of 
    # factors to 0 and 
    for i in range(n + 1) : 
        factorCount[i] = 0
        prime[i] = True # Used in Sieve 
  
    for i in range(2, n + 1) : 
  
        # condition works only when 'i'  
        # is prime, hence for factors of 
        # all prime number, the prime  
        # status is changed to false 
        if (prime[i] == True) : 
  
            # Number is prime 
            factorCount[i] = 1
  
            # number of factor of a  
            # prime number is 1 
            for j in range(i * 2, n + 1, i) : 
  
                # incrementing factorCount all 
                # the factors of i 
                factorCount[j] += 1
  
                # and changing prime status 
                # to false 
                prime[j] = False
  
    # Initialize the max and num 
    max = factorCount[m] 
    num = m 
  
    # Gets the maximum number 
    for i in range(m, n + 1) : 
  
        # Gets the maximum number 
        if (factorCount[i] > max) : 
            max = factorCount[i] 
            num = i 
    return num 
  
# Driver code 
if __name__ == "__main__": 
    m = 4
    n = 6
      
    # Calling function 
    print(maximumNumberDistinctPrimeRange(m, n)) 
      
# This code is contributed 
# by ChitraNayal 

