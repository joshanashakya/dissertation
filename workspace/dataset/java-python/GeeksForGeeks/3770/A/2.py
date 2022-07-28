

# Python3 program to make sorted array elements 
# distinct by incrementing elements and keeping 
# sum to minimum. 
  
# To find minimum sum of unique elements. 
def minSum(arr, n): 
    sm = arr[0] 
  
    for i in range(1, n): 
        if arr[i] == arr[i - 1]:          
  
            # While current element is same as  
            # previous or has become smaller 
            # than previous. 
            j = i 
            while j < n and arr[j] <= arr[j - 1]:          
                arr[j] = arr[j] + 1
                j += 1
  
        sm = sm + arr[i] 
  
    return sm 
  
# Driver code 
arr = [ 2, 2, 3, 5, 6 ] 
n = len(arr) 
print(minSum(arr, n)) 
  
# This code is contributed by Ansu Kumari 

