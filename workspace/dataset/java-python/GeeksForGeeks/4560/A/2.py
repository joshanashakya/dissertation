

# Python3 implementation to replace  
# maximum element by coefficient of range  
  
# Utility function to print the 
# contents of the array  
def printArr(arr, n) : 
      
    for i in range(n) : 
        print(arr[i], end = " ") 
  
# Function to replace the maximum element  
# from the array with the coefficient of  
# range of the array  
def replaceMax(arr, n) : 
  
    # Maximum element from the array  
    max_element = max(arr) 
  
    # Minimum element from the array  
    min_element = min(arr) 
  
    # Calculate the coefficient of  
    # range for the array  
    ranges = max_element - min_element 
    coeffOfRange = ranges / (max_element + min_element)  
  
    # Assuming all the array elements are  
    # distinct. Replace the maximum element  
    # with the coeffient of range of the array  
    for i in range(n) : 
        if (arr[i] == max_element) : 
            arr[i] = coeffOfRange 
            break
  
    # Print the updated array  
    printArr(arr, n) 
  
# Driver code  
if __name__ == "__main__" : 
      
    arr = [ 15, 16, 10, 9, 6, 7, 17 ] 
    n = len(arr)  
      
    replaceMax(arr, n) 
  
# This code is contributed by Ryuga 

