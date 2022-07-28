

# Python3 program to implement 
# the above problem 
  
# Function to find the number of triangles 
def findTriangles(n): 
    num = n 
      
  
    # print the number of triangles  
    # having two side common 
    print(num, end = " ") 
  
    # print the number of triangles 
    # having no side common 
    print(num * (num - 4) * (num - 5) // 6) 
  
# Driver code 
  
# initialize the number  
# of sides of a polygon 
n = 6; 
  
findTriangles(n) 
  
# This code is contributed by Mohit Kumar 

