

# Python3 implementation of the approach 
  
# Function to multiply two complex numbers modulo M 
def Multiply (p, q, M): 
      
    # Multiplication of two complex numbers is  
    # (a + ib)(c + id) = (ac - bd) + i(ad + bc) 
    x = ((p[0] * q[0]) % M - \ 
         (p[1] * q[1]) % M + M) % M 
      
    y = ((p[0] * q[1]) % M + \ 
         (p[1] * q[0]) % M) %M 
  
    # Return the multiplied value 
    return [x, y] 
  
# Function to calculate the 
# complex modular exponentiation 
def compPow(complex, k, M): 
      
    # Here, res is initialised to (1 + i0) 
    res = [1, 0]  
      
    while (k > 0): 
          
        # If k is odd 
        if (k & 1): 
              
            # Multiply 'complex' with 'res' 
            res = Multiply(res, complex, M) 
          
        # Make complex as complex*complex 
        complex = Multiply(complex, complex, M) 
          
        # Make k as k/2 
        k = k >> 1
      
    # Return the required answer 
    return res 
  
# Driver code 
if __name__ == '__main__': 
    A = 7
    B = 3
    k = 10
    M = 97
      
    # Function call 
    ans = compPow([A, B], k, M) 
      
    print(ans[0], "+ i", end = "") 
    print(ans[1]) 
      
# This code is contributed by 
# Surendra_Gangwar 

