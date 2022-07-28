

# Python 3 program to find the  
# biggest square which can be  
# inscribed within the semicircle 
  
# Function to find the area 
# of the squaare 
def squarearea(r): 
  
    # the radius cannot be 
    # negative 
    if (r < 0): 
        return -1
  
    # area of the square 
    a = 4 * (pow(r, 2) / 5) 
  
    return a 
  
# Driver code 
if __name__ == "__main__": 
      
    r = 5
    print(int(squarearea(r))) 
  
# This code is contributed 
# by ChitraNayal 

