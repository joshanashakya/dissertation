

# Python3 program to binary real number to string 
  
# Function to convert Binary real 
# number to String 
def toBinary(n): 
  
    # Check if the number is Between 0 to 1 or Not 
    if(n >= 1 or n <= 0): 
        return "ERROR"
  
    answer = "" 
    frac = 0.5
    answer = answer + "."
  
    # Setting a limit on length: 32 characters. 
    while(n > 0): 
  
        # Setting a limit on length: 32 characters 
        if(len(answer) >= 32): 
            return "ERROR"
  
        # Multiply n by 2 to check it 1 or 0 
        b = n * 2
        if (b >= 1): 
  
            answer = answer + "1"
            n = b - 1
  
        else: 
            answer = answer + "0"
            n = b 
  
    return answer 
  
# Driver code 
if __name__=='__main__': 
    n = 0.625
    result = toBinary(n) 
    print("(0", result, ") in base 2") 
    m = 0.72
    result = toBinary(m) 
    print("(", result, ")") 
  
# This code is contributed by 
# Sanjit_Prasad 

