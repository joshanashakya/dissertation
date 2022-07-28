

# Python3 program to find  
# sum of given series 
  
# Function to find 
# sum of series 
# up-to n terms 
def seriesSum(n): 
      
    # initializing  
    # counter by 1 
    i = 1; 
      
    # variable to  
    # calculate result 
    res = 0.0; 
    sign = True; 
      
    # while loop until nth  
    # term is not reached 
    while (n > 0):  
        n = n - 1; 
          
        # boolean type variable  
        # for checking validation 
        if (sign): 
            sign = False; 
            res = res + (i + 1) / (i + 2); 
            i = i + 2; 
        else: 
            sign = True; 
            res = res - (i + 1) / (i + 2); 
            i = i + 2; 
      
    return res; 
  
# Driver Code 
n = 5; 
print(round(seriesSum(n), 6));  
  
# This code is contributed  
# by mits 

