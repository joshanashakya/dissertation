

# Python 3 code for finding greater 
# between the a^b and b^a 
import math 
  
# Function to find the greater value 
def findGreater(a, b): 
  
    x = a * (math.log(b)); 
    y = b * (math.log(a)); 
    if (y > x): 
        print ("a^b is greater"); 
    elif (y < x):  
        print("b^a is greater"); 
    else : 
        print("Both are equal");  
  
# Driver code 
a = 3; 
b = 5; 
c = 2; 
d = 4; 
findGreater(a, b); 
findGreater(c, d); 
  
# This code is contributed  
# by Shivi_Aggarwal 

