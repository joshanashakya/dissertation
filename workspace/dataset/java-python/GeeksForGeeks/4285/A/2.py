

# Python program to check if a given  
# quadilateral is valid or not 
  
# Function to check if a given  
# quadilateral is valid or not 
def Valid(a, b, c, d): 
  
    # Check condition 
    if (a + b + c + d == 360): 
        return True; 
      
    return False; 
  
  
# Driver code 
a = 80; b = 70; c = 100; d = 110; 
  
if (Valid(a, b, c, d)): 
    print("Valid quadilateral"); 
else: 
    print("Invalid quadilateral"); 
  
# This code is contributed by Rajput-Ji 

