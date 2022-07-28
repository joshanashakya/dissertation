

# Python3 program to find an element   
# which divides the array in two   
# sub-arrays with equal product.  
  
# Function to find the index 
def findElement(arr, n): 
    # Forming prefix sum array from 0 
    prefixMul = [] 
    prefixMul.append(arr[0]) 
    for i in range(1, n): 
        prefixMul.append(prefixMul[i-1]*arr[i]) 
  
    # Forming suffix sum array from n-1  
    suffixMul = [None for i in range(0, n)] 
    suffixMul[n-1] = arr[n-1] 
    for i in range(n-2, -1, -1): 
        suffixMul[i] = suffixMul[i+1]*arr[i] 
  
    # Find the point where prefix and suffix  
    # sums are same.  
    for i in range(1, n-1): 
        if prefixMul[i] == suffixMul[i]: 
            return arr[i] 
              
    return -1
  
# Driver Code 
arr = [2, 3, 4, 1, 4, 6] 
n = len(arr) 
print(findElement(arr, n)) 
  
# This code is contributed by SamyuktaSHegde 

