

# Python3 implementation of the approach 
MAX = 10
  
# Function that returns true 
# if ch is a digit 
def isDigit(ch): 
    ch = ord(ch) 
    if (ch >= ord('0') and ch <= ord('9')): 
        return True
    return False
  
# Function that returns true 
# if st contains all the 
# digits from 0 to 9 
def allDigits(st, le): 
  
    # To mark the present digits 
    present = [False for i in range(MAX)] 
  
    # For every character of the sting 
    for i in range(le): 
  
        # If the current character is a digit 
        if (isDigit(st[i])): 
  
            # Mark the current digit as present 
            digit = ord(st[i]) - ord('0') 
            present[digit] = True
  
    # For every digit from 0 to 9 
    for i in range(MAX): 
  
        # If the current digit is 
        # not present in st 
        if (present[i] == False): 
            return False
  
    return True
  
# Driver code 
st = "Geeks12345for69708"
le = len(st) 
  
if (allDigits(st, le)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

