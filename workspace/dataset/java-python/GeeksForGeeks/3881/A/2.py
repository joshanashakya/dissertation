

# Python 3 program to Replace every  
# element by the product of all  
# other elements 
  
def ReplaceElements(arr, n): 
    prod = 1
  
    # Calculate the product of 
    # all the elements 
    for i in range(n): 
        prod *= arr[i] 
  
    # Replace every element product 
    # of all other elements 
    for i in range(n) : 
        arr[i] = prod // arr[i] 
  
# Driver Code 
if __name__ == "__main__": 
    arr = [ 2, 3, 3, 5, 7 ] 
    n = len(arr) 
  
    ReplaceElements(arr, n) 
  
    # Print the modified array. 
    for i in range( n): 
        print(arr[i], end = " ") 
  
# This code is contributed 
# by ChitraNayal 

