

// JAVA implementation to find the Nth 
// smallest character for a given range 
// in a string 
  
import java.io.*; 
import java.util.*; 
  
class GFG { 
  
    // Query class to represent a query range 
    // along with n 
    public static class Query { 
        public int l, r, n; 
  
        // Constructor for the Query class which 
        // takes three integers L, R, N 
        public Query(int l, int r, int n) 
        { 
            this.l = l; 
            this.r = r; 
            this.n = n; 
        } 
    } 
  
    // Function to print the Nth smallest 
    // character for a given range in a string 
    public static void printSmallest(String s, Query[] q) 
    { 
  
        // Integer N contains the 
        // length of the string s 
        int N = s.length(); 
  
        // We initialise our hash array and 
        // set all the elements to 0 
        int[][] H = new int[N + 1][26]; 
  
        // We preprocess our string in which we 
        // update the current character 
        // as well as add the H[i - 1]th 
        // array to H[i] 
        for (int i = 1; i <= N; i++) { 
  
            // Incrementing the frequency of 
            // ith row based on the occurrence 
            // of the characters up to i-th index 
            ++H[i][s.charAt(i - 1) - 'a']; 
  
            // Adding the values of the array at 
            // the previous index to the next index 
            for (int j = 0; j < 26; j++) { 
                H[i][j] += H[i - 1][j]; 
            } 
        } 
  
        // Integer m contains the 
        // number of queries 
        int m = q.length; 
  
        // We traverse from 0 to m to 
        // fetch all the queries 
        for (int j = 0; j < m; j++) { 
  
            // Extracting l, r and n 
            // from the query array q 
            int l = q[j].l, r = q[j].r, 
                n = q[j].n; 
  
            // The initial sum is set to 0 
            int sum = 0; 
  
            // We subtract H[l-1] from h[r] 
            // and add it to the sum 
            for (int i = 0; i < 26; i++) { 
                sum += H[r][i] - H[l - 1][i]; 
  
                // Whenever the sum is greater than 
                // or equal to N, the equivalent 
                // character of the index is our 
                // nth smallest character 
                if (sum >= n) { 
                    System.out.println((char)('a' + i)); 
                    break; 
                } 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        // Input string s 
        String s = "afbccdeb"; 
  
        // Query array q, for each q 
        // it contains l, r and n 
        Query[] q = { new Query(2, 4, 1), 
                      new Query(1, 6, 4), 
                      new Query(1, 8, 7) }; 
  
        // Calling the function 
        printSmallest(s, q); 
    } 
} 

