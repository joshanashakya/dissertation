

// Java Program to find the number of 
// transpositions in a permutation 
import java.io.*; 
  
class GFG { 
      
    static int N = 1000001; 
      
    static int visited[] = new int[N]; 
      
    // This array stores which element 
    // goes to which position 
    static int goesTo[]= new int[N]; 
      
    // For eg. in { 5, 1, 4, 3, 2 } 
    // goesTo[1] = 2 
    // goesTo[2] = 5 
    // goesTo[3] = 4 
    // goesTo[4] = 3 
    // goesTo[5] = 1 
      
    // This function returns the size  
    // of a component cycle 
    static int dfs(int i) 
    { 
          
        // If it is already visited 
        if (visited[i] == 1) 
            return 0; 
      
        visited[i] = 1; 
        int x = dfs(goesTo[i]); 
        return (x + 1); 
    } 
      
    // This functio returns the number 
    // of transpositions in the 
    // permutation 
    static int noOfTranspositions(int P[], 
                                    int n) 
    { 
        // Initializing visited[] array 
        for (int i = 1; i <= n; i++) 
            visited[i] = 0; 
      
        // building the goesTo[] array 
        for (int i = 0; i < n; i++) 
            goesTo[P[i]] = i + 1; 
      
        int transpositions = 0; 
      
        for (int i = 1; i <= n; i++) { 
            if (visited[i] == 0) { 
                int ans = dfs(i); 
                transpositions += ans - 1; 
            } 
        } 
        return transpositions; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int permutation[] = { 5, 1, 4, 3, 2 }; 
        int n = permutation.length ; 
  
        System.out.println( 
           noOfTranspositions(permutation, n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

