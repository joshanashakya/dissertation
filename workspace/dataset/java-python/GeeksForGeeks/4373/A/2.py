

# Python3 program to reverse every  
# sub-array formed by consecutive 
# k elements at given distance apart 
  
# Function to reverse every  
# sub-array formed by consecutive  
# k elements at m distance apart 
def reverse(arr, n, k, m): 
      
    # increment i in multiples of k + m 
    for i in range(0, n, k + m): 
        left = i; 
  
        # to handle case when k + m  
        # is not multiple of n 
        right = min(i + k - 1, n - 1); 
  
        # reverse the sub-array [left, right] 
        while (left < right): 
            arr = swap(arr,left, right); 
            left += 1; 
            right -= 1; 
    return arr; 
  
def swap(arr, i, j): 
  
    temp = arr[i]; 
    arr[i] = arr[j]; 
    arr[j] = temp; 
    return arr; 
  
# Driver code 
arr = [1, 2, 3, 4, 5, 6, 7,  
       8, 9, 10, 11, 12, 13, 14]; 
k = 3; 
m = 2; 
n = len(arr); 
  
arr = reverse(arr, n, k, m ); 
for i in range(0, n):  
    print(arr[i], end = " "); 
      
# This code is contributed by Rajput-Ji 

