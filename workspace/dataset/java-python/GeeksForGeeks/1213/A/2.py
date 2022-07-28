

# Python 3 Program to find the area of the circle 
# which can be inscribed within the rhombus 
  
  
# Function to find the area 
# of the inscribed circle 
def circlearea(a, b): 
  
    # the diagonals cannot be negative 
    if (a < 0 or b < 0): 
        return -1
  
    # area of the circle 
    A = ((3.14 * pow(a, 2) * pow(b, 2))/
        (4 * (pow(a, 2) + pow(b, 2)))) 
    return A 
  
# Driver code 
if __name__ == "__main__": 
    a = 8
    b = 10
    print( circlearea(a, b)) 
  
# This code is contributed by ChitraNayal 

