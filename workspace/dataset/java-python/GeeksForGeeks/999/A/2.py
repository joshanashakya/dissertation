

# Dynamic Programming Python3  
# implementation of lds problem 
  
# lds() returns the length of the longest  
# dividing subsequence in arr[] of size n 
def lds(arr, n): 
      
    lds = [0 for i in range(n)] 
      
    lds[0] = 1
      
    # Compute optimized lds values  
    # in bottom up manner 
    for i in range(n): 
        lds[i] = 1
        for j in range(i): 
            if (lds[j] != 0 and 
                arr[i] % arr[j] == 0): 
                lds[i] = max(lds[i], lds[j] + 1) 
  
    return max(lds) 
  
# Driver Code 
arr = [2, 11, 16, 12, 36, 60, 71, 17,  
         29, 144, 288, 129, 432, 993] 
  
print("Length of lds is",  
       lds(arr, len(arr))) 
  
# This code is contributed  
# by Mohit Kumar 

