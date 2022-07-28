

# Python implementation to Check if a 
# number can be expressed as a 
# product of exactly K prime divisors 
  
import math as mt  
  
# function to find K prime divisors 
def KPrimeDivisors(n, k):  
      
    # To count maximum split of N 
    maximum_split = 0
      
    # count number of 2s that divide N 
    while n % 2 == 0:  
        maximum_split+= 1
        n = n // 2
          
    # n must be odd at this point  
    # so we skip one element  
    for i in range(3, mt.ceil(mt.sqrt(n)), 2):  
        while n % i == 0:  
            n = n / i;  
            maximum_split+= 1
              
    # Condition to handle the case when n 
    # is a prime number greater than 2  
    if n > 2:  
        maximum_split+= 1
          
    # check if maximum_split is less than K 
    # then it not possible 
    if maximum_split < k:  
        print("No") 
        return
  
    print("Yes") 
          
      
  
# Driver code  
N = 12
K = 3
KPrimeDivisors(N, K) 

