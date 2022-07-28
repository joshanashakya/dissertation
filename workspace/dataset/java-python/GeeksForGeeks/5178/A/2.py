

''' Python3 program to divide the array  
into two subarrays with the same sum on  
removing exactly one integer from the array'''
  
# Uitlity function to print the sub-array 
def printSubArray(arr, start, end): 
    print ("[ ", end = "") 
    for i in range(start, end+1): 
        print (arr[i], end =" ") 
    print ("]", end ="") 
  
# Function that divides the array into 
# two subarrays with the same sum 
def divideArray(arr, n): 
  
    # sum stores sum of all  
    # elements of the array 
    sum = 0
    for i in range(0, n): 
        sum += arr[i] 
  
    # sum stores sum till previous  
    # index of the array 
    sum_so_far = 0
    for i in range(0, n): 
  
        # If on removing arr[i], we get 
        # equals left and right half 
        if 2 * sum_so_far + arr[i] == sum: 
            print ("The array can be divided into", 
                    "two subarrays with equal sum") 
            print ("two subarrays are -", end = "") 
            printSubArray(arr, 0, i - 1) 
            printSubArray(arr, i + 1, n - 1) 
            return True
  
        # add current element to sum_so_far 
        sum_so_far += arr[i] 
  
    # The array cannot be divided 
    print ("The array cannot be divided into"
           "two subarrays with equal sum", end = "") 
  
    return False
  
# Driver code 
arr = [6, 2, 3, 2, 1] 
n = len(arr) 
divideArray(arr, n) 
  
# This code is contributed by Shreyanshi Arun 

