

# Python3 implementation of the above approach 
from collections import deque as queue 
def check(k, a, n, m): 
  
    cells = [[0 for i in range(2)] for i in range(k)] 
    visited = [[0 for i in range(m)] for i in range(n)] 
    count = 0
    for i in range(n): 
        for j in range(m): 
  
            if (a[i][j] != 0
                and a[i][j] != -1): 
  
                cells[count][0] = i 
                cells[count][1] = j 
                count += 1
  
            visited[i][j] = False
  
    # Arrays to make grid traversals easier 
    dx = [0, 0, 1, -1] 
    dy = [1, -1, 0, 0] 
  
    # Store number of components 
    component = 0
  
    # Perform BFS and maark every cell 
    # by the component in which it belongs 
    for i in range(k): 
  
        x = cells[i][0] 
        y = cells[i][1] 
  
        if (visited[x][y]): 
            continue
        component += 1
        cell = queue() 
        cell.append([x, y]) 
        visited[x][y] = True
  
        while (len(cell) > 0): 
  
            z = cell.popleft() 
            a[z[0]][z[1]] = component 
  
            for j in range(4): 
  
                new_x = z[0] + dx[j] 
                new_y = z[1] + dy[j] 
                if (new_x < 0 or new_x >= n 
                    or new_y < 0 or new_y >= m): 
                    continue
                if (visited[new_x][new_y] 
                    or a[new_x][new_y] == -1): 
                    continue
  
                cell.append([new_x, new_y]) 
                visited[new_x][new_y] = True
  
    maximum = 0
    for i in range(n): 
        for j in range(m): 
  
            if (a[i][j] == -1): 
                se = dict() 
                for kk in range(4): 
  
                    xx = i + dx[kk] 
                    yy = j + dy[kk] 
                    if (xx < 0 or xx >= n 
                        or yy < 0 or yy >= m): 
                        continue
  
                    # if the cell doesn't 
                    # belong to any component 
                    if (a[xx][yy] <= 0): 
                        continue
                    se[a[xx][yy]] = 1
  
                s = len(se) 
                maximum = max(s, maximum) 
  
    if (maximum == component): 
        print("Yes\n") 
  
    else: 
        print("No\n") 
  
# Driver code 
if __name__ == '__main__': 
    k = 6
    n = 4
    m = 4
    a=[[0, 5, 6, 0 ], 
    [3, -1, -1, 4], 
    [-1, 2, 1, -1], 
    [-1, -1,-1,-1]] 
  
    check(k, a, n, m) 
  
# This code is contributed by mohit kumar 29 

