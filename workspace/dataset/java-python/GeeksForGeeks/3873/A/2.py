

# Python 3 program to replace every element  
# of the array with the element that appears  
# before it 
  
# Function to print the array after replacing  
# every element of the array with the element  
# that appears before it 
def updateArray(arr, n): 
      
    # Update array 
    i = n - 1
    while(i > 0): 
        arr[i] = arr[i - 1] 
        i -= 1
  
    # Change the first element to -1 
    arr[0] = -1
  
    # Print the updated array 
    for i in range(0, n, 1): 
        print(arr[i], end = " ") 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [5, 1, 3, 2, 4] 
    N = len(arr) 
    updateArray(arr, N) 
  
# This code is contributed by 
# Surendra_Gangwar 

