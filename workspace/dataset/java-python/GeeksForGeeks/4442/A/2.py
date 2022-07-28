

# Python3 implementation to find the 
# missing number in shuffled array 
  
# Returns the missing number 
# Size of arr2[] is n - 1 
def missingNumber(arr1, arr2, n): 
  
    # missing number 'mnum' 
    mnum = 0
  
    # 1st array is of size 'n' 
    for i in range(n): 
        mnum = mnum ^ arr1[i] 
  
    # 2nd array is of size 'n - 1' 
    for i in range(n - 1): 
        mnum = mnum ^ arr2[i] 
  
    # Required missing number 
    return mnum 
  
# Driver Code 
arr1 = [4, 8, 1, 3, 7] 
arr2= [7, 4, 3, 1] 
n = len(arr1) 
print("Missing number = ",  
    missingNumber(arr1, arr2, n)) 
          
# This code is contributed by Anant Agarwal. 

