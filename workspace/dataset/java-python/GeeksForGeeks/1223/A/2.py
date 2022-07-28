

# Python3 program to find the  
# Surface Area and Volume 
# of Hexagonal Prism. 
import math 
  
# Function to calculate 
# Surface area 
def findSurfaceArea(a, h): 
    Area = 0; 
  
    # Formula to calculate 
    # surface area 
    Area = (6 * a * h + 
            3 * math.sqrt(3) * a * a); 
  
    # Display surface area 
    print("Surface Area:",  
          round(Area, 3)); 
      
# Function to  
# calculate Volume 
def findVolume(a, h): 
    Volume = 0; 
  
    # formula to  
    # calculate Volume 
    Volume = (3 * math.sqrt(3) * 
                a * a * h / 2); 
  
    # Display Volume 
    print("Volume:",  
           round(Volume, 3)); 
  
# Driver Code 
a = 5;  
h = 10; 
  
# surface area 
# function call 
findSurfaceArea(a, h); 
  
# volume function call 
findVolume(a, h); 
  
# This code is contributed  
# by mits 

