

# Python3 program to find minimum number to 
# insert in array so their sum is prime 
  
isPrime = [1] * 100005
  
# function to calculate prime  
# using sieve of eratosthenes 
def sieveOfEratostheneses(): 
    isPrime[1] = False
    i = 2
    while i * i < 100005: 
        if(isPrime[i]): 
            j = 2 * i 
            while j < 100005: 
                isPrime[j] = False
                j += i 
        i += 1
    return
  
# Find prime number 
# greater than a number 
def findPrime(n): 
    num = n + 1
      
    # find prime greater than n 
    while(num): 
          
        # check if num is prime 
        if isPrime[num]: 
            return num 
          
        # Increment num 
        num += 1
      
    return 0
  
# To find number to be added  
# so sum of array is prime 
def minNumber(arr): 
      
    # call sieveOfEratostheneses to 
    # calculate primes 
    sieveOfEratostheneses() 
      
    s = 0
      
    # To find sum of array elements 
    for i in range(0, len(arr)): 
        s += arr[i] 
      
    # If sum is already prime  
    # return 0 
    if isPrime[s] == True: 
        return 0
      
    # To find prime number  
    # greater than sum 
    num = findPrime(s) 
      
    # Return differnece of  
    # sum and num 
    return num - s 
  
# Driver code 
arr = [ 2, 4, 6, 8, 12 ] 
print (minNumber(arr)) 
  
# This code is contributed by Sachin Bisht 

