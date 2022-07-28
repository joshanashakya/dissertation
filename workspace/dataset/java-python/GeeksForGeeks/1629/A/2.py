

# Python program to print first half in  
# ascending order and the second half 
# in descending order 
  
  
# function to print half of the array in  
# ascending order and the other half in  
# descending order 
def printOrder(arr,n) : 
      
    # sorting the array 
    arr.sort() 
   
    # printing first half in ascending  
    # order 
    i = 0
    while (i< n/ 2 ) : 
        print arr[i], 
        i = i + 1
          
    # printing second half in descending  
    # order 
    j = n - 1
    while j >= n / 2 : 
        print arr[j], 
        j = j - 1
          
# Driver code 
arr = [5, 4, 6, 2, 1, 3, 8, 9, 7] 
n = len(arr) 
printOrder(arr, n) 
  
# This code is contributed by Nikita Tiwari. 

