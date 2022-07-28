

# Python3 Program to find the biggest circle 
# which can be inscribed within the semicircle 
  
# Function to find the area 
# of the circle 
def circlearea(R) : 
  
    # Radius cannot be negative 
    if (R < 0) : 
        return -1; 
  
    # Area of the largest circle 
    a = (3.14 * R * R) / 4; 
  
    return a; 
  
# Driver code 
if __name__ == "__main__" : 
  
    R = 2; 
    print(circlearea(R)) ; 
      
# This code is contributed by AnkitRai01 

