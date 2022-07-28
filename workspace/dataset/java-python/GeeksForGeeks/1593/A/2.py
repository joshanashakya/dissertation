

# Python3 program to find K-th smallest factor 
from math import sqrt 
  
# function to find the k'th divisor 
def findkth(n, k): 
      
    # initialize a vector v 
    v = [] 
  
    # store all the divisors so the loop  
    # will needs to run till sqrt ( n ) 
    p = int(sqrt(n)) + 1
    for i in range(1, p, 1): 
        if (n % i == 0): 
            v.append(i) 
            if (i != sqrt(n)): 
                v.append(n / i); 
          
    # sort the vector in an increasing order 
    v.sort(reverse = False) 
  
    # if k is greater than the size of vector 
    # then no divisor can be possible 
    if (k > len(v)): 
        print("Doesn't Exist") 
          
    # else print the (k - 1)th  
    # value of vector 
    else: 
        print(v[k - 1]) 
  
# Driver code 
if __name__ == '__main__': 
    n = 15
    k = 2
  
    findkth(n, k) 
  
# This code is contributed by 
# Surendra_Gangwar 

