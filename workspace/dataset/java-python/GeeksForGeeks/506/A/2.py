

# Python3 Program to check if the  
# nth is odd or even in a 
# sequence where each term is  
# sum of previous two term 
  
# Return if the nth  
# term is even or odd. 
def findNature(a, b, n): 
    if (n == 0): 
        return (a & 1); 
  
    if (n == 1): 
        return (b & 1); 
  
    # If a is even 
    if ((a & 1) == 0):  
  
        # If b is even 
        if ((b & 1) == 0):  
            return False; 
          
        # If b is odd 
        else: 
            return True if(n % 3 != 0) else False; 
  
    # If a is odd 
    else: 
        # If b is odd 
        if ((b & 1) == 0):  
            return True if((n - 1) % 3 != 0) else False; 
  
        # If b is eve 
        else: 
            return True if((n + 1) % 3 != 0) else False; 
  
# Driver Code 
a = 2;  
b = 4; 
n = 3; 
  
if (findNature(a, b, n) == True): 
    print("Odd", end = " "); 
else: 
    print("Even", end = " "); 
      
# This code is contributed by mits 

