

// Java implementation of the approach 
class GFG  
{ 
    static int C = 5; 
    static int R = 3; 
    static int INT_MAX = 10000000; 
      
    // DP table to memoize the values 
    static int [][]table = new int[R][C]; 
      
    // Visited array to keep track of visited nodes 
    // in order to avoid infinite loops 
    static int [][]visited = new int[R][C]; 
      
    // Function to return the minimum of four numbers 
    static int min(int p, int q, int r, int s) 
    { 
        int temp1 = p < q ? p : q; 
        int temp2 = r < s ? r : s; 
      
        if (temp1 < temp2) 
            return temp1; 
        return temp2; 
    } 
      
    // Function to return the minimum distance 
    // to any rotten orange from [i, j] 
    static int Distance(int arr[][], int i, int j) 
    { 
        // If i, j lie outside the array 
        if (i >= R || j >= C || i < 0 || j < 0) 
            return INT_MAX; 
      
        // If result already exists in the table 
        // use the memoized result 
        else if (table[i][j] > 0 && 
                 table[i][j] < INT_MAX)  
        { 
            return table[i][j]; 
        } 
      
        // If 0 then it can't lead to 
        // any path so return INT_MAX 
        else if (arr[i][j] == 0) 
        { 
            table[i][j] = INT_MAX; 
            return INT_MAX; 
        } 
      
        // If 2 then we have reached our rotten oranges 
        // so return from here 
        else if (arr[i][j] == 2)  
        { 
            table[i][j] = 0; 
            return 0; 
        } 
      
        // If this node is already visited 
        // then return to avoid infinite loops 
        else if (visited[i][j] == 1)  
        { 
            return INT_MAX; 
        } 
        else 
        { 
      
            // Mark the current node as visited 
            visited[i][j] = 1; 
      
            // Check in all four possible directions 
            int temp1 = Distance(arr, i + 1, j); 
            int temp2 = Distance(arr, i - 1, j); 
            int temp3 = Distance(arr, i, j + 1); 
            int temp4 = Distance(arr, i, j - 1); 
      
            // Take the minimum of all 
            table[i][j] = 1 + min(temp1, temp2,  
                                  temp3, temp4); 
      
            visited[i][j] = 0; 
        } 
        return table[i][j]; 
    } 
      
    // Function to return the minimum time 
    // required to rot all the oranges 
    static int minTime(int arr[][]) 
    { 
        int max = 0; 
      
        // Calculate the minimum distances to any rotten 
        // orange from all the fresh oranges 
        for (int i = 0; i < R; i++)  
        { 
            for (int j = 0; j < C; j++) 
            { 
                if (arr[i][j] == 1) 
                    Distance(arr, i, j); 
            } 
        } 
      
        // Pick the maximum distance of fresh orange 
        // to some rotten orange 
        for (int i = 0; i < R; i++) 
        { 
            for (int j = 0; j < C; j++)  
            { 
                if (arr[i][j] == 1 && 
                    table[i][j] > max) 
                    max = table[i][j]; 
            } 
        } 
      
        // If all oranges can be rotten 
        if (max < INT_MAX) 
            return max; 
      
        return -1; 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[][] = {{ 2, 1, 0, 2, 1 }, 
                       { 0, 0, 1, 2, 1 }, 
                       { 1, 0, 0, 2, 1 }}; 
      
        System.out.println(minTime(arr)); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

