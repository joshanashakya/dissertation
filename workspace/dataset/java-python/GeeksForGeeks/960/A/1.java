

// Java program to find minimum odd  
// cost path in a matrix 
public class GFG { 
  
    public static final int M = 100 ; 
    public static final int N = 100 ; 
      
    // Function to find the minimum cost  
    static int find_min_odd_cost(int given[][], int m, int n)  
    {  
        int floor[][] = new int [M][N];  
        int min_odd_cost = 0;  
        int i, j, temp;  
        
        for (j = 0; j < n; j++)  
            floor[0][j] = given[0][j];  
        
        for (i = 1; i < m; i++)  
            for (j = 0; j < n; j++) {  
        
                // leftmost element  
                if (j == 0) {  
                    floor[i][j] = given[i][j];  
                    floor[i][j] += Math.min(floor[i - 1][j], floor[i - 1][j + 1]);  
                }  
        
                // rightmost element  
                else if (j == n - 1) {  
                    floor[i][j] = given[i][j];  
                    floor[i][j] += Math.min(floor[i - 1][j], floor[i - 1][j - 1]);  
                }  
        
                // Any element except leftmost and rightmost element of a row  
                // is reachable from direct upper or left upper or right upper  
                // row's block  
                else {  
        
                    // Counting the minimum cost  
                    temp = Math.min(floor[i - 1][j], floor[i - 1][j - 1]);  
                    temp = Math.min(temp, floor[i - 1][j + 1]);  
                    floor[i][j] = given[i][j] + temp;  
                }  
            }  
        
        min_odd_cost = Integer.MAX_VALUE;  
        
        // Find the minimum cost  
        for (j = 0; j < n; j++) {  
            if (floor[n - 1][j] % 2 == 1) {  
                if (min_odd_cost > floor[n - 1][j])  
                    min_odd_cost = floor[n - 1][j];  
            }  
        }  
        
        if (min_odd_cost == Integer.MIN_VALUE)  
            return -1;  
        
        return min_odd_cost;  
    }  
    // Driver code 
    public static void main(String args[]) 
    { 
         int m = 5, n = 5;  
            int given[][] = { { 1, 2, 3, 4, 6 },  
                                { 1, 2, 3, 4, 5 },  
                                { 1, 2, 3, 4, 5 },  
                                { 1, 2, 3, 4, 5 },  
                                { 100, 2, 3, 4, 5 } };  
              
            System.out.println( "Minimum odd cost is " + find_min_odd_cost(given, m, n)); 
    } 
    // This Code is contributed by ANKITRAI1 
} 
   

