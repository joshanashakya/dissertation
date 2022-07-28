

# Python 3 program to find longest 
# even sum subsequence.  
INT_MIN = -100000000
  
# Returns sum of maximum even 
# sum subsequence  
def maxEvenSum(arr, n): 
      
    # Find sum of positive numbers  
    pos_sum = 0
    for i in range(n):  
        if (arr[i] > 0):  
            pos_sum += arr[i]  
  
    # If sum is even, it is our answer  
    if (pos_sum % 2 == 0):  
        return pos_sum  
  
    # Traverse the array to find the  
    # maximum sum by adding a positive  
    # odd or subtracting a negative odd  
    ans = INT_MIN;  
    for i in range(n): 
        if (arr[i] % 2 != 0): 
            if (arr[i] > 0):  
                ans = max(ans, pos_sum - arr[i]) 
            else: 
                ans = max(ans, pos_sum + arr[i]) 
    return ans 
  
# Driver Code 
a = [-2, 2, -3, 1]  
n = len(a)  
print(maxEvenSum(a, n)) 
  
# This code is contributed by sahilshelangia  

