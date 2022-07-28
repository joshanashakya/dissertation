

# Python 3 program to print squares of first  
# 'n' natural numbers without using *, / and - 
def printSquares(n): 
  
    # Initialize 'square' and previous 
    # value of 'x' 
    square = 0; prev_x = 0; 
  
    # Calculate and print squares 
    for x in range(0, n): 
          
        # Update value of square using  
        # previous value 
        square = (square + x + prev_x) 
  
        # Print square and update prev   
        # for next iteration 
        print(square, end = " ") 
        prev_x = x 
  
# Driver Code 
n = 5; 
printSquares(n); 
  
# This code is contributed 
# by Akanksha Rai 

