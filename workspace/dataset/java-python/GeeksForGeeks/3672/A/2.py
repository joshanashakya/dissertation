

# Python 3 implementation of the 
# above approach 
def PointInKSquares(n, a, k) : 
      
    a.sort() 
    return a[n - k] 
  
# Driver Code 
if __name__ == "__main__" : 
      
    k = 2
    a = [1, 2, 3, 4] 
    n = len(a) 
      
    x = PointInKSquares(n, a, k) 
    print("(", x, ",", x, ")") 
  
# This code is contributed by Ryuga 

