

# Python3 code to find minimum number of 
# squares to make a given rectangle. 
  
import math  
  
def countRectangles(l, w): 
  
    # if we take gcd(l, w), this 
    # will be largest possible 
    # side for suare, hence minimum 
    # number of square. 
    squareSide = math.gcd(l,w) 
      
    # Number of squares. 
    return (l*w)/(squareSide*squareSide) 
  
# Driver Code 
          
if __name__ == '__main__': 
    l = 4
    w = 6
    ans = countRectangles(l, w) 
    print (int(ans)) 
  
# this code is contributed by 
# SURENDRA_GANGWAR 

