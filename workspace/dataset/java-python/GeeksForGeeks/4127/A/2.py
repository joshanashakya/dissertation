

# Python 3 program to find  
# Equal point in a sorted  
# array which may have  
# many duplicates. 
  
# Returns value of Equal  
# point in a sorted array  
# arr[]. It returns -1 if 
# there is no Equal Point. 
def findEqualPoint(arr, n): 
  
    # To store first indexes of  
    # distinct elements of arr[] 
    distArr = [0] * n 
  
    # Traverse input array and 
    # store indexes of first 
    # occurrences of distinct 
    # elements in distArr[] 
    i = 0
    di = 0
    while (i < n): 
      
        # This element must be  
        # first occurrence of a 
        # number (this is made  
        # sure by below loop), 
        # so add it to distinct array. 
        distArr[di] = i 
        di += 1
        i += 1
  
        # Avoid all copies of  
        # arr[i] and move to  
        # next distinct element. 
        while (i < n and 
               arr[i] == arr[i - 1]): 
            i += 1
      
    # di now has total number 
    # of distinct elements. 
    # If di is odd, then equal 
    # point exists and is at 
    # di/2, otherwise return -1. 
    return distArr[di >> 1] if (di & 1) else -1
  
# Driver code 
arr = [1, 2, 3, 4, 4,  
       5, 6, 6, 6, 7] 
n = len(arr) 
index = findEqualPoint(arr, n) 
if (index != -1): 
    print("Equal Point = " ,  
                 arr[index]) 
else: 
    print("Equal Point does " +
                  "not exists") 
  
# This code is contributed 
# by Smitha 

