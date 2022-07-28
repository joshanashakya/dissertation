

# Python3 implementation of the approach 
  
# Function that returns true if it is  
# possible to move from source to the  
# destination with the given moves 
def isPossible(Sx, Sy, Dx, Dy, x, y): 
    if (abs(Sx - Dx) % x == 0 and 
        abs(Sy - Dy) % y == 0 and 
       (abs(Sx - Dx) / x) % 2 == 
       (abs(Sy - Dy) / y) % 2): 
        return True; 
    return False; 
  
# Driver code 
Sx = 0;  
Sy = 0;  
Dx = 0;  
Dy = 0;  
x = 3;  
y = 4; 
  
if (isPossible(Sx, Sy, Dx, Dy, x, y)): 
    print("Yes"); 
else: 
    print("No"); 
  
# This code is contributed by mits 

