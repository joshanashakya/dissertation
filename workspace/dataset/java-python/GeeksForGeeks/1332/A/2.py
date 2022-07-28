

# Python3 program to find if it is possible  
# to write a number n as product of exactly k 
# positive numbers greater than 1. 
import math as mt 
  
# Prints k factors of n if n can be written 
# as multiple of k numbers. Else prints -1 
def kFactors(n, k): 
      
    # list to store all prime factors of n 
    a = list() 
      
    #insert all 2's in list 
    while n % 2 == 0: 
        a.append(2) 
        n = n // 2
          
    # n must be odd at this point 
    # so we skip one element(i=i+2) 
    for i in range(3, mt.ceil(mt.sqrt(n)), 2): 
        while n % i == 0: 
            n = n / i; 
            a.append(i) 
              
    # This is to handle when n>2 and 
    # n is prime 
    if n > 2: 
        a.append(n) 
          
    # if size(a)<k,k factors are not possible 
    if len(a) < k: 
        print("-1") 
        return
          
    # printing first k-1 factors 
    for i in range(k - 1): 
        print(a[i], end = ", ") 
      
    # calculating and printing product  
    # of rest of numbers 
    product = 1
      
    for i in range(k - 1, len(a)): 
        product *= a[i] 
    print(product) 
  
# Driver code 
n, k = 54, 3
kFactors(n, k) 
  
# This code is contributed  
# by mohit kumar 29 

