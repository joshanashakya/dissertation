

# Python program to find sum of all elements 
# upto nth row in Pascal triangle. 
  
# Function to find sum of aal elements 
# upto nth row. 
def calculateSum(n) : 
          
    # Initialize sum with 0 
    sum = 0
      
    # Loop to calculate power of 2 
    # upto n and add them 
    for row in range(n): 
        sum = sum + (1 << row) 
  
    return sum
      
# Driver code     
n = 10
print("Sum of all elements:", calculateSum(n)) 

