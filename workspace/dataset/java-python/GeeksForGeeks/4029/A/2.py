

# An efficient program to find if given 4 
# values can represent 4 sides of rectangle 
  
# Function to check if the given 
# integers value make a rectangle 
def isRectangle(a, b, c, d): 
      
    if a ^ b ^ c ^ d: 
        return False
          
    return True
  
  
# Driver code 
a, b, c, d = 3, 2, 3, 2
print("Yes"    if isRectangle(a, b, c, d) else "No") 
  
  
# This code is contributed by Ansu Kumari. 

