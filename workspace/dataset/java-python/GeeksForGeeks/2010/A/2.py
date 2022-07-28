

# Python 3 program to find the side of the  
# largest square that can be inscribed  
# within the hexagon which in return 
# is incsribed within an equilateral triangle 
  
# Function to find the side of the square 
def squareSide(a): 
      
    # Side cannot be negative 
    if (a < 0): 
        return -1
  
    # side of the square 
    x = 0.423 * a 
    return x 
  
# Driver code 
if __name__ == '__main__': 
    a = 8
    print(squareSide(a)) 
  
# This code is contributed by 
# Sanjit_Prasad 

