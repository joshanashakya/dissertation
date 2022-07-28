

# Python3 program to find missing  
# k numbers in an array.  
  
# Prints first k natural numbers  
# in arr[0..n-1]  
def printKMissing(arr, n, k) : 
      
    arr.sort()  
  
    # Find first positive number  
    i = 0
    while (i < n and arr[i] <= 0) : 
        i = i + 1
  
    # Now find missing numbers  
    # between array elements  
    count = 0
    curr = 1
    while (count < k and i < n) :  
        if (arr[i] != curr) : 
            print(str(curr) + " ", end = '') 
            count = count + 1
        else: 
            i = i + 1
          
        curr = curr + 1
          
    # Find missing numbers after  
    # maximum.  
    while (count < k) : 
        print(str(curr) + " ", end = '')  
        curr = curr + 1
        count = count + 1
          
# Driver code  
arr = [ 2, 3, 4 ]  
n = len(arr)  
k = 3
printKMissing(arr, n, k);  
  
# This code is contributed  
# by Yatin Gupta 

