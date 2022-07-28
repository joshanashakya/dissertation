

# Python 3 program to find the Smallest  
# Special Prime which is greater than or 
# equal to a given number 
  
# Function to check whether the number 
# is a special prime or not 
def checkSpecialPrime(sieve, num): 
      
    # While number is not equal to zero 
    while (num): 
          
        # If the number is not prime 
        # return false. 
        if (sieve[num] == False): 
            return False
  
        # Else remove the last digit 
        # by dividing the number by 10. 
        num = int(num / 10) 
  
    # If the number has become zero 
    # then the number is special prime, 
    # hence return true 
    return True
  
# Function to find the Smallest Special 
# Prime which is greater than or equal 
# to a given number 
def findSpecialPrime(N): 
    sieve = [True for i in range(N * 10 + 1)] 
  
    sieve[0] = False
    sieve[1] = False
  
    # sieve for finding the Primes 
    for i in range(2, N * 10 + 1): 
        if (sieve[i]): 
            for j in range(i * i, N * 10 + 1, i): 
                sieve[j] = False
      
    # There is always an answer possible 
    while (True): 
          
        # Checking if the number is a 
        # special prime or not 
        if (checkSpecialPrime(sieve, N)): 
              
            # If yes print the number 
            # and break the loop. 
            print(N) 
            break
      
        # Else increment the number. 
        else: 
            N += 1
  
# Driver code 
if __name__ == '__main__': 
    N = 379
  
    findSpecialPrime(N) 
  
    N = 100
    findSpecialPrime(N) 
  
# This code is contributed by 
# Surendra_Gangwar 

