

# Python implementation of the approach 
MAX = 100001; 
  
# Function to perform queries to find 
# number of distinct elements from 
# a given index till last index in an array 
def find_distinct(a, n, q, queries): 
    check = [0] * MAX; 
    idx = [0] * MAX; 
    cnt = 1; 
    for i in range(n - 1, -1, -1): 
          
        # Check if current element 
        # already visited or not 
        if (check[a[i]] == 0): 
  
            # If not visited store current counter 
            # and incremet it and mark check as 1 
            idx[i] = cnt; 
            check[a[i]] = 1; 
            cnt += 1; 
        else: 
  
            # Otherwise if visited simply 
            # store current counter 
            idx[i] = cnt - 1; 
  
    # Perform queries 
    for i in range(0, q): 
        m = queries[i]; 
        print(idx[m], end = " "); 
  
# Driver code 
a = [ 1, 2, 3, 1, 2, 3, 4, 5 ]; 
n = len(a); 
queries = [ 0, 3, 5, 7 ]; 
q = len(queries); 
find_distinct(a, n, q, queries); 
  
# This code is contributed by 29AjayKumar 

