

# Python3 program to find sum of all elements 
# upto nth row in Pascal triangle. 
  
# Function to find sum of aal elements 
# upto nth row. 
def calculateSum(n) : 
      
    # Initialize sum with 0 
    sum = 0
      
    # Calculate 2 ^ n 
    sum = 1 << n; 
      
    return (sum - 1) 
  
# Driver unicode 
n = 10
print("Sum of all elements:", calculateSum(n)) 

