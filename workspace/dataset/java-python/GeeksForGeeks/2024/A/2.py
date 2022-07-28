

# Python3 code to find 
# unit digit of x^y. 
  
# Returns unit digit of 
# x raised to power y 
def unitDigitXRaisedY( x , y ): 
  
    # Initialize result as 1 to 
    # handle case when y is 0. 
    res = 1
      
    # One by one multiply with x 
    # mod 10 to avoid overflow. 
    for i in range(y): 
        res = (res * x) % 10
      
    return res 
      
# Driver program 
print( unitDigitXRaisedY(4, 2)) 
  
  
# This code is contributed by Abhishek Sharma44. 

