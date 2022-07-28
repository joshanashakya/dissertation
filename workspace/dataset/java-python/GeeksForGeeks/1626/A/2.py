

# Python3 program to sort first k elements 
# in increasing order and remaining 
# n-k elements in decreasing 
  
# function to sort the array 
def printOrder(arr, n, k): 
  
    # Sort first k elements in ascending order 
    a = arr[0:k]; 
    a.sort(); 
  
    # Sort remaining n-k elements in descending order 
    b = arr[k:n]; 
    b.sort(); 
    b.reverse(); 
    return a + b; 
  
# Driver code 
arr = [ 5, 4, 6, 2, 1, 3, 8, 9, -1 ]; 
k = 4; 
n = len(arr); 
  
arr = printOrder(arr, n, k); 
  
for i in range(n): 
    print(arr[i], end =" "); 
  
# This code is contributed by mits 

