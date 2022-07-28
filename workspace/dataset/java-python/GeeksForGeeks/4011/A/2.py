

# Python3 program to print squares  
# of first 'n' natural numbers  
# wothout using *, / and -  
  
def printSquares(n): 
      
    # Initialize 'square' and 
    # first odd number  
    square = 0
    odd = 1
      
    # Calculate and print squares  
    for x in range(0 , n): 
          
        # Print square  
        print(square, end= " ") 
          
        # Update 'square' and 'odd'  
        square = square + odd 
        odd = odd + 2
  
# Driver Code 
n = 5;  
printSquares(n) 
  
# This code is contributed  
# by Rajput-Ji 

