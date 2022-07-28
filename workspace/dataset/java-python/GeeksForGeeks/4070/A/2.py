

# Python 3 program to find point that divides 
# given line in given ratio in 3D. 
  
# Function to find the section of the line 
def section(x1, x2, y1, y2, z1, z2, m, n): 
    # Applying section formula 
    x = ((m * x2) + (n * x1)) / (m + n) 
  
    y = ((m * y2) + (n * y1)) / (m + n) 
  
    z = ((m * z2) + (n * z1)) / (m + n) 
  
    # Printing result 
    print("(",x,",",y,",",z,")") 
  
# Driver code 
if __name__ == '__main__': 
    x1 = 2
    x2 = 4
    y1 = -1
    y2 = 3
    z1 = 4
    z2 = 2
    m = 2
    n = 3
    section(x1, x2, y1, y2, z1, z2, m, n) 
  
#This code is contributed by  
# Surendra_Gangwar 

