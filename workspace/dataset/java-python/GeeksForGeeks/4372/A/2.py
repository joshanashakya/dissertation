

# Python 3 program to reverse every alternate sub-array  
# formed by consecutive k elements 
  
# Function to reverse every alternate sub-array  
# formed by consecutive k elements 
def reverse(arr, n, k): 
    # increment i in multiples of 2*k 
    for i in range(0,n,2*k): 
        left = i 
  
        # to handle case when 2*k is not multiple of n 
        right = min(i + k - 1, n - 1) 
  
        # reverse the sub-array [left, right] 
        while (left < right): 
            temp = arr[left] 
            arr[left] = arr[right] 
            arr[right] = temp 
            left += 1
            right -= 1
              
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14] 
    k = 3
  
    n = len(arr) 
  
    reverse(arr, n, k) 
  
    for i in range(0,n,1): 
        print(arr[i],end =" ") 
          
# This code is contributed by 
# Surendra_Gangwar 

