

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
  
# Driver code 
A = 2
B = 5
C = 7
D = 8
print(XandYandZintercept(A, B, C, D)) 

