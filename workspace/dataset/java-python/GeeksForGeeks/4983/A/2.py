

# Python 3 program to find uncommon 
# elements of two sorted arrays 
  
  
def printUncommon(arr1, arr2, n1, n2) : 
      
    i = 0
    j = 0
    k = 0
    while (i < n1 and j < n2) : 
  
        # If not common, print smaller 
        if (arr1[i] < arr2[j]) : 
            print( arr1[i] , end= " ") 
            i = i + 1
            k = k + 1
              
        elif (arr2[j] < arr1[i]) : 
            print( arr2[j] , end= " ") 
            k = k + 1
            j = j + 1
  
        # Skip common element 
        else : 
            i = i + 1 
            j = j + 1 
      
    # printing remaining elements 
    while (i < n1) : 
        print( arr1[i] , end= " ") 
        i = i + 1
        k = k + 1
      
    while (j < n2) : 
        print( arr2[j] , end= " ") 
        j = j + 1
        k = k + 1
   
   
# Driver code 
arr1 = [10, 20, 30] 
arr2 = [20, 25, 30, 40, 50] 
  
n1 = len(arr1) 
n2 = len(arr2) 
  
printUncommon(arr1, arr2, n1, n2) 
  
  
  
# This code is contributed 
# by Nikita Tiwari. 

