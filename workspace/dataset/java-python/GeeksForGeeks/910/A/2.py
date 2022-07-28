

# Python3 implementation of the approach 
  
# Function to return the maximum possible xor 
def maximumXor(arr: list, n: int) -> int: 
    sForward, sBackward = [], [] 
  
    # To store the final answer 
    ans = -1
  
    for i in range(n): 
  
        # Borward traversal 
        while len(sForward) > 0 and arr[i] < arr[sForward[-1]]: 
            ans = max(ans, arr[i] ^ arr[sForward[-1]]) 
            sForward.pop() 
  
        sForward.append(i) 
  
        # Backward traversal 
        while len(sBackward) > 0 and arr[n - i - 1] < arr[sBackward[-1]]: 
            ans = max(ans, arr[n - i - 1] ^ arr[sBackward[-1]]) 
            sBackward.pop() 
  
        sBackward.append(n - i - 1) 
  
    return ans 
  
# Driver Code 
if __name__ == "__main__": 
  
    arr = [8, 1, 2] 
    n = len(arr) 
    print(maximumXor(arr, n)) 
  
# This code is contributed by 
# sanjeev2552 

