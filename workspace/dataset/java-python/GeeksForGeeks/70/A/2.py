

# Python3 program to check 
# whether a number can be 
# expressed as a product of 
# single digit numbers 
  
# Number of single digit 
# prime numbers 
SIZE = 4
  
# function to check whether 
# a number can be 
# expressed as a product 
# of single digit numbers 
def productOfSingelDgt(n): 
  
    # if 'n' is a single digit 
        # number, then 
    # it can be expressed 
    if n >= 0 and n <= 9: 
        return True
  
    # define single digit prime 
        # numbers array 
    prime = [ 2, 3, 5, 7 ] 
  
    # repeatedly divide 'n' by 
        # the given prime  
    # numbers until all the  
        # numbers are used  
    # or 'n' > 1 
    i = 0
    while i < SIZE and n > 1: 
        while n % prime[i] == 0: 
            n = n / prime[i] 
        i += 1
  
    # if true, then 'n' can 
    # be expressed 
    return n == 1
  
n = 24
if productOfSingelDgt(n): 
    print ("Yes") 
else : 
    print ("No") 
  
# This code is contributed 
# by Shreyanshi Arun. 

