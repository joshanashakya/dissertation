

# Python3 implementation of the approach  
  
""" 
Function to return the number  
of squares inside an n*n grid  
"""
  
def cntSquares(n) :  
    return int (n * (n + 1) * (2 * n + 1) / 6) 
  
# Driver code  
if __name__ == "__main__" :  
    print (cntSquares (4));  

