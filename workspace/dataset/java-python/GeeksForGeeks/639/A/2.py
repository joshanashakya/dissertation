

# A simple Python 3 program to check if 
# n-th Fibonacci number is multiple 
# of 10. 
  
# Returns true if n-th Fibonacci number  
# is multiple of 10. 
def isMultipleOf10(n): 
  
    return (n % 15 == 0) 
  
# Driver Code 
n = 30
  
if (isMultipleOf10(n)): 
    print("Yes"); 
else: 
    print("No"); 
  
# This code is contributed 
# by Akanksha Rai 

