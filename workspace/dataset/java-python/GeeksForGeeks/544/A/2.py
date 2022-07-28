

# Python3 program to count pairs 
# in an array whose sum is less 
# than given number x 
  
# Function to count pairs in array 
# with sum less than x. 
def findPairs(arr, n, x): 
  
    l = 0; r = n-1
    result = 0
  
    while (l < r): 
      
        # If current left and current 
        # right have sum smaller than x, 
        # the all elements from l+1 to r 
        # form a pair with current l. 
        if (arr[l] + arr[r] < x): 
          
            result += (r - l) 
            l += 1
          
  
        # Move to smaller value 
        else: 
            r -= 1
  
    return result 
      
# Driver Code 
arr = [1, 2, 3, 4, 5, 6, 7, 8] 
n = len(arr) 
x = 7
print(findPairs(arr, n, x)) 
  
# This code is contributed by Anant Agarwal. 

