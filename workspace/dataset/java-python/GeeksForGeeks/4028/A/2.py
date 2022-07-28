

# A simple program to find if given 4 
# values can represent 4 sides of rectangle 
  
# Function to check if the given 
# integers value make a rectangle 
def isRectangle(a, b, c, d): 
      
    # Square is also a rectangle 
    if a == b == c == d: 
        return True
          
    elif a == b and c == d: 
        return True
          
    elif a == d and c == b: 
        return True
          
    elif a == c and d == b: 
        return True
          
    return False
  
  
# Driver code 
a, b, c, d = 1, 2, 3, 4
print("Yes" if isRectangle(a, b, c, d) else "No") 
  
  
# This code is contributed by Ansu Kumari. 

