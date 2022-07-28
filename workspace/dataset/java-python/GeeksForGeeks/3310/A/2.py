

# Python 3 implementation of the approach 
C = 5
R = 3
INT_MAX = 10000000
  
# DP table to memoize the values 
table = [[0 for i in range(C)]  
            for j in range(R)] 
  
# Visited array to keep track of visited nodes 
# in order to avoid infinite loops 
visited = [[0 for i in range(C)]  
              for j in range(R)] 
  
# Function to return the minimum of four numbers 
def min(p, q, r, s): 
    if(p < q): 
        temp1 = p 
    else: 
        temp1 = q 
    if(r < s): 
        temp2 = r 
    else: 
        temp2 = s 
      
    if (temp1 < temp2): 
        return temp1 
    return temp2 
  
# Function to return the minimum distance 
# to any rotten orange from [i, j] 
def Distance(arr, i, j): 
      
    # If i, j lie outside the array 
    if (i >= R or j >= C or i < 0 or j < 0): 
        return INT_MAX 
  
    # If result already exists in the table 
    # use the memoized result 
    elif (table[i][j] > 0 and 
          table[i][j] < INT_MAX): 
        return table[i][j] 
  
    # If 0 then it can't lead to 
    # any path so return INT_MAX 
    elif (arr[i][j] == 0): 
        table[i][j] = INT_MAX 
        return INT_MAX 
  
    # If 2 then we have reached  
    # our rotten oranges  
    # so return from here 
    elif (arr[i][j] == 2): 
        table[i][j] = 0
        return 0
  
    # If this node is already visited 
    # then return to avoid infinite loops 
    elif (visited[i][j]): 
        return INT_MAX 
    else: 
        # Mark the current node as visited 
        visited[i][j] = 1
  
        # Check in all four possible directions 
        temp1 = Distance(arr, i + 1, j) 
        temp2 = Distance(arr, i - 1, j) 
        temp3 = Distance(arr, i, j + 1) 
        temp4 = Distance(arr, i, j - 1) 
  
        # Take the minimum of all 
        table[i][j] = 1 + min(temp1, temp2, 
                              temp3, temp4) 
  
        visited[i][j] = 0
  
    return table[i][j] 
  
# Function to return the minimum time 
# required to rot all the oranges 
def minTime(arr): 
    max = 0
  
    # Calculate the minimum distances to any rotten 
    # orange from all the fresh oranges 
    for i in range(R): 
        for j in range(C): 
            if (arr[i][j] == 1): 
                Distance(arr, i, j) 
  
    # Pick the maximum distance of fresh orange 
    # to some rotten orange 
    for i in range(R): 
        for j in range(C): 
            if (arr[i][j] == 1 and 
                table[i][j] > max): 
                max = table[i][j] 
  
    # If all oranges can be rotten 
    if (max < INT_MAX): 
        return max
    return -1
  
# Driver code 
if __name__ == '__main__': 
    arr = [[2, 1, 0, 2, 1], 
        [0, 0, 1, 2, 1], 
        [1, 0, 0, 2, 1]] 
  
    print(minTime(arr)) 
      
# This code is contributed by 
# Surendra_Gangwar 

