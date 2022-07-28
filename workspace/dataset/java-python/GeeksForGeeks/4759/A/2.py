

# Python3 implementation of the approach  
  
# Utility function to print the contents  
# of an array  
def printArray(arr, n) : 
    for i in range(n) :  
        print(arr[i], end = " ") 
  
# Function to print the array with  
# maximum mean  
def printMaxMean(arr, n) : 
    newArr = [0] * n  
  
    # Sort the original array  
    arr.sort() 
  
    # Construct new array  
    for i in range(n) :  
        newArr[i] = arr[i + n] 
  
    # Print the resultant array  
    printArray(newArr, n) 
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 4, 8, 3, 1, 3, 7, 0, 4 ]  
    n = len(arr)  
    printMaxMean(arr, n // 2)  
  
# This code is contributed by Ryuga 

