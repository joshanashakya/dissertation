

# Python 3 implementation of the approach 
  
# Function to create Sieve for Semi Prime Numbers 
def createSemiPrimeSieve(n): 
    v = [0 for i in range(n + 1)] 
  
    # This array will initially store the indexes 
    # After performing below operations if any 
    # element of array becomes 1 this means 
    # that the given index is a semi-prime number 
  
    # Storing indices in each element of vector 
    for i in range(1, n + 1): 
        v[i] = i 
  
    countDivision = [0 for i in range(n + 1)] 
  
    for i in range(n + 1): 
        countDivision[i] = 2
  
    # This array will initially be initialized by 2 and 
    # will just count the divisions of a number 
    # As a semiprime number has only 2 prime factors 
    # which means after dividing by the 2 prime numbers 
    # if the index countDivision[x] = 0 and v[x] = 1 
    # this means that x is a semiprime number 
  
    # If number a is prime then its 
    # countDivision[a] = 2 and v[a] = a 
  
    for i in range(2, n + 1, 1): 
          
        # If v[i] != i this means that it is 
        # not a prime number as it contains 
        # a divisor which has already divided it 
        # same reason if countDivision[i] != 2 
        if (v[i] == i and countDivision[i] == 2): 
              
            # j goes for each factor of i 
            for j in range(2 * i, n + 1, i): 
                if (countDivision[j] > 0): 
                      
                    # Dividing the number by i 
                    # and storing the dividend 
                    v[j] = int(v[j] / i) 
  
                    # Decreasing the countDivision 
                    countDivision[j] -= 1
                      
    # A new vector to store all Semi Primes 
    res = [] 
  
    for i in range(2, n + 1, 1): 
          
        # If a number becomes one and 
        # its countDivision becomes 0 
        # it means the number has 
        # two prime divisors 
        if (v[i] == 1 and countDivision[i] == 0): 
            res.append(i) 
  
    return res 
  
# Driver code 
if __name__ == '__main__': 
    n = 16
    semiPrime = createSemiPrimeSieve(n) 
  
    # Print all semi-primes 
    for i in range(len(semiPrime)): 
        print(semiPrime[i], end = " ") 
          
# This code is contributed by 
# Surendra_Gangwar 

