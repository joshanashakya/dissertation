

# Python 3 implementation to find 
# original array from the encrypted 
# array 
  
# Finds and prints the elements of 
# the original array 
def findAndPrintOriginalArray(arr, n): 
  
    # total sum of elements 
    # of encrypted array 
    arr_sum = 0
    for i in range(0, n): 
        arr_sum += arr[i] 
  
    # total sum of elements 
    # of original array 
    arr_sum = int(arr_sum / (n - 1)) 
  
    # calculating and displaying 
    # elements of original array 
    for i in range(0, n): 
        print((arr_sum - arr[i]),  
                       end = " ") 
  
# Driver program to test above 
arr = [10, 14, 12, 13, 11] 
n = len(arr) 
findAndPrintOriginalArray(arr, n) 
  
# This code is contributed By Smitha 

