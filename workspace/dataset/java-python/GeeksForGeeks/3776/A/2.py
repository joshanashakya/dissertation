

# Python 3 implementation of the approach 
  
# Function to return the minimum steps 
# required to reach the end 
# of the given array 
def minSteps(arr,n): 
      
    # Array to determine whether 
    # a cell has been visited before 
    v = [0 for i in range(n)] 
  
    # Queue for bfs 
    q = [] 
  
    # Push the source i.e. index 0 
    q.append(0) 
  
    # Variable to store 
    # the depth of search 
    depth = 0
  
    # BFS algorithm 
    while (len(q) != 0): 
        # Current queue size 
        x = len(q) 
        while (x >= 1): 
            # Top-most element of queue 
            i = q[0] 
            q.remove(i) 
              
            x -= 1
  
            # Base case 
            if (v[i]): 
                continue; 
  
            # If we reach the destination 
            # i.e. index (n - 1) 
            if (i == n - 1): 
                return depth 
  
            # Marking the cell visited 
            v[i] = 1
  
            # Pushing the adjacent nodes 
            # i.e. indices reachable 
            # from the current index 
            if (i + arr[i] < n): 
                q.append(i + arr[i]) 
            if (i - arr[i] >= 0): 
                q.append(i - arr[i]) 
                  
          
        depth += 1
  
    return -1
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 1, 1, 1, 1, 1] 
    n = len(arr) 
  
    print(minSteps(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

