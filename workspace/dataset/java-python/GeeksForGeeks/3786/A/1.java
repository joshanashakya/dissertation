

          
// Java program to find the maximum value  
// of a + shaped pattern in 2-D array  
      
class GFG  
{  
    public static int N = 100; 
      
    public static int n = 3, m = 4;  
          
    // Function to return maximum Plus value  
    public static int maxPlus(int[][] arr)  
    {  
          
        // Initializing answer with the minimum value  
        int ans = Integer.MIN_VALUE;  
          
        // Initializing all four arrays  
        int[][] left = new int[N][N]; 
        int[][] right = new int[N][N]; 
        int[][] up = new int[N][N]; 
        int[][] down = new int[N][N];  
          
        // Initializing left and up array.  
        for (int i = 0; i < n; i++)  
        {  
            for (int j = 0; j < m; j++) 
            {  
                left[i][j] = Math.max(0, ((j != 0) ? left[i][j - 1] : 0))  
                                                + arr[i][j];  
                up[i][j] = Math.max(0, ((i != 0)? up[i - 1][j] : 0))  
                                                + arr[i][j];  
            }  
        }  
          
        // Initializing right and down array.  
        for (int i = 0; i < n; i++)  
        {  
            for (int j = 0; j < m; j++)  
            {  
                right[i][j] = Math.max(0, (j + 1 == m ? 0: right[i][j + 1]))  
                                                                + arr[i][j];  
                down[i][j] = Math.max(0, (i + 1 == n ? 0: down[i + 1][j]))  
                                                                + arr[i][j];  
            }  
        }  
          
        // calculating value of maximum Plus (+) sign  
        for (int i = 1; i < n - 1; ++i)  
            for (int j = 1; j < m - 1; ++j)  
                ans = Math.max(ans, up[i - 1][j] + down[i + 1][j]  
                            + left[i][j - 1] + right[i][j + 1] + arr[i][j]);  
          
        return ans;  
    }  
          
    // Driver code  
    public static void main(String[] args) { 
        int[][] arr = new int[][]{ { 1, 1, 1, 1 },  
                                   { -6, 1, 1, -4 },  
                                   { 1, 1, 1, 1 } };  
        // Function call to find maximum value 
        System.out.println( maxPlus(arr) );  
    } 
} 
  
// This code is contributed by PrinciRaj1992. 

