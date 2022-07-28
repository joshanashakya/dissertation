

# Python3 program to find minimum number to 
# insert in array so their sum is prime 
  
# function to check if a 
# number is prime or not 
def isPrime(n): 
  
    # Corner case 
    if n <= 1: 
        return False
      
    # Check from 2 to n - 1 
    for i in range(2, n): 
        if n % i == 0: 
            return False
      
    return True
  
# Find prime number  
# greater than a number 
def findPrime(n): 
    num = n + 1
      
    # find prime greater than n 
    while (num): 
          
        # check if num is prime 
        if isPrime(num): 
            return num 
          
        # Increment num 
        num += 1
      
    return 0
  
# To find number to be added 
# so sum of array is prime 
def minNumber(arr): 
    s = 0
      
    # To find sum of array elements 
    for i in range(0, len(arr)): 
        s += arr[i] 
      
    # If sum is already prime  
    # return 0 
    if isPrime(s) : 
        return 0
      
    # To find prime number  
    # greater than sum 
    num = findPrime(s) 
      
    # Return differnece of sum and num 
    return num - s 
  
# Driver code 
arr = [ 2, 4, 6, 8, 12 ] 
print (minNumber(arr)) 
  
# This code is contributed by Sachin Bisht 

