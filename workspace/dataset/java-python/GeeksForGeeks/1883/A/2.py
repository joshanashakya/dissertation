

# Python 3 program to Replace every element 
# by the bitwise xor of all other elements 
  
# Function to replace the elements 
def ReplaceElements(arr, n): 
  
    X = 0
  
    # Calculate the xor of all the elements 
    for i in range(n): 
        X ^= arr[i] 
  
    # Replace every element by the 
    # xor of all other elements 
    for i in range(n): 
        arr[i] = X ^ arr[i] 
  
# Driver code 
if __name__ == "__main__": 
    arr = [ 2, 3, 3, 5, 5 ] 
    n = len(arr) 
  
    ReplaceElements(arr, n) 
  
    # Print the modified array. 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# This code is contributed 
# by ChitraNayal 

