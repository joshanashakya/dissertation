

# Python3 implementation of the approach 
  
# Function that compares a and b 
def cmp(a, b): 
    return (a > b) - (a < b) 
  
# Function to return length of longest subarray  
# that satisfies one of the given conditions 
def maxSubarraySize(arr): 
    N = len(arr) 
    ans = 1
    anchor = 0
  
    for i in range(1, N): 
        c = cmp(arr[i - 1], arr[i]) 
        if c == 0: 
            anchor = i 
        elif i == N - 1 or c * cmp(arr[i], arr[i + 1]) != -1: 
            ans = max(ans, i - anchor + 1) 
            anchor = i 
    return ans 
  
  
# Driver program 
arr = [9, 4, 2, 10, 7, 8, 8, 1, 9] 
  
# Print the required answer 
print(maxSubarraySize(arr)) 

