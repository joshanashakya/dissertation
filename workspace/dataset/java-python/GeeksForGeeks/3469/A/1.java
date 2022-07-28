

// Java implementation of the above approach 
import java.util.*; 
  
class GFG{ 
    static class pair 
    {  
        int first, second;  
        public pair(int first, int second)   
        {  
            this.first = first;  
            this.second = second;  
        }     
    }  
static void check(int k, int [][]a, 
           int n, int m) 
{ 
    int [][]cell = new int[k][2]; 
    boolean [][]visited = new boolean[n][m]; 
    int count = 0; 
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < m; j++) { 
   
            if (a[i][j] != 0
                && a[i][j] != -1) { 
   
                cell[count][0] = i; 
                cell[count][1] = j; 
                count++; 
            } 
            visited[i][j] = false; 
        } 
    } 
   
    // Arrays to make grid traversals easier 
    int dx[] = { 0, 0, 1, -1 }; 
    int dy[] = { 1, -1, 0, 0 }; 
   
    // Store number of components 
    int component = 0; 
   
    // Perform BFS and maark every cell 
    // by the component in which it belongs 
    for (int i = 0; i < k; i++) { 
   
        int x = cell[i][0], y = cell[i][1]; 
   
        if (visited[x][y]) 
            continue; 
        component++; 
        Queue<pair> cells = new LinkedList<>(); 
        cells.add(new pair(x, y)); 
        visited[x][y] = true; 
   
        while (!cells.isEmpty()) { 
   
            pair z = cells.peek(); 
            cells.remove(); 
            a[z.first][z.second] = component; 
   
            for (int j = 0; j < 4; j++) { 
   
                int new_x = z.first + dx[j]; 
                int new_y = z.second + dy[j]; 
                if (new_x < 0 || new_x >= n 
                    || new_y < 0 || new_y >= m) 
                    continue; 
                if (visited[new_x][new_y] 
                    || a[new_x][new_y] == -1) 
                    continue; 
   
                cells.add(new pair(new_x, new_y)); 
                visited[new_x][new_y] = true; 
            } 
        } 
    } 
   
    int maximum = 0; 
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < m; j++) { 
   
            if (a[i][j] == -1) { 
                HashSet<Integer> set = new HashSet<Integer>(); 
                for (int kk = 0; kk < 4; kk++) { 
   
                    int xx = i + dx[kk]; 
                    int yy = j + dy[kk]; 
                    if (xx < 0 || xx >= n 
                        || yy < 0 || yy >= m) 
                        continue; 
   
                    // if the cell doesn't 
                    // belong to any component 
                    if (a[xx][yy] <= 0) 
                        continue; 
                    set.add(a[xx][yy]); 
                } 
                int s = set.size(); 
                maximum = Math.max(s, maximum); 
            } 
        } 
    } 
   
    if (maximum == component) { 
        System.out.print("Yes\n"); 
    } 
    else { 
        System.out.print("No\n"); 
    } 
} 
  
public static void main(String[] args) 
{ 
    int k = 6; 
    int n = 4, m = 4; 
    int [][]a 
        = { { 0, 5, 6, 0 }, 
            { 3, -1, -1, 4 }, 
            { -1, 2, 1, -1 }, 
            { -1, -1, -1, -1 } }; 
   
    check(k, a, n, m); 
} 
} 
  
// This code is contributed by 29AjayKumar 

