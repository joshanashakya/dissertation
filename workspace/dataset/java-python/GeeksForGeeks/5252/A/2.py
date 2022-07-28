

# Python3 program to find sum of  
# cubes of first n even numbers 
  
# Function to find sum of cubes 
# of first n even numbers  
def cubeSum(n): 
  
    sum = 0
    for i in range(1, n + 1): 
        sum += (2 * i) * (2 * i) * (2 * i) 
    return sum
  
# Driven code  
print(cubeSum(8)) 
  
# This code is contributed by Shariq Raza 

