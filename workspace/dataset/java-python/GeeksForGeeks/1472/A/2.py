

# Python3 program to 
# print all elements that 
# appear more than once. 
  
# function to find 
# repeating elements 
def printRepeating(arr, n): 
      
    # First check all the 
        # values that are 
    # present in an array 
        # then go to that 
    # values as indexes 
        # and increment by 
    # the size of array 
    for i in range(0, n): 
        index = arr[i] % n 
        arr[index] += n 
  
    # Now check which value 
        # exists more 
    # than once by dividing 
        # with the size 
    # of array 
    for i in range(0,n): 
        if (arr[i]/n) > 1: 
            print (i , end = " ") 
  
# Driver's code 
arr = [1, 6, 3, 1, 3, 6, 6] 
arr_size = len(arr) 
  
print ("The repeating elements are:") 
  
printRepeating( arr, arr_size) 
  
# This code is contributed 
# by Shreyanshi Arun. 

