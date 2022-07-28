

# Python3 program to count smaller or equal 
# elements in sorted array 
  
# A binary search function to return 
# the number of elements less than 
# or equal to the given key 
def binarySearchCount(arr, n, key): 
  
    left = 0
    right = n - 1
  
    count = 0
  
    while (left <= right):  
        mid = int((right + left) / 2) 
  
        # Check if middle element is 
        # less than or equal to key 
        if (arr[mid] <= key):  
  
            # At least (mid + 1) elements are there 
            # whose values are less than 
            # or equal to key 
            count = mid + 1
            left = mid + 1
          
        # If key is smaller, ignore right half 
        else: 
            right = mid - 1
      
    return count 
  
# Driver code 
arr = [ 1, 2, 4, 11, 11, 16 ] 
key = 11
n = len(arr) 
  
print( binarySearchCount(arr, n, key)) 
  
# This code is contributed by Arnab Kundu 

