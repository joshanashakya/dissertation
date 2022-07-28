

# Python3 find maximum difference 
# of subset sum 
  
import math 
  
# function for maximum subset diff 
def maxDiff(arr, n) : 
    SubsetSum_1 = 0
    SubsetSum_2 = 0
    for i in range(0, n) : 
  
        isSingleOccurance = True
        for j in range(i + 1, n) : 
  
            # if frequency of any element 
            # is two make both equal to  
            # zero 
            if (arr[i] == arr[j]) :  
                isSingleOccurance = False
                arr[i] = arr[j] = 0
                break
  
        if (isSingleOccurance == True) : 
            if (arr[i] > 0) : 
                SubsetSum_1 += arr[i] 
            else : 
                SubsetSum_2 += arr[i] 
  
    return abs(SubsetSum_1 - SubsetSum_2) 
  
# Driver Code 
arr = [4, 2, -3, 3, -2, -2, 8] 
n = len(arr) 
print ("Maximum Difference = {}"
               . format(maxDiff(arr, n))) 
  
# This code is contributed by Manish Shaw 
# (manishshaw1) 

