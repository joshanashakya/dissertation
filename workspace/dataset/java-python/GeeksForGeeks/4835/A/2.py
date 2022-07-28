

# Python3 program to compute  
# exponential value  
# using (2^k) -ary method. 
  
# prime modulo value 
N = 1000000007;  
  
def exponentiation(bas, exp): 
    t = 1; 
    while(exp > 0):  
  
        # for cases where exponent 
        # is not an even value 
        if (exp % 2 != 0): 
            t = (t * bas) % N; 
  
        bas = (bas * bas) % N; 
        exp = int(exp / 2); 
    return t % N; 
  
# Driver Code  
bas = 5; 
exp = 100000; 
  
modulo = exponentiation(bas,exp); 
print(modulo); 
  
# This code is contributed 
# by mits 

