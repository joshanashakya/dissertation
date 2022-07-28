

# Python code for checking divisibility by 37 
# function divisible37 which returns True if  
# number is divisible by 37 otherwise False 
def divisibleby37(n): 
    l = len(n) 
    if (n == 0): 
        return True
    
    # Append required 0's at the beginning 
    if (l%3 == 1): 
        n = "00"+ n 
        l += 2
    elif (l%3 == 2): 
        n = "0"+ n 
        l += 1
  
    gSum = 0
    while (l != 0): 
  
        # group saves 3-digit group 
        group = int(n[l-3:l]) 
        l = l-3
  
        # add the series 
        gSum = gSum + group 
  
    # if sum of series gSum has minimum 4  
    # digits in it, then again recursive  
    # call divisibleby37 function 
    if (gSum >= 1000): 
        return(divisibleby37(str(gSum))) 
    else: 
        return (gSum%37==0) 
  
# Driver method to test the above function 
print(divisibleby37("8955795758")) 

