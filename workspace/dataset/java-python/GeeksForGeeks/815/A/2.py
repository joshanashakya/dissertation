

# Python 3 Program  to find the  
# area of the biggest square  
# which can fit inside the right 
# angled traingle  
  
# Function to find the area of the biggest square 
def squareArea(l, b, h) : 
  
    # the height or base or hypotenuse  
    # cannot be negative  
    if l < 0 or b < 0 or h < 0 : 
        return -1
  
    # side of the square 
    a = (l * b) / (l + b) 
  
    # squaring to get the area 
    return a * a 
  
# Driver Code 
if __name__ == "__main__" : 
  
    l, b, h = 5, 12, 13
  
    print(round(squareArea(l, b, h),4)) 
  
# This code is contributed by ANKITRAI1 

