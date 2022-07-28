

# Python3 implementation of the approach  
mod = 1000000007
  
# Value of inverse modulo  
# 2 with 10^9 + 7  
inv2 = 500000004;  
  
# Function to return num % 1000000007  
# where num is a large number  
def modulo(num) :  
  
    # Initialize result  
    res = 0;  
  
    # One by one process all the  
    # digits of string 'num'  
    for i in range(len(num)) : 
        res = (res * 10 + int(num[i]) - 0) % mod;  
          
    return res;  
  
# Function to return the sum of the  
# integers from the given range  
# modulo 1000000007  
def findSum(L, R) :  
      
    # a stores the value of  
    # L modulo 10^9 + 7  
    a = modulo(L);  
  
    # b stores the value of  
    # R modulo 10^9 + 7  
    b = modulo(R);  
  
    # l stores the sum of natural  
    # numbers from 1 to (a - 1)  
    l = ((a * (a - 1)) % mod * inv2) % mod;  
  
    # r stores the sum of natural  
    # numbers from 1 to b  
    r = ((b * (b + 1)) % mod * inv2) % mod;  
  
    ret = (r % mod - l % mod);  
  
    # If the result is negative  
    if (ret < 0) : 
        ret = ret + mod;  
    else : 
        ret = ret % mod;  
          
    return ret;  
  
# Driver code  
if __name__ == "__main__" :  
  
    L = "88949273204";  
    R = "98429729474298592";  
  
    print(findSum(L, R)) ;  
      
# This code is contributed by AnkitRai01 

