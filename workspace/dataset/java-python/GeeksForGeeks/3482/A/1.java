

// Java program to find maximum decimal value path in 
// binary matrix 
  
class GFG { 
  
    static final int N = 4; 
  
// Returns maximum decimal value in binary matrix. 
// Here p indicate power of 2 
    static int maxDecimalValue(int mat[][], int i, int j, 
            int p) { 
        // Out of matrix boundary 
        if (i >= N || j >= N) { 
            return 0; 
        } 
  
        int result = Math.max(maxDecimalValue(mat, i, j + 1, p + 1), 
                maxDecimalValue(mat, i + 1, j, p + 1)); 
  
        // If current matrix value is 1 then return result + 
        // power(2, p) else result 
        if (mat[i][j] == 1) { 
            return (int) (Math.pow(2, p) + result); 
        } else { 
            return result; 
        } 
    } 
  
// Driver program  
    public static void main(String[] args) { 
        int mat[][] = {{1, 1, 0, 1}, 
        {0, 1, 1, 0}, 
        {1, 0, 0, 1}, 
        {1, 0, 1, 1},}; 
  
        System.out.println(maxDecimalValue(mat, 0, 0, 0)); 
    } 
} 
//this code contributed by Rajput-Ji 

