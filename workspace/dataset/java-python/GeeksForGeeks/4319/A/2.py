

# Iterative Python3 code to  
# multiply list elements 
  
# Function to calculate  
# the product of the array 
def multiply( array , n ): 
    pro = 1
    for i in range(n): 
        pro = pro * array[i] 
    return pro 
  
# Driver code 
array = [1, 2, 3, 4, 5, 6] 
n = len(array) 
  
# Function call to 
# calculate product 
print(multiply(array, n)) 
  
# This code is contributed 
# by "Sharad_Bhardwaj". 

