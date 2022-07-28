

# Python Program to check Unusual number  
from math import sqrt 
    
# Utility function to find largest  
# prime factor of a number  
def largestPrimeFactor(n): 
  
    # Initialize the maximum prime factor  
    # variable with the lowest one  
    max = -1
    
    # Print the number of 2s that divide n  
    while n % 2 == 0: 
        max = 2;  
        n >>= 1; # equivalent to n /= 2  
    
    # n must be odd at this point, thus skip  
    # the even numbers and iterate only for  
    # odd integers  
    for i in range(3,int(sqrt(n))+1,2):  
        while n % i == 0: 
            max = i;  
            n = n / i;  
    
    # This condition is to handle the case  
    # when n is a prime number greater than 2  
    if n > 2: 
        max = n 
    
    return max 
    
# Function to check Unusual number  
def checkUnusual(n): 
    # Get the largest Prime Factor  
    # of the number  
    factor = largestPrimeFactor(n)  
    
    # Check if largest prime factor  
    # is greater than sqrt(n)  
    if factor > sqrt(n):  
        return True
    else : 
        return False
    
# Driver Code  
if __name__ == '__main__': 
      
    n = 14
    
    if checkUnusual(n):  
        print("YES") 
    else: 
        print("NO") 
  
# This code is contributed  
# by Harshit Saini  

