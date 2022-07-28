

# Python3 implementation of the approach  
  
# Function to return the number  
# of squares inside an n*n grid  
def cntSquares(n) :  
  
    squares = 0;  
    for i in range(1, n + 1) : 
        squares += i ** 2;  
  
    return squares;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 4;  
  
    print(cntSquares(4));  
  
# This code is contributed by AnkitRai01 

