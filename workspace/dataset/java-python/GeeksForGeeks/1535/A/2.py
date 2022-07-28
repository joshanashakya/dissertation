

# Python3 implementation for restoring original  
# sort in rotated sorted array using binary search  
  
# Function to find start index of array 
def findStartIndexOfArray(arr, low, high): 
    if (low > high): 
        return -1; 
      
    if (low == high): 
        return low; 
      
    mid = low + (high - low) / 2; 
    if (arr[mid] > arr[mid + 1]): 
        return mid + 1; 
      
    if (arr[mid - 1] > arr[mid]): 
        return mid; 
      
    if (arr[low] > arr[mid]): 
        return findStartIndexOfArray(arr, low, mid - 1); 
    else: 
        return findStartIndexOfArray(arr, mid + 1, high); 
  
# Function to restore the Original Sort 
def restoreSortedArray(arr, n): 
  
    # array is already sorted 
    if (arr[0] < arr[n - 1]): 
        return; 
      
    start = findStartIndexOfArray(arr, 0, n - 1); 
  
    # In reverse(), the first parameter 
    # is iterator to beginning element 
    # and second parameter is iterator 
    # to last element plus one. 
    reverse(arr, 0, start); 
    reverse(arr, start, n); 
    reverse(arr); 
  
# Function to prthe Array 
def printArray(arr, size): 
    for i in range(size): 
        print(arr[i], end=""); 
      
def reverse(arr, i, j): 
    while (i < j): 
        temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        i += 1; 
        j -= 1; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 1, 2, 3, 4, 5 ]; 
    n = len(arr); 
    restoreSortedArray(arr, n); 
    printArray(arr, n); 
  
# This code is contributed by PrinciRaj1992 

