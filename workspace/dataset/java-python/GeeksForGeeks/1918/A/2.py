

# Python3 implementation of the approach  
  
# Function to return the binary  
# equivalent of decimal value N  
def decimalToBinary(N): 
      
    # To store the binary number  
    B_Number = 0
    cnt = 0
    while (N != 0): 
        rem = N % 2
        c = pow(10, cnt)  
        B_Number += rem * c  
        N //= 2
          
        # Count used to store exponent value  
        cnt += 1
      
    return B_Number  
  
# Driver code  
N = 17
print(decimalToBinary(N)) 
  
# This code is contributed by  
# SHUBHAMSINGH10 

