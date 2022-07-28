

# Python3 program to find partition point in 
# array to maximize xor sum 
  
# Function to find partition point in 
# array to maximize xor sum 
def Xor_Sum(arr, n): 
  
    sum = 0
    index, left_xor = 0, 0
    right_xor = 0
  
    # Traverse through the array 
    for i in range(n): 
  
        # Calculate xor of elements left of index i 
        # including ith element 
        left_xor = left_xor ^ arr[i] 
        right_xor = 0
  
        for j in range(i + 1, n): 
              
            # Calculate xor of the elements  
            # right of index i 
            right_xor = right_xor ^ arr[j] 
  
        # Keep the maximum possible xor sum 
        if (left_xor + right_xor > sum): 
            sum = left_xor + right_xor 
            index = i 
  
    # Return the 1 based index of the array 
    return index + 1
  
# Driver code 
arr = [ 1, 4, 6, 3, 8, 
        13, 34, 2, 21, 10] 
n = len(arr) 
  
# Function call 
print(Xor_Sum(arr, n)) 
  
# This code is contributed by Mohit Kumar 

