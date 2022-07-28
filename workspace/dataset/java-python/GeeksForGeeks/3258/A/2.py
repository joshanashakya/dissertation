

# Python3 program to find  
# the number of triangles  
# in a plane if no more 
# then two points are collinear. 
  
# Function to find number 
# of triangles in a plane. 
def countNumberOfTriangles(n) : 
      
    # Formula to find  
    # number of triangles 
    # nC3 = n * (n - 1) * 
    # (n - 2) / 6 
    return (n * (n - 1) * 
                (n - 2) // 6) 
  
# Driver Code 
if __name__ == '__main__' : 
      
    n = 4
    print(countNumberOfTriangles(n)) 
  
                  
# This code is contributed 
# by ajit 

