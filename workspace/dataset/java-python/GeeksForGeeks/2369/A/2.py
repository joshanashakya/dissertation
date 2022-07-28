

# Python3 program to find percentage increase 
# in the volume of the sphere 
# if radius is increased by a given percentage 
  
def newvol(x): 
  
    print("percentage increase in the"
        " volume of the sphere is "
        ,pow(x, 3) / 10000 + 3 * x 
                + (3 * pow(x, 2)) / 100
            ,"%") 
  
# Driver code 
x = 10.0
newvol(x) 
  
# This code is contributed mohit kumar 29 

