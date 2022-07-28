

# Python3 program to find  
# 10's complement 
import math 
  
# Function to find 10's complement 
def complement(num): 
    i = 0; 
    len = 0; 
    comp = 0; 
      
    # Calculating total  
    # digits in num 
    temp = num; 
    while(1): 
        len += 1; 
        num = int(num / 10); 
        if(abs(num) == 0): 
            break;  
      
    # restore num 
    num = temp; 
      
    # calculate 10's complement 
    comp = math.pow(10, len) - num; 
      
    return int(comp); 
  
# Driver code 
print(complement(25)); 
print(complement(456)); 
  
# This code is contributed by mits  

