

# Python3 program to copy the contents of one 
# array into another in the reverse order 
import math as mt 
  
# Function to print the array 
def printArray(arr, Len): 
  
    for i in range(Len): 
        print(arr[i], end = " ") 
      
# Driver code 
original_arr = [1, 2, 3, 4, 5] 
Len = len(original_arr) 
  
copied_arr = [0 for i in range(Len)] 
  
# Copy the elements of the array 
# in the copied_arr in Reverse Order 
for i in range(Len):  
    copied_arr[i] = original_arr[Len - i - 1] 
  
# Print the original_arr 
print("Original array: ", end = "") 
printArray(original_arr, Len) 
  
# Print the copied array 
print("\nResultant array: ", end = "") 
printArray(copied_arr, Len) 
  
# This code is contributed by 
# Mohit kumar 29 

