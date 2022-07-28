

# Python3 program to find Minimum  
# odd cost path in a matrix 
M = 100 # number of rows 
N = 100 # number of columns 
  
# Function to find the minimum cost 
def find_min_odd_cost(given, m, n): 
  
    floor = [[0 for i in range(M)]  
                for i in range(N)] 
    min_odd_cost = 0
    i, j, temp = 0, 0, 0
  
    for j in range(n): 
        floor[0][j] = given[0][j] 
  
    for i in range(1, m): 
        for j in range(n): 
  
            # leftmost element 
            if (j == 0): 
                floor[i][j] = given[i][j]; 
                floor[i][j] += min(floor[i - 1][j],  
                                   floor[i - 1][j + 1]) 
            # rightmost element 
            elif (j == n - 1): 
                floor[i][j] = given[i][j]; 
                floor[i][j] += min(floor[i - 1][j], 
                                   floor[i - 1][j - 1]) 
  
            # Any element except leftmost and rightmost  
            # element of a row is reachable from direct  
            # upper or left upper or right upper row's block 
            else: 
                  
                # Counting the minimum cost 
                temp = min(floor[i - 1][j],  
                           floor[i - 1][j - 1]) 
                temp = min(temp, floor[i - 1][j + 1]) 
                floor[i][j] = given[i][j] + temp 
  
    min_odd_cost = 10**9
  
    # Find the minimum cost 
    for j in range(n): 
        if (floor[n - 1][j] % 2 == 1): 
            if (min_odd_cost > floor[n - 1][j]): 
                min_odd_cost = floor[n - 1][j] 
  
  
    if (min_odd_cost == -10**9): 
        return -1; 
  
    return min_odd_cost 
  
# Driver code 
m, n = 5, 5
given = [[ 1, 2, 3, 4, 6 ], 
         [ 1, 2, 3, 4, 5 ], 
         [ 1, 2, 3, 4, 5 ], 
         [ 1, 2, 3, 4, 5 ], 
         [ 100, 2, 3, 4, 5 ]] 
  
print("Minimum odd cost is", 
       find_min_odd_cost(given, m, n)) 
  
# This code is contributed by mohit kumar 

