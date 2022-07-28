

# Python program to 
# count smaller or equal 
# elements in sorted array. 
  
# A binary search function. 
# It returns 
# number of elements 
# less than of equal 
# to given key 
def binarySearchCount(arr, n, key): 
  
    left = 0
    right = n 
   
    mid = 0
    while (left < right): 
      
        mid = (right + left)//2
   
        # Check if key is present in array 
        if (arr[mid] == key): 
          
            # If duplicates are 
            # present it returns 
            # the position of last element 
            while (mid + 1<n and arr[mid + 1] == key): 
                 mid+= 1
            break
          
   
        # If key is smaller, 
        # ignore right half 
        elif (arr[mid] > key): 
            right = mid 
   
        # If key is greater, 
        # ignore left half 
        else: 
            left = mid + 1
      
   
    # If key is not found in 
    # array then it will be 
    # before mid 
    while (mid > -1 and  arr[mid] > key): 
        mid-= 1
   
    # Return mid + 1 because 
    # of 0-based indexing 
    # of array 
    return mid + 1
  
# Driver code 
  
arr = [1, 2, 4, 5, 8, 10] 
key = 11
n = len(arr) 
  
print(binarySearchCount(arr, n, key)) 
  
# This code is contributed 
# by Anant Agarwal. 

