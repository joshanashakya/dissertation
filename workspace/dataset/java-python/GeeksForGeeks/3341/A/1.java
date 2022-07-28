

// Java implementation of the above approach 
  
class GFG 
{ 
      
    static int INF=99999; 
      
    static int findMinimumSteps(int mat[][], int x, int y, int n) 
    { 
        // dist[][] will be the output matrix that 
        // will finally have the shortest 
        // distances between every pair of numbers 
        int i, j, k; 
        int [][] dist= new int[n][n];  
      
        // Initially same as mat 
        for (i = 0; i < n; i++) { 
            for (j = 0; j < n; j++) { 
                if (mat[i][j] == 0) 
                    dist[i][j] = INF; 
                else
                    dist[i][j] = 1; 
      
                if (i == j) 
                    dist[i][j] = 1; 
            } 
        } 
      
        // Add all numbers one by one to the set 
        // of intermediate numbers. Before start of  
        // an iteration, we have shortest distances  
        // between all pairs of numbers such that the  
        // shortest distances consider only the numbers  
        // in set {0, 1, 2, .. k-1} as intermediate numbers. 
        // After the end of an iteration, vertex no. k is  
        // added to the set of intermediate numbers and  
        // the set becomes {0, 1, 2, .. k} 
        for (k = 0; k < n; k++) { 
      
            // Pick all numbers as source one by one 
            for (i = 0; i < n; i++) { 
      
                // Pick all numbers as destination for the 
                // above picked source 
                for (j = 0; j < n; j++) { 
      
                    // If number k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
                } 
            } 
        } 
      
        // If no path 
        if (dist[x][y] < INF) 
            return dist[x][y]; 
        else
            return -1; 
    } 
      
    // Driver Code 
    public static void main(String []args) 
    { 
      
        int [][] mat =  { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                        { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                        { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 } }; 
      
        int x = 2, y = 3; 
        int size=mat.length; 
          
        System.out.println( findMinimumSteps(mat, x, y, size)); 
    } 
  
} 
  
  
// This code is contributed by ihritik 

