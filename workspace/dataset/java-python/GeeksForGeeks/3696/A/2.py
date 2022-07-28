

# Python3 implementation of the approach 
  
# Function to find the original coordinated 
def solve(d1, d2, d3) : 
  
      
    # Maximum of the given distances 
    maxx = max(d1, max(d2, d3)) 
      
    # Sum of the given distances 
    sum = (d1 + d2 + d3) 
      
    # Conditions when the 
    # solution doesn't exist 
    if (2 * maxx > sum or sum % 2 == 1) : 
        print("-1") 
        return
      
      
    # First coordinate 
    x1 = 0
    y1 = 0
      
    # Second coordinate 
    x2 = d1  
    y2 = 0
      
    # Third coordinate 
    x3 = (d1 + d2 - d3) // 2
    y3 = (d2 + d3 - d1) // 2
    print("(" , x1 , "," , y1 , "), ("
        , x2 , "," , y2 , ") and ("
        , x3 , "," , y3 , ")") 
  
  
# Driver code 
d1 = 3
d2 = 4
d3 = 5
solve(d1, d2, d3) 
  
# This code is contributed by ihritik 

