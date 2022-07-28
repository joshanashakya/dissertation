

# Python3 program to find the 
# incenter of a triangle 
  
# Driver code 
  
# coordinate of the vertices 
x1 = 2; x2 = 1; x3 = 3; 
y1 = 2; y2 = 1; y3 = 1; 
a = 2; b = 1; c = 1; 
  
# Formula to calculate in-center 
x = (a * x1 + b * x2 + c * x3) / (a + b + c); 
y = (a * y1 + b * y2 + c * y3) / (a + b + c); 
  
# System.out.print(setprecision(3)); 
print("Incenter = (", x, ",", y, ")"); 
  
# This code is contributed  
# by Akanksha Rai 

