

# Python3 program to Binary real number to String. 
  
# Function to convert Binary real 
# number to String 
def toBinary(n): 
  
    # Check if the number is Between  
    # 0 to 1 or Not 
    if (n >= 1 or n <= 0): 
        return "ERROR"; 
  
    frac = 0.5; 
    answer = "."; 
  
    # Setting a limit on length: 32 characters.      
    while (n > 0): 
          
        # 32 char max 
        if (len(answer) >= 32): 
            return "ERROR"; 
              
        # compare the number to .5 
        if (n >= frac): 
            answer += "1"; 
            n = n - frac; 
        else: 
            answer += "0"; 
          
        frac = (frac / 2); 
      
    return answer; 
  
# Driver code 
  
# Input value  
n = 0.625; 
  
result = toBinary(n); 
print("( 0", result, ") in base 2"); 
  
m = 0.72; 
result = toBinary(m); 
print("(", result, ")");  
  
# This code is contributed  
# by mits 

