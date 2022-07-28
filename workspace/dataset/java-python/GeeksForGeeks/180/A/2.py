

# Python 3 program to check if the 
# concatenation of two numbers 
# is a perfect cube or not 
  
# Function to check if a number is 
# a perfect Cube or not 
def isPerfectCube(x): 
    x = abs(x) 
    return int(round(x ** (1. / 3))) ** 3 == x 
  
# Function to check if 
# concatenation of two numbers 
# is a perfect cube or not 
def checkCube(a, b): 
  
    # Convert numbers to string 
    # using to_string() 
    s1 = str(a) 
    s2 = str(b) 
  
    # Concatenate the numbers and 
    # convert it into integer 
    c = int(s1 + s2) 
  
    # Check if concatenated value 
    # is perfect cube or not 
    if (isPerfectCube(c)): 
        print("Yes") 
    else: 
        print("No") 
  
# Driver Code 
if __name__ == '__main__': 
    a = 6
    b = 4
  
    checkCube(a, b) 
      
# This code is contributed by Surendra_Gangwar 

