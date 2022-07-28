

# Python3 program to find  
# the K-th smallest element  
# after removing some integers 
# from natural number. 
  
# Return the K-th  
# smallest element. 
def ksmallest(arr, n, k): 
    for i in range(n):  
        if (arr[i] <= k): 
            k = k + 1; 
        else: 
            break; 
    return k; 
  
# Driver Code 
k = 1; 
arr = [1]; 
n = len(arr); 
print(ksmallest(arr, n, k)); 
      
# This code is contributed by mits 

