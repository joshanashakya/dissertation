

# Python3 implementation of the approach 
  
# Function to return the percentage increase 
# in the volume of the cuboid 
def increaseInVol(l, b, h): 
    percentInc = ((1 + (l / 100)) * 
                  (1 + (b / 100)) * 
                  (1 + (h / 100))) 
    percentInc -= 1
    percentInc *= 100
  
    return percentInc 
  
# Driver code 
l = 50
b = 20
h = 10
print(increaseInVol(l, b, h), "%") 
  
# This code is contributed by Mohit Kumar 

