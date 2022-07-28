

# Python code for Lehmann's Primality Test 
  
# importing "random" for random operations 
import random 
  
# function to check Lehmann's test 
def lehmann(n, t): 
  
    # generating a random base less than n 
    a = random.randint(2, n-1) 
  
    # calculating exponent 
    e =(n-1)/2
  
    # iterate to check for different base values  
    # for given number of tries 't' 
    while(t>0): 
  
        # calculating final value using formula 
        result =((int)(a**e))% n 
  
        # if not equal, try for different base 
        if((result % n)== 1 or (result % n)==(n-1)): 
            a = random.randint(2, n-1) 
            t-= 1
  
        # else return negative 
        else: 
            return -1
  
    # return positive after attempting 
    return 1
  
# Driver code 
n = 13    # number to be tested 
t = 10    # number of tries 
  
# if n is 2, it is prime 
if(n is 2): 
    print("2 is Prime.") 
  
# if even, it is composite 
if(n % 2 == 0): 
    print(n, "is Composite") 
  
# if odd, check 
else: 
    flag = lehmann(n, t) 
  
    if(flag is 1): 
        print(n, "may be Prime.") 
  
    else: 
        print(n, "is Composite.") 

