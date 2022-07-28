

# Python Program to find the area of  
# an inscribed circle in a square. 
      
PI = 3.14
      
# Function to find area of an  
# inscribed circle in a square. 
def areaOfInscribedCircle(a): 
    return ( PI / 4 ) * a * a 
  
# Driver code 
a = 8
print("Area of an inscribed circle:", 
  round(areaOfInscribedCircle(a), 2)) 

