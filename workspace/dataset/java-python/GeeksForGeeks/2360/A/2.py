

# Python 3 program to find  
# minimum flip required to  
# make XOR of two arrays  
# equal to another array 
# with constraints on number 
# of flip on each array. 
  
# Return minimum number 
# of flip required 
def minflip(arr1, arr2,  
            arr3, p, q, n): 
  
    flip = 0
  
    # Counting number of  
    # mismatch, XOR of  
    # arr1[] and arr2[]  
    # is not equal to arr3[]. 
    for i in range(0 , n): 
        if (arr1[i] ^  
            arr2[i] != arr3[i]): 
            flip += 1
  
    # if flip is less then 
    # allowed constraint return 
    # it. else return -1. 
    return flip if (flip <= p + q) else -1
  
# Driver Code 
arr1 = [1, 0, 1, 1, 1, 1, 1]  
arr2 = [0, 1, 1, 1, 1, 0, 0] 
arr3 = [1, 1, 1, 1, 0, 0, 1]  
  
n = len(arr1) 
p = 2
q = 4
  
print(minflip(arr1, arr2,  
              arr3, p, q, n)) 
  
# This code is contributed  
# by Smitha 

