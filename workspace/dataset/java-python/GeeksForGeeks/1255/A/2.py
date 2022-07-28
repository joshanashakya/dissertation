

# Python 3 program to check if the 
# concatenation of two numbers 
# is a perfect square or not 
import math 
  
# Function to check if the concatenation  
# is a perfect square 
def checkSquare(s1, s2): 
  
    # Function to convert concatenation of  
    # strings to a number 
    c = int(s1 + s2) 
  
    # square root of number 
    d = math.sqrt(c) 
  
    # check if it is a perfect square 
    if (d * d == c) : 
        print("Yes") 
      
    else: 
        print("No") 
  
# Driver Code 
if __name__ == "__main__": 
      
    s1 = "12"
    s2 = "1"
  
    checkSquare(s1, s2) 
  
# This code is contributed by ita_c 

