

# Python implementation of the approach  
  
# Function to return the maximum length of 
# strictly increasing subarray after 
# removing atmost one element 
def maxIncSubarr(a, n): 
      
    # Create two arrays pre and pos 
    pre = [0] * n; 
    pos = [0] * n; 
    pre[0] = 1; 
    pos[n - 1] = 1; 
    l = 0; 
  
    # Find out the contribution of the current 
    # element in array[0, i] and update pre[i] 
    for i in range(1, n): 
        if (a[i] > a[i - 1]): 
            pre[i] = pre[i - 1] + 1; 
        else: 
            pre[i] = 1; 
      
    # Find out the contribution of the current 
    # element in array[N - 1, i] and update pos[i] 
    l = 1; 
    for i in range(n - 2, -1, -1): 
        if (a[i] < a[i + 1]): 
            pos[i] = pos[i + 1] + 1; 
        else: 
            pos[i] = 1; 
      
    # Calculate the maximum length of the 
    # stricly increasing subarray without 
    # removing any element 
    ans = 0; 
    l = 1; 
    for i in range(1, n): 
        if (a[i] > a[i - 1]): 
            l += 1; 
        else: 
            l = 1; 
        ans = max(ans, l); 
      
    # Calculate the maximum length of the 
    # strictly increasing subarray after 
    # removing the current element 
    for i in range(1, n - 3): 
        if (a[i - 1] < a[i + 1]): 
            ans = max(pre[i - 1] + pos[i + 1], ans); 
      
    return ans; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 1, 2 ]; 
    n = len(arr); 
  
    print(maxIncSubarr(arr, n)); 
      
# This code is contributed by PrinciRaj1992 

