

// Java implementation of the approach 
public class GFG { 
  
    // Function to print all the possible paths 
    private static void printPaths(char[][] input, 
                                   int R, int C) 
    { 
        for (int i = 0; i < C; i++) { 
            dfs(input, "", 0, i, R, C); 
            System.out.println(); 
        } 
    } 
  
    /** 
    * Depth first traversal of the array 
    * 
    * @param input array of characters 
    * @param res to be printed in console 
    * @param i     current row index 
    * @param j     current column index 
    * @param R     number of rows in the input array 
    * @param C     number of rows in the output array 
    */
    private static void dfs(char[][] input, String res, 
                            int i, int j, int R, int C) 
    { 
        // If the current row index equals to R, it 
        // indicates we have reached the bottom of 
        // the array and hence we print the result 
        if (i == R) { 
            System.out.print(res + " "); 
            return; 
        } 
  
        res = res + input[i][j]; 
  
        // Iterate over each of the columns 
        // in the array 
        for (int k = 0; k < C; k++) { 
            dfs(input, res, i + 1, k, R, C); 
            if (i + 1 == R) { 
                break; 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        char[][] input = { 
            { 'a', 'b' }, 
            { 'd', 'e' } 
        }; 
        int R = input.length; 
        int C = input[0].length; 
        printPaths(input, R, C); 
    } 
} 

