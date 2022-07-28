

# Python3 program to find the 
# Area and Perimeter of a Semicircle 
  
# Function for calculating the area 
def area(r): 
      
    # Formula for finding the area 
    return (0.5)*(3.14)*(r * r) 
  
#Function for calculating the perimeter 
def perimeter(r): 
      
    #Formula for finding the perimeter 
    return (3.14)*(r) 
  
# driver code 
if __name__=='__main__': 
    # Get the radius 
    r = 10
  
    # Find the area  
    print ("The Area of Semicircle: "
           ,area(r)) 
  
    # Find the perimeter 
    print ("The Perimeter of Semicircle: "
           ,perimeter(r)) 
             
# This code is contributed by  
# SURENDRA_GANGWAR 

