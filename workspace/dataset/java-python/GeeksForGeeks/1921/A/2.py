

# Python 3 implementation to  
# find Remainder when a large 
# Number is divided by R 
  
# Function to Return Remainder 
def Remainder(str, R):  
  
    # len is variable to store the 
    # length of Number string. 
    l = len(str) 
  
    Rem = 0
  
    # loop that find Remainder 
    for i in range(l): 
  
        Num = Rem * 10 + (ord(str[i]) - 
                          ord('0')) 
        Rem = Num % R 
  
    # Return the remainder 
    return Rem 
  
# Driver code 
if __name__ == "__main__": 
  
    # Get the large number  
    # as string 
    str = "13589234356546756"
  
    # Get the divisor R 
    R = 13
  
    # Find and print the remainder 
    print(Remainder(str, R)) 
  
# This code is contributed  
# by ChitraNayal 

