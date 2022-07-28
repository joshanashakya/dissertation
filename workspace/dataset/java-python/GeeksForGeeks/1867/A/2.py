

# Python3 implementation of the approach 
  
# Function to return the generated 
# by appending "10" n-1 times 
def constructString(n): 
  
    # Initialising as empty 
    s = "" 
    for i in range(n): 
        s += "10"
  
    return s 
  
# Function to return the decimal equivaLent 
# of the given binary string 
def binaryToDecimal(n): 
  
    num = n 
    dec_value = 0
  
    # Initializing base value to 1 
    # i.e 2^0 
    base = 1
  
    Len = len(num) 
    for i in range(Len - 1,-1,-1): 
        if (num[i] == '1'): 
            dec_value += base 
        base = base * 2
  
  
    return dec_value 
  
# Function that calls the constructString 
# and binarytodecimal and returns the answer 
def findNumber(n): 
  
    s = constructString(n - 1) 
    num = binaryToDecimal(s) 
    return num 
  
# Driver code 
n = 4
  
print(findNumber(n)) 
  
# This code is contributed by mohit kumar 29 

