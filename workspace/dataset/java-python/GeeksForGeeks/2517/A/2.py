

# Python3 Program to find the area 
# of the smallest square which 
# can be formed with rectangles 
# of given dimensions 
  
# Recursive function to return gcd of a and b 
def gcd( a, b): 
  
    # Everything divides 0 
    if (a == 0 or b == 0): 
        return 0
  
    # Base case 
    if (a == b): 
        return a 
  
    # a is greater 
    if (a > b): 
        return gcd(a - b, b) 
    return gcd(a, b - a) 
  
  
# Function to find the area 
# of the smallest square 
def squarearea( l, b): 
  
  
    # the length or breadth or side 
    # cannot be negative 
    if (l < 0 or b < 0): 
        return -1
  
  
        # LCM of length and breadth  
    n = (l * b) / gcd(l, b)  
  
        # squaring to get the area 
    return n * n  
      
  
  
# Driver code 
if __name__=='__main__': 
    l = 6
    b = 4
    print(int(squarearea(l, b))) 
  
#This code is contributed by ash264 

