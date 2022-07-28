

# Python3 program to find sum of  
# cubes of first n odd numbers. 
  
def cubeSum(n): 
    sum = 0
      
    for i in range(0, n) : 
        sum += (2 * i + 1) * (2 * i + 1) * (2 * i + 1) 
    return sum
  
# Driven code  
print(cubeSum(2)) 
  
# This code is contributed by Shariq Raza 

