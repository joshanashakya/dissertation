

# Python3 for printing smallest n number in order 
  
# Function for binary_search 
def binary_search(arr, low, high, ele): 
    while low < high: 
        mid = (low + high) // 2
        if arr[mid] == ele: 
            return mid 
        elif arr[mid] > ele: 
            high = mid 
        else: 
            low = mid + 1
    return -1
  
# Function to print smallest n numbers 
def printSmall(arr, asize, n): 
  
    # Make copy of array 
    copy_arr = arr.copy() 
  
    # Sort copy array 
    copy_arr.sort() 
  
    # For each arr[i] find whether 
    # it is a part of n-smallest 
    # with binary search 
    for i in range(asize): 
        if binary_search(copy_arr, low = 0,  
                         high = n, ele = arr[i]) > -1: 
            print(arr[i], end = " ") 
  
# Driver Code 
if __name__ == "__main__": 
    arr = [1, 5, 8, 9, 6, 7, 3, 4, 2, 0] 
    asize = len(arr) 
    n = 5
    printSmall(arr, asize, n) 
  
# This code is conributed by 
# sanjeev2552 

