

# A Python3 program to check the given 
# subarray is prime or not 
  
# function to check the array 
def isPrime(a, lower, upper) : 
    n = 0
  
    # Calculate the sum of  
    # the subarray 
    for i in range(lower - 1, upper) : 
        n = n + a[i] 
  
    # check the sum of the  
    # subarray is prime or  
    # not (Corner case) 
    if (n <= 1) : 
        return False
  
    # Check from 2 to n - 1 
    for i in range(2, n) : 
        if (n % i == 0) : 
            return False
      
    return True
  
# Driver Code 
  
# taking input 
a = [1, 2, 3, 5, 5, 4, 7, 8, 9] 
lower = 3
upper = 6
if (isPrime(a, lower, upper)) : 
    print ("Yes") 
else : 
    print ("No") 
  
# This code is contributed by  
# Manish Shaw (manishshaw1) 

