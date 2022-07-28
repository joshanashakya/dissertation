

# Python3 implementation to find 
# the type of triangle with 
# the help of the sides 
  
# Function to find the type of 
# triangle with the help of sides 
def checkTypeOfTriangle(a,b,c): 
    sqa = pow(a, 2) 
    sqb = pow(b, 2) 
    sqc = pow(c, 2) 
  
    if (sqa == sqa + sqb or
        sqb == sqa + sqc or
        sqc == sqa + sqb): 
        print("Right-angled Triangle") 
  
    elif(sqa > sqc + sqb or
            sqb > sqa + sqc or
            sqc > sqa + sqb): 
        print("Obtuse-angled Triangle") 
  
    else: 
        print("Acute-angled Triangle") 
  
# Driver Code 
if __name__ == '__main__': 
    a = 2
    b = 2
    c = 2
  
    # Function Call 
    checkTypeOfTriangle(a, b, c) 
  
# This code is contributed by mohit kumar 29 

