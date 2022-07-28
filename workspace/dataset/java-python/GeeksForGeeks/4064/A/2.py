

# Python3 implementation of 
# above approach 
  
# function for obtaining the  
# value of f(n) mod 4  
def fnMod(n) : 
  
    # Find the remainder of n 
    # when divided by 4  
    rem = n % 4
  
    # If n is of the form 4k or 4k+3  
    if (rem == 0 or rem == 3) : 
        return 0
  
    # If n is of the form  
    # 4k+1 or 4k+2  
    elif (rem == 1 or rem == 2) : 
        return 1
  
# Driver code      
if __name__ == "__main__" : 
  
    n = 6
    print(fnMod(n)) 
  
# This code is contributed  
# by ANKITRAI1 

