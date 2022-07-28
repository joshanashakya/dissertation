

# Python implementation for restoring original 
# sort in rotated sorted array 
  
# Function to restore the Original Sort 
def restoreSortedArray(arr, n): 
    for i in range(n): 
        if (arr[i] > arr[i + 1]): 
            # In reverse(), the first parameter 
            # is iterator to beginning element 
            # and second parameter is iterator 
            # to last element plus one. 
            reverse(arr, 0, i); 
            reverse(arr, i + 1, n); 
            reverse(arr, 0, n); 
  
def reverse(arr, i, j): 
    while (i < j): 
        temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        i += 1; 
        j -= 1; 
  
# Function to prthe Array 
def printArray(arr, size): 
    for i in range(size): 
        print(arr[i], end=""); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [3, 4, 5, 1, 2]; 
    n = len(arr); 
    restoreSortedArray(arr, n - 1); 
    printArray(arr, n); 
  
# This code is contributed by 29AjayKumar 

