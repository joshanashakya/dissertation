

# Python3 implementation of the approach 
  
# Function to return the multiple of x  
# which is closest to a^b 
def getClosest(a, b, x) : 
    num = pow(a, b) 
  
    floor = num // x 
  
    # Closest element on the left 
    numOnLeft = x * floor 
  
    # Closest element on the right 
    numOnRight = x * (floor + 1) 
  
    # If numOnLeft is closer than numOnRight 
    if ((num - numOnLeft) <  
        (numOnRight - num)): 
        return numOnLeft 
  
    # If numOnRight is the closest 
    else : 
        return numOnRight 
  
# Driver code 
if __name__ == "__main__" : 
      
    a, b, x = 349, 1, 4
    print(getClosest(a, b, x)) 
  
# This code is contributed by Ryuga 

