

# Python3 implementation to find the binary 
# representation of previous number 
  
# function to find the required 
# binary representation 
def previousNumber(num1): 
    n = len(num1); 
    num = list(num1); 
  
    # if the number is '1' 
    if (num1 == "1"): 
        return "0"; 
    i = n - 1; 
      
    # examine bits from right to left 
    while (i >= 0): 
  
        # if '1' is encountered, convert 
        # it to '0' and then break 
        if (num[i] == '1'): 
            num[i] = '0'; 
            break; 
  
        # else convert '0' to '1' 
        else: 
            num[i] = '1'; 
        i -= 1; 
  
    # if only the 1st bit in the 
    # binary representation was '1' 
    if (i == 0): 
        return num[1:n]; 
  
    # final binary representation 
    # of the required number 
    return '' . join(num); 
  
# Driver code 
num = "10110"; 
print("Binary representation of previous number =",  
                              previousNumber(num)); 
      
# This code is contributed by mits 

