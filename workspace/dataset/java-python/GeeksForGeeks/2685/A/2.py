

# Python 3 program to check if a given string 
# is a valid integer 
  
# This function Returns true if 
# s is a number else false 
def isNumber(s) : 
      
    for i in range(len(s)) : 
        if s[i].isdigit() != True : 
            return False
  
    return True
  
# Driver code 
if __name__ == "__main__" : 
  
    # Store the input in a str variable 
    str  = "6790"
  
    if isNumber(str) : 
        print("Integer") 
  
    else : 
        print("String") 
  
# This code is contributed by ANKITRAI1 

