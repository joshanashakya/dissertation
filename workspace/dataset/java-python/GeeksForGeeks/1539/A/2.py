

# Python implementation to 
# count elements less than or  
# equal to a given value 
# in a sorted rotated array 
  
# function to find the 
# minimum element's index 
def findMinIndex(arr,low,high): 
  
    # This condition is needed 
    # to handle the case when  
    # array is not rotated at all 
    if (high < low): 
        return 0
    
    # If there is only one element left 
    if (high == low): 
        return low 
    
    # Find mid 
    mid = (low + high) // 2
    
    # Check if element (mid+1) is 
    # minimum element. Consider 
    # the cases like {3, 4, 5, 1, 2} 
    if (mid < high and arr[mid+1] < arr[mid]): 
       return (mid + 1) 
    
    # Check if mid itself 
    # is minimum element 
    if (mid > low and arr[mid] < arr[mid - 1]): 
       return mid 
    
    # Decide whether we need to 
    # go to left half or right half 
    if (arr[high] > arr[mid]): 
       return findMinIndex(arr, low, mid-1) 
    return findMinIndex(arr, mid+1, high) 
  
# function returns the  
# index of largest element  
# smaller than equal to  
# 'x' in 'arr[l...h]'.  
# If no such element exits 
# in the given range,  
# then it returns l-1.  
def binary_search(arr,l,h,x): 
  
    while (l <= h): 
      
        mid = (l+h) // 2
   
        # if 'x' is less than 
        # or equla to arr[mid],  
        # then search in arr[mid+1...h] 
        if (arr[mid] <= x): 
            l = mid + 1
   
        # else search in arr[l...mid-1]     
        else: 
            h = mid - 1    
      
    # required index 
    return h 
   
# function to count 
# elements less than  
# or equal to a given value 
def countEleLessThanOrEqual(arr,n,x): 
  
    # index of the smallest 
    # element in the array 
    min_index = findMinIndex(arr, 0, n-1) 
       
    # if largest element smaller 
    # than or equal to 'x' lies 
    # in the sorted range arr[min_index...n-1] 
    if (x <= arr[n-1]): 
        return (binary_search(arr, min_index, n-1, x) + 1 - min_index) 
       
    # if largest element smaller 
    # than or equal to 'x' lies 
    # in the sorted range arr[0...min_index-1] 
    if ((min_index - 1) >= 0 and x <= arr[min_index - 1]): 
        return (n - min_index + binary_search(arr, 0, min_index-1, x) + 1) 
       
    # else all the elements of the array 
    # are less than 'x'     
    return n                 
  
# driver code 
arr = [6, 10, 12, 15, 2, 4, 5] 
n = len(arr) 
x = 14
  
print("Count = ",end="") 
print(countEleLessThanOrEqual(arr, n, x)) 
  
# This code is contributed 
# by Anant Agarwal. 

