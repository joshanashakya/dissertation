

# Python3 program to find the array formed 
# from the difference of each element  
# from the largest element in the given array 
def difference(arr, n): 
      
    # Initializing current largest 
    # as the first element. 
    largest = arr[0]; 
    i = 0; 
  
    # For loop to compute 
    # the largest element 
    for i in range(n): 
  
        # Checking if the current element 
        # is greater than the defined largest 
        if (largest < arr[i]): 
            largest = arr[i]; 
      
    # For loop to replace the elements 
    # in the array with the difference 
    for i in range(n): 
        arr[i] = largest - arr[i]; 
  
    # For loop to prthe elements 
    for i in range(n): 
        print(arr[i], end = " "); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 10, 5, 9, 3, 2 ]; 
    n = len(arr); 
    difference(arr, n); 
  
# This code is contributed by Rajput-Ji 

