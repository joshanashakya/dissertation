

# Python3 implementation of the approach  
import numpy as np 
  
maxSize = 50
  
# Function to multiply two 7 * 7 matrix  
def matrix_product(a, b) : 
    c = np.zeros((7, 7)); 
      
    for i in range(7) : 
        for j in range(7) : 
            for k in range(7) : 
                c[i][j] += a[i][k] * b[k][j];  
    return c 
  
# Function to perform matrix exponentiation  
def mul_expo(mul, p) : 
  
  
    # 7 * 7 identity matrix  
    s = [ [ 1, 0, 0, 0, 0, 0, 0 ],  
          [ 0, 1, 0, 0, 0, 0, 0 ],  
          [ 0, 0, 1, 0, 0, 0, 0 ],  
          [ 0, 0, 0, 1, 0, 0, 0 ], 
          [ 0, 0, 0, 0, 1, 0, 0 ],  
          [ 0, 0, 0, 0, 0, 1, 0 ],  
          [ 0, 0, 0, 0, 0, 0, 1 ] ];  
  
    # Loop to find the power  
    while (p != 1) : 
        if (p % 2 == 1) : 
            s = matrix_product(s, mul);  
              
        mul = matrix_product(mul, mul);  
        p //= 2;  
  
    return matrix_product(mul, s);  
  
# Function to return the required count  
def expectedSteps(x) :  
  
    # Base cases  
    if (x == 0) : 
        return 0;  
          
    if (x <= 6) : 
        return 6;  
  
    # Multiplier matrix  
    mul = [ [ 7 / 6, 1, 0, 0, 0, 0, 0 ],  
            [ 0, 0, 1, 0, 0, 0, 0 ],  
            [ 0, 0, 0, 1, 0, 0, 0 ],  
            [ 0, 0, 0, 0, 1, 0, 0 ],  
            [ 0, 0, 0, 0, 0, 1, 0 ],  
            [ 0, 0, 0, 0, 0, 0, 1 ],  
            [ -1 / 6, 0, 0, 0, 0, 0, 0 ] ];  
  
    # Finding the required multiplier  
    # i.e mul^(X-6)  
    mul = mul_expo(mul, x - 6);  
  
    # Final answer  
    return (mul[0][0] + mul[1][0] + mul[2][0] + 
            mul[3][0] + mul[4][0] + mul[5][0]) * 6;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 10;  
  
    print(expectedSteps(n - 1));  
      
# This code is contributed by AnkitRai01 

