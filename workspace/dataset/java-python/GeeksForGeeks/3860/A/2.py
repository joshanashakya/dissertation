

# Python3 implementation of the approach 
  
# Function to return the required character 
def getChar(strr): 
  
    # To store the summ of the characters 
    # of the given strring 
    summ = 0
  
    for i in range(len(strr)): 
  
        # Add the current character to the summ 
        summ += (ord(strr[i]) - ord('a') + 1) 
  
    # Return the requried character 
    if (summ % 26 == 0): 
        return ord('z') 
    else: 
        summ = summ % 26
        return chr(ord('a') + summ - 1) 
  
# Driver code 
strr = "gfg"
  
print(getChar(strr)) 
  
# This code is contributed by Mohit Kumar 

