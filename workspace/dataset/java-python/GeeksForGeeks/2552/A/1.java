

// Java implementation of the approach 
  
class GFG { 
    // Initialize the matrix with 0 
    static int l[][] = new int[1001][1001]; 
  
    static void initialize() 
    { 
  
        // 0C0 = 1 
        l[0][0] = 1; 
        for (int i = 1; i < 1001; i++) { 
            // Set every nCr = 1 where r = 0 
            l[i][0] = 1; 
            for (int j = 1; j < i + 1; j++) { 
  
                // Value for the current cell of Pascal's triangle 
                l[i][j] = (l[i - 1][j - 1] + l[i - 1][j]); 
            } 
        } 
    } 
  
    // Function to return the value of nCr 
    static int nCr(int n, int r) 
    { 
        // Return nCr 
        return l[n][r]; 
    } 
    // Driver code 
    public static void main(String[] args) 
    { 
        // Build the Pascal's triangle 
        initialize(); 
        int n = 8; 
        int r = 3; 
        System.out.println(nCr(n, r)); 
    } 
} 
  
// This code is contributed by ihritik 

