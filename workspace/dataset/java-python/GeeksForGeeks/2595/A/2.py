

# Python program to find all those  
# elements of arr1[] that are not 
# present in arr2[] 
  
def relativeComplement(arr1, arr2, n, m): 
   
    i = 0
    j = 0
    while (i < n and j < m): 
   
        # If current element in arr2[] is 
        # greater, then arr1[i] can't be  
        # present in arr2[j..m-1] 
        if (arr1[i] < arr2[j]): 
            print(arr1[i] , " ", end="") 
            i += 1
   
            # Skipping smaller elements of 
            # arr2[] 
        elif (arr1[i] > arr2[j]): 
            j += 1
   
            # Equal elements found (skipping 
            # in both arrays) 
        elif (arr1[i] == arr2[j]): 
            i += 1
            j += 1
      
    # Printing remaining elements of 
    # arr1[] 
    while (i < n):  
        print(arr1[i] , " ", end="") 
   
# Driver code 
arr1= [3, 6, 10, 12, 15] 
arr2 = [1, 3, 5, 10, 16] 
n = len(arr1) 
m = len(arr2) 
relativeComplement(arr1, arr2, n, m) 
  
# This code is contributed 
# by Anant Agarwal. 

