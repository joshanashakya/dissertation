

# Python3 program to find the 
# perimeter of a regular polygon 
  
  
# Function to calculate the perimeter 
def Perimeter(s, n): 
    perimeter = 1
    # Calculate Perimeter 
    perimeter = n * s 
  
    return perimeter 
  
# driver code 
if __name__== '__main__': 
    # Get the number of sides 
    n = 5
  
    #Get the length of side 
    s = 2.5
    # find perimeter 
    peri = Perimeter(s, n) 
  
    print("Perimeter of Regular Polygon with"
          ,n,"sides of length",s,"=",peri) 
      
# This code is contributed by 
# SURENDRA_GANGWAR 

