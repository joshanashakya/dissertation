

# Pyton3 implementation of the above approach 
  
INF = 99999
size = 10
  
def findMinimumSteps(mat, x, y, n): 
  
    # dist[][] will be the output matrix  
    # that will finally have the shortest 
    # distances between every pair of numbers 
    dist = [[0 for i in range(n)]  
               for i in range(n)] 
    i, j, k = 0, 0, 0
  
    # Initially same as mat 
    for i in range(n): 
        for j in range(n): 
            if (mat[i][j] == 0): 
                dist[i][j] = INF 
            else: 
                dist[i][j] = 1
  
            if (i == j): 
                dist[i][j] = 1
          
    # Add all numbers one by one to the set 
    # of intermediate numbers. Before start  
    # of an iteration, we have shortest distances  
    # between all pairs of numbers such that the  
    # shortest distances consider only the numbers  
    # in set {0, 1, 2, .. k-1} as intermediate  
    # numbers. After the end of an iteration, vertex  
    # no. k is added to the set of intermediate  
    # numbers and the set becomes {0, 1, 2, .. k} 
    for k in range(n): 
  
        # Pick all numbers as source one by one 
        for i in range(n): 
  
            # Pick all numbers as destination  
            # for the above picked source 
            for j in range(n): 
  
                # If number k is on the shortest path from 
                # i to j, then update the value of dist[i][j] 
                if (dist[i][k] + dist[k][j] < dist[i][j]): 
                    dist[i][j] = dist[i][k] + dist[k][j] 
  
    # If no path 
    if (dist[x][y] < INF): 
        return dist[x][y] 
    else: 
        return -1
  
# Driver Code 
mat = [[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
       [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
       [ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 ], 
       [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 ], 
       [ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 ], 
       [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
       [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
       [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
       [ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 ], 
       [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 ]] 
  
x, y = 2, 3
  
print(findMinimumSteps(mat, x, y, size)) 
  
# This code is contributed by Mohit kumar 29 

