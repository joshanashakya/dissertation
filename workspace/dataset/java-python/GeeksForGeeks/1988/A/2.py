

# Python 3 implementation of the approach 
# Function to return the minimum value of Z 
def findMinimumZ(n, a, b): 
      
    # Change elements such that a < b 
    if (a > b): 
        temp = a 
        a = b 
        b = temp 
  
    # Distance from (a to b) 
    distClock = b - a 
  
    # Distance from (1 to a) + (b to n) 
    distAntiClock = (a - 1) + (n - b + 1) 
  
    # Minimum distance between a and b 
    minDist = min(distClock, distAntiClock) 
  
    # If both the positions are 
    # adjacent on the circle 
    if (minDist == 1): 
        return 3
  
    # Return the minimum Z possible 
    return minDist 
  
# Driver code 
if __name__ == '__main__': 
    n = 4
    a = 1
    b = 2
    print(findMinimumZ(n, a, b)) 
      
# This code is contributed by 
# Surendra_Gangwar 

