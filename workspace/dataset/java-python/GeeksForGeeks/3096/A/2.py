

# Python3 implementation to find the 
# minimum cost tree 
  
# Function to find minimum cost tree 
def MinCostTree(arr, n): 
      
    ans = 0
    st = [2**32] 
      
    # Loop to traverse the array elements 
    for i in range(n): 
          
        # Keep array elements  
        # in decreasing order by poping out 
        # the elements from stack till the top 
        # element is less than current element 
        while (st[-1] <= arr[i]): 
              
            # Get top element 
            x = st[-1] 
              
            # Remove it 
            st.pop() 
              
            # Get the minimum cost to remove x 
            ans += x * min(st[-1], arr[i]) 
              
        # Push current element 
        st.append(arr[i]) 
          
    # Find cost for all remaining elements 
    for i in range(2,len(st)): 
        ans += st[i] * st[i - 1] 
          
    return ans 
      
# Driver Code 
arr = [5, 2, 3] 
  
n = len(arr) 
  
# Function call 
print(MinCostTree(arr, n)) 
  
# This code is contributed by shubhamsingh10 

