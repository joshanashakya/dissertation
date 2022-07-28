

# Python program to find  
# the Shortest distance  
# between a point and  
# a circle  
   
# Function to find the shortest distance  
def dist(x1, y1, x2, y2, r):  
    print("The shortest distance between a point and a circle is "
    ,((((x2 - x1)** 2) + ((y2 - y1)** 2))**(1/2)) - r); 
  
   
# Driver code  
x1 = 4; 
y1 = 6;  
x2 = 35; 
y2 = 42; 
r = 5;  
dist(x1, y1, x2, y2, r);  
  
  
# This code has been contributed by 29AjayKumar 

