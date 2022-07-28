

# Python3 program to find the minimum 
# product of sum of pair of element 
# in array arr[] 
  
# Function to find the minimum 
# product 
def minimumProduct(arr, n): 
  
    # Sort the array using STL 
    # sort() function 
    arr = sorted(arr) 
  
    # Intialise product to 1 
    product = 1
  
    for i in range(0, n, 2): 
  
        # Find product of sum of 
        # all pairs 
        product *= (arr[i] + arr[i + 1]) 
  
    # Return the product 
    return product 
  
# Driver code 
  
arr = [1, 6, 3, 1, 7, 8] 
n = len(arr) 
  
# Function call to find product 
print(minimumProduct(arr, n)) 
  
# This code is contributed by mohit kumar 29 

