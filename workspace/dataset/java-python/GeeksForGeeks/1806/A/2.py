

# Python3 program to check whether the  
# given number is in binary format 
  
# Function that returns true if  
# given number is in binary format 
# i.e. number contains only 0's and/or 1's 
def isBinary(number): 
  
    while (number > 0): 
        digit = number % 10
  
        # If digit is other than 0 and 1 
        if (digit > 1): 
            return False
        number //= 10
      
    return True
  
# Driver code 
if __name__ == "__main__": 
  
    n = 1000111
    if (isBinary(n) == 1): 
        print ("true") 
    else: 
        print ("false") 
  
# This code is contributed by ita_c 

