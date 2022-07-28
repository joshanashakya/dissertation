

# Python3 Program to find the biggest right circular cylinder 
# that can be fit within a frustum 
  
# Function to find the biggest right circular cylinder 
def cyl(r, R, h) : 
  
    # radii and height cannot be negative 
    if (h < 0 and r < 0 and R < 0) : 
        return -1
  
    # radius of right circular cylinder 
    r1 = r 
    # height of right circular cylinder 
    h1 = h 
    # volume of right circular cylinder 
    V = 3.14 * pow(r1, 2) * h1 
  
    return round(V,2) 
  
  
# Driver code 
if __name__ == "__main__" : 
  
    r, R, h = 7, 11, 6
  
    print(cyl(r, R, h)) 
  
# This code is contributed by Ryuga 

