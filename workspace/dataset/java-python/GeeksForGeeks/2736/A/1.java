

// Java implementation of the approach 
  
public class GFG { 
  
// For maximum length of input string  
    static int MAX = 10; 
  
// Declaring the DP table  
    static int F[][] = new int[MAX][MAX]; 
  
// Declaring the prefix array  
    static int C[] = new int[MAX]; 
  
// Function to calculate the  
// number of valid assignments  
    static int noOfAssignments(String S, int n, int i, int c_x) { 
        if (F[i][c_x] != -1) { 
            return F[i][c_x]; 
        } 
  
        if (i == n) { 
  
            // Return 1 if X is  
            // balanced.  
            if (c_x == 1) { 
                F[i][c_x] = 0; 
            } else { 
                F[i][c_x] = 1; 
            } 
  
            return F[i][c_x]; 
        } 
  
        int c_y = C[i] - c_x; 
  
        // Increment the count  
        // if it an opening bracket  
        if (S.charAt(i) == '(') { 
            F[i][c_x] 
                    = noOfAssignments(S, n, i + 1, 
                            c_x + 1) 
                    + noOfAssignments(S, n, 
                            i + 1, c_x); 
            return F[i][c_x]; 
        } 
  
        F[i][c_x] = 0; 
  
        // Decrement the count  
        // if it a closing bracket  
        if (c_x == 1) { 
            F[i][c_x] 
                    += noOfAssignments(S, n, 
                            i + 1, c_x - 1); 
        } 
  
        if (c_y == 1) { 
            F[i][c_x] 
                    += noOfAssignments(S, n, 
                            i + 1, c_x); 
        } 
  
        return F[i][c_x]; 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        String S = "()"; 
        int n = S.length(); 
  
        // Initializing the DP table  
        for (int i = 0; i < MAX; i++) { 
            for (int j = 0; j < MAX; j++) { 
                F[i][j] = -1; 
            } 
        } 
  
        C[0] = 0; 
  
        // Creating the prefix array  
        for (int i = 0; i < n; ++i) { 
            if (S.charAt(i) == '(') { 
                C[i + 1] = C[i] + 1; 
            } else { 
                C[i + 1] = C[i] - 1; 
            } 
        } 
  
        // Initial value for c_x  
        // and c_y is zero  
        System.out.println(noOfAssignments(S, n, 0, 0)); 
  
    } 
} 
// This code is contributed by 29AjayKumar 

