

# Python3 program to convert binary  
# to decimal when input is  
# represented as binary string. 
  
# Function to convert  
# binary to decimal 
def binaryToDecimal(n): 
    num = n; 
    dec_value = 0; 
      
    # Initializing base  
    # value to 1, i.e 2 ^ 0 
    base1 = 1; 
      
    len1 = len(num); 
    for i in range(len1 - 1, -1, -1): 
        if (num[i] == '1'):      
            dec_value += base1; 
        base1 = base1 * 2; 
      
    return dec_value; 
  
# Driver Code 
num = "10101001";  
print(binaryToDecimal(num)); 
  
# This code is contributed by mits 

