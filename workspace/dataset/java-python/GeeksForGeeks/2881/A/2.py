

# Recursive Python3 program to convert  
# binary decimal  
  
def toDecimal(binary, i = 0): 
  
    # If we reached last character  
    n = len(binary)  
    if (i == n - 1) : 
        return int(binary[i]) - 0
      
    # Add current tern and recur for  
    # remaining terms  
    return (((int(binary[i]) - 0) << (n - i - 1)) + 
                        toDecimal(binary, i + 1)) 
  
# Driver code  
if __name__ == "__main__" : 
      
    binary = "1010"
    print(toDecimal(binary)) 
  
# This code is contributed by Ryuga 

