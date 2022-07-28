

# python code to find number  
# of squares in a chessboard 
  
# Function to return count 
# of squares; 
def countSquares(n): 
      
    # better way to write 
    # n*(n+1)*(2n+1)/6 
    return ((n * (n + 1) / 2)  
           * (2 * n + 1) / 3) 
      
# Driver code 
n = 4
print("Count of squares is ", 
              countSquares(n)) 
  
# This code is contributed by sam007. 

