

# Python 3 Program to find the biggest rhombus 
# which can be inscribed within the rectangle 
  
  
# Function to find the area 
# of the biggest rhombus 
def rhombusarea(l,b): 
    # the length and breadth cannot be negative 
    if (l < 0 or b < 0): 
        return -1
  
    # area of the rhombus 
    return (l * b) / 2
  
# Driver code 
if __name__ == '__main__': 
    l = 16
    b = 6
    print(rhombusarea(l, b)) 

