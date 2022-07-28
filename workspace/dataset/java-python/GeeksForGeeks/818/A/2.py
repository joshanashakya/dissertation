

# Python program to find the  
# X, Y and Z intercepts of a plane 
  
def XandYandZintercept(A, B, C, D):  
   
    # For finding the x-intercept  
    # put y = 0 and z = 0 
    x = -D / A 
  
    # For finding the y-intercept  
    # put x = 0 and z = 0  
    y = -D / B  
  
    # For finding the z-intercept  
    # put x = 0 and y = 0 
    z = -D / C 
    return [x, y, z] 
   
def equation_plane(p, q, r):  
    x1 = p[0] 
    y1 = p[1] 
    z1 = p[2] 
    x2 = q[0] 
    y2 = q[1] 
    z2 = q[2] 
    x3 = r[0] 
    y3 = r[1] 
    z3 = r[2] 
      
    # For Finding value of A, B, C, D 
    a1 = x2 - x1 
    b1 = y2 - y1 
    c1 = z2 - z1 
    a2 = x3 - x1 
    b2 = y3 - y1 
    c2 = z3 - z1 
    A = b1 * c2 - b2 * c1 
    B = a2 * c1 - a1 * c2 
    C = a1 * b2 - b1 * a2 
    D = (- A * x1 - B * y1 - C * z1) 
      
    # Calling the first created function  
    print(XandYandZintercept(A, B, C, D))  
      
# Driver Code  
x1 =-1
y1 = 2
z1 = 1
x2 = 0
y2 =-3
z2 = 2
x3 = 1
y3 = 1
z3 =-4
  
equation_plane((x1, y1, z1), (x2, y2, z2), (x3, y3, z3)) 

