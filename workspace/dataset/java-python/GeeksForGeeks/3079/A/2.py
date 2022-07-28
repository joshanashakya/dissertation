

# Python3 program for modular multiplication  
# without any overflow 
  
# To compute (a * b) % mod 
def mulmod(a, b, mod): 
  
    res = 0; # Initialize result 
    a = a % mod; 
    while (b > 0): 
      
        # If b is odd, add 'a' to result 
        if (b % 2 == 1): 
            res = (res + a) % mod; 
  
        # Multiply 'a' with 2 
        a = (a * 2) % mod; 
  
        # Divide b by 2 
        b //= 2; 
  
    # Return result 
    return res % mod; 
  
# Driver Code 
a = 9223372036854775807; 
b = 9223372036854775807; 
print(mulmod(a, b, 100000000000)); 
  
# This code is contributed by mits 

