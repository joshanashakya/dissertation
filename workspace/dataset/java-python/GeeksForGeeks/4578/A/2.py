

# Python 3 program to find sum of maximum  
# and minimum in any subarray of an array  
# of positive numbers. 
  
def maxSum(arr, n): 
    if (n < 2): 
        return -1
    ans = arr[0] + arr[1] 
    for i in range(1, n - 1, 1): 
        ans = min(ans, (arr[i] + arr[i + 1])) 
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 12, 2, 2] 
    n = len(arr) 
    print(maxSum(arr, n)) 
  
# This code is contributed by  
# Surendra_Gangwar 

