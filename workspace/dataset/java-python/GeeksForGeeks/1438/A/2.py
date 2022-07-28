

# Python3 program to 
# make a number odd 
  
# Function to find  
# the value 
def makeOdd(n): 
      
    # Return 1 if  
    # already odd 
    if (n % 2 != 0): 
        return 1; 
          
    # Check how many times 
    # it is divided by 2 
    resul = 1; 
    while (n % 2 == 0): 
        n = n/ 2; 
        resul = resul * 2; 
    return resul; 
  
# Driver code 
n = 36; 
print(makeOdd(n)); 
  
# This code is contributed 
# by mits 

