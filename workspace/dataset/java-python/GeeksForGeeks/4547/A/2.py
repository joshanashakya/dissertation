

# Python3 program to print pattern that  
# first reduces 5 one by one, then adds 5. 
# Without any loop an extra variable. 
  
# Recursive function to print the pattern  
# without any extra variable 
def printPattern(n): 
  
    # Base case (When n becomes 0 or negative)  
    if (n == 0 or n < 0): 
        print(n, end = ", ") 
        return
      
    # First print decreasing order 
    print(n, end = ", ") 
    printPattern(n - 5) 
  
    # Then print increasing order 
    print(n, end = ", ")  
  
# Driver Code 
n = 16
printPattern(n) 
  
# This code is contributed by 
# Mohit kumar 29 

