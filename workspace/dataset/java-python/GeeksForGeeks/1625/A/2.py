

# Python 3 program to sort first  
# k elements in increasing order  
# and remaining n-k elements in  
# decreasing 
  
# Function to sort the array 
def printOrder(arr, n, k): 
  
    len1 = k 
    len2 = n - k 
    arr1 = [0] * k 
    arr2 = [0] * (n - k) 
  
    # Store the k elements  
    # in an array 
    for i in range(k): 
        arr1[i] = arr[i] 
  
    # Store the remaining n-k  
    # elements in an array 
    for i in range(k, n): 
        arr2[i - k] = arr[i] 
  
    # sorting the array from 
    # 0 to k-1 places 
    arr1.sort() 
  
    # sorting the array from 
    # k to n places 
    arr2.sort() 
  
    # storing the values in the  
    # final array arr 
    for i in range(n): 
        if (i < k): 
            arr[i] = arr1[i] 
  
        else : 
            arr[i] = arr2[len2 - 1] 
            len2 -= 1
      
    # printing the array 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Driver code 
if __name__ == "__main__": 
    arr = [ 5, 4, 6, 2, 1, 
            3, 8, 9, -1 ] 
    k = 4
  
    n = len(arr) 
  
    printOrder(arr, n, k) 
  
# This code is contributed 
# by ChitraNayal 

