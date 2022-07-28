

# Python3 program to find  
# foot of perpendicular  
# of a point in a 3 D plane.  
  
# Function to find foot of perpendicular  
def foot(a, b, c, d, x1, y1, z1) : 
  
    k = (-a * x1 - b * y1 - c * z1 - d) / (a * a + b * b + c * c);  
    x2 = a * k + x1;  
    y2 = b * k + y1;  
    z2 = c * k + z1;  
  
    print("x2 =",round(x2,1))  
    print("y2 =",round(y2,1)) 
    print("z2 =",round(z2,1)) 
  
  
# Driver Code  
if __name__ == "__main__" :  
  
    a = 1
    b = -2 
    c = 0
    d = 0 
    x1 = -1 
    y1 = 3
    z1 = 4 
  
    # function call  
    foot(a, b, c, d, x1, y1, z1)  
  
# This code is contributed by Ryuga  

