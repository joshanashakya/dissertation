

# Python3 program to find  
# the interior and exterior 
# angle of a given polygon 
  
# function to find  
# the interior and 
# exterior angle 
def findAngle(n): 
  
    # formula to find the 
    # interior angle 
    interiorAngle = int((n - 2) * 180 / n) 
      
    # formula to find  
    # the exterior angle 
    exteriorAngle = int(360 / n) 
  
    # Displaying the output 
    print("Interior angle: " , 
            interiorAngle ) 
  
    print("Exterior angle: " ,  
           exteriorAngle ) 
  
# Driver code 
n = 10
      
# Function calling 
findAngle(n) 
  
# This code is contributed  
# by Smitha 

