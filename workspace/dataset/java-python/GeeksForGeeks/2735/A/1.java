

// Java implementation of the above approach 
class GFG  
{ 
  
    // For maximum length of input string 
    static int MAX = 10; 
  
    // Declaring the DP table 
    static int[][][] F = new int[MAX][MAX][MAX]; 
  
    // Function to calculate the 
    // number of valid assignments 
    static int noOfAssignments(String s, int n,  
                               int i, int c_x, int c_y) 
    { 
        if (F[i][c_x][c_y] != -1) 
            return F[i][c_x][c_y]; 
        if (i == n) 
        { 
  
            // Return 1 if both 
            // subsequences are balanced 
            F[i][c_x][c_y] = (c_x == 0 &&  
                              c_y == 0) ? 1 : 0; 
            return F[i][c_x][c_y]; 
        } 
  
        // Increment the count 
        // if it an opening bracket 
        if (s.charAt(i) == '(') 
        { 
            F[i][c_x][c_y] = noOfAssignments(s, n, i + 1,  
                                             c_x + 1, c_y) +  
                             noOfAssignments(s, n, i + 1,  
                                             c_x, c_y + 1); 
            return F[i][c_x][c_y]; 
        } 
  
        F[i][c_x][c_y] = 0; 
  
        // Decrement the count 
        // if it a closing bracket 
        if (c_x != 0) 
            F[i][c_x][c_y] += noOfAssignments(s, n, i + 1, 
                                              c_x - 1, c_y); 
  
        if (c_y != 0) 
            F[i][c_x][c_y] += noOfAssignments(s, n, i + 1,  
                                              c_x, c_y - 1); 
  
        return F[i][c_x][c_y]; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String s = "(())"; 
        int n = s.length(); 
  
        // Initializing the DP table 
        for (int i = 0; i < MAX; i++) 
            for (int j = 0; j < MAX; j++) 
                for (int k = 0; k < MAX; k++) 
                    F[i][j][k] = -1; 
  
        // Intitial value for c_x 
        // and c_y is zero 
        System.out.println(noOfAssignments(s, n, 0, 0, 0)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

