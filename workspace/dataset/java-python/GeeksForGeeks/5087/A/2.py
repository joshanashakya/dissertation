

# Python3 program to find maximum and 
# minimum using Absolute function 
  
# Function to return maximum 
# among the two numbers 
def maximum(x, y): 
        return ((x + y + abs(x - y)) // 2) 
  
# Function to return minimum 
# among the two numbers 
def minimum(x, y): 
        return ((x + y - abs(x - y)) // 2) 
  
# Driver code 
x = 99
y = 18
  
# Displaying the maximum value 
print("Maximum:", maximum(x, y)) 
  
# Displaying the minimum value 
print("Minimum:", minimum(x, y)) 
  
# This code is contributed by mohit kumar 29 

