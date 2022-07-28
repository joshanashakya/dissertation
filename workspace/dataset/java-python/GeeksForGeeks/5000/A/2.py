

# Python implementation of the above approach. 
MAX = 100002; 
  
# Function to prno of unique elements 
# in specified suffix for each query. 
def printUniqueElementsInSuffix(arr, n, q, m): 
  
    # aux[i] stores no of unique elements in arr[i..n] 
    aux = [0] * MAX; 
  
    # mark[i] = 1 if i has occurred 
    # in the suffix at least once. 
    mark = [0] * MAX; 
  
    # Initialization for the last element. 
    aux[n - 1] = 1; 
    mark[arr[n - 1]] = 1; 
  
    for i in range(n - 2, -1, -1): 
        if (mark[arr[i]] == 0): 
            aux[i] = aux[i + 1] + 1; 
            mark[arr[i]] = 1; 
        else: 
            aux[i] = aux[i + 1]; 
  
    for i in range(m): 
        print(aux[q[i] - 1]); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 4, 1, 2, 3, 4, 10000, 999]; 
    n = len(arr); 
    q = [1, 3, 6]; 
    m = len(q); 
    printUniqueElementsInSuffix(arr, n, q, m); 
  
# This code is contributed by 29AjayKumar 

