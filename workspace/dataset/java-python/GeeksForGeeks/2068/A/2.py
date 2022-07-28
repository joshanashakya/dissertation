

# Python 3 Program to Find First  
# element in AP which is   
# multiple of given prime 
  
# Iterative Function to calculate   
# (x^y)%p in O(log y)  
def power(x, y, p) : 
  
    # Initialize result 
    res = 1
  
    # Update x if it is more than or  
    # equal to p  
    x = x % p 
  
    while y > 0 : 
  
        # If y is odd, multiply x with result  
        if y & 1 : 
            res = (res * x) % p 
  
        # y must be even now 
        #  y = y/2  
        y = y >> 1
        x = (x * x) % p 
  
    return res 
  
# function to find nearest element in common 
def NearestElement(A, D, P) : 
  
    # base conditions  
    if A == 0 : 
        return 0
  
    elif D == 0 : 
        return -1
  
    else : 
        X = power(D, P - 2, P) 
        return (X * (P - A)) % P 
      
# Driver Code 
if __name__ == "__main__" : 
      
    A, D, P = 4, 9, 11
  
    # module both A and D  
    A %= P 
    D %= P 
  
    # function call 
    print(NearestElement(A, D, P)) 
      
# This code is contributed by ANKITRAI1 

