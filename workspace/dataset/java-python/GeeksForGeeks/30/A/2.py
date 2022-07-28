

# Python 3 program to find the minimum 
# number to be added to N to 
# make it a prime number 
  
# Function to check if a given number 
# is a prime or not 
def isPrime(n): 
  
    # Base cases 
    if (n <= 1): 
        return False
    if (n <= 3): 
        return True
   
    # This is checked so that we can skip 
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0): 
        return False
   
    # For all the remaining numbers, check if 
    # any number is a factor if the number 
    # or not 
    i = 5 
    while (i * i <= n ): 
        if (n % i == 0 or n % (i + 2) == 0): 
            return False
        i += 6
   
    # If none of the above numbers are the 
    # factors for the number, then the 
    # given number is prime 
    return True
   
# Function to return the smallest 
# number to be added to make a 
# number prime 
def findSmallest(N): 
   
    # Base case 
    if (N == 0): 
        return 2
    if (N == 1): 
        return 1
   
    prime , counter = N, 0
    found = False
   
    # Loop continuously until isPrime returns 
    # true for a number greater than n 
    while (not found): 
        if (isPrime(prime)): 
            found = True
        else : 
   
            # If the number is not a prime, then 
            # increment the number by 1 and the 
            # counter which stores the number 
            # to be added 
            prime += 1
            counter += 1 
    return counter 
   
# Driver code 
if __name__ == "__main__": 
  
    N = 10
   
    print(findSmallest(N)) 
   
# This code is contributed by chitranayal 
    

