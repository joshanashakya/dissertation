

# Python3 program to find the maximum angle  
# at which we can tilt the bottle  
# without spilling any water  
from math import *
  
def find_angle(x, y, z) : 
  
    # Now we have the volume  
    # of rectangular prism a*a*b  
    volume = x * x * y;  
  
    ans = 0;  
  
    # Now we have 2 cases!  
    if (z < volume // 2) : 
  
        d = (x * y * y) / (2.0 * z);  
  
        # Taking the tangent inverse of value d  
        # As we want to take out the required angle  
        ans = atan(d);  
  
    else : 
  
        z = volume - z;  
        d = (2 * z) / (float)(x * x * x);  
  
        # Taking the tangent inverse of value d  
        # As we want to take out the required angle  
        ans = atan(d);  
      
    # As of now the angle is in radian.  
    # So we have to convert it in degree.  
    ans = (ans * 180) / 3.14159265;  
  
    return round(ans, 4);  
  
# Driver Code 
if __name__ == "__main__" :  
  
    # Enter the Base square side length  
    x = 12;  
  
    # Enter the Height of rectangular prism  
    y = 21;  
  
    # Enter the Base square side length  
    z = 10;  
  
    print(find_angle(x, y, z));  
  
# This code is contributed by AnkitRai01 

