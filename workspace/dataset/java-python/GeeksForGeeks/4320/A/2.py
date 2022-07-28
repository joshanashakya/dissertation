

# Recursive Python3 code  
# to multiply array elements 
  
# Function to calculate the product   
# of array using recursion 
def multiply( a , n ): 
      
    # Termination condition 
    if n == 0: 
        return(a[n]) 
    else: 
        return (a[n] * multiply(a, n - 1)) 
  
# Driver Code 
array = [1, 2, 3, 4, 5, 6] 
n = len(array) 
  
# Function call to  
# calculate the product 
print(multiply(array, n - 1)) 
  
# This code is contributed 
# by "Sharad_Bhardwaj". 

