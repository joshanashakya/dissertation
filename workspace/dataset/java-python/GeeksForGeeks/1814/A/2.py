

# Python3 program to check if given  
# number is in given base or not. 
  
def isInGivenBase(Str, base): 
  
    # Allowed bases are till 16 (Hexadecimal) 
    if (base > 16): 
        return False
  
    # If base is below or equal to 10,  
    # then all digits should be from 0 to 9. 
    elif (base <= 10): 
        for i in range(len(Str)): 
            if (Str[i].isnumeric() and 
               (ord(Str[i]) >= ord('0') and 
                ord(Str[i]) < (ord('0') + base)) == False): 
                return False
      
    # If base is below or equal to 16, then all 
    # digits should be from 0 to 9 or from 'A'  
    else: 
        for i in range(len(Str)): 
            if (Str[i].isnumeric() and 
               ((ord(Str[i]) >= ord('0') and 
                 ord(Str[i]) < (ord('0') + base)) or 
                (ord(Str[i]) >= ord('A') and 
                 ord(Str[i]) < (ord('A') + base - 10))) == False): 
                return False
      
    return True
  
# Driver code 
Str = "AF87"
if (isInGivenBase(Str, 16)): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed by Mohit Kumar 

