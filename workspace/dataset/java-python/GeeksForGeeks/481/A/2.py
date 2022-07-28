

# Python 3 program to print elements greater than 
# the previous and next element in an Array 
  
# Function to print elements greater than 
# the previous and next element in an Array 
def printElements(arr, n): 
      
    # Traverse array from index 1 to n-2 
    # and check for the given condition 
    for i in range(1, n - 1, 1): 
        if (arr[i] > arr[i - 1] and 
            arr[i] > arr[i + 1]): 
            print(arr[i], end = " ") 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [2, 3, 1, 5, 4, 9, 8, 7, 5] 
    n = len(arr) 
  
    printElements(arr, n) 
      
# This code is contributed by 
# Surendra_Gangwar 

