

# Python3 implementation to find the binary 
# representation of next greater integer 
  
# function to find the required 
# binary representation 
def nextGreater(num1): 
  
    l = len(num1); 
    num = list(num1); 
  
    # examine bits from the right 
    i = l-1; 
    while(i >= 0): 
        # if '0' is encountered, convert 
        # it to '1' and then break 
        if (num[i] == '0'): 
            num[i] = '1'; 
            break; 
  
        # else convert '1' to '0' 
        else: 
            num[i] = '0'; 
        i-=1; 
  
    # if the binary representation 
    # contains only the set bits 
    num1 = ''.join(num); 
    if (i < 0): 
        num1 = '1' + num1; 
  
    # final binary representation 
    # of the required integer 
    return num1; 
  
# Driver Code 
num = "10011"; 
print("Binary representation of next number = ",nextGreater(num)); 
  
# This code is contributed by mits 

