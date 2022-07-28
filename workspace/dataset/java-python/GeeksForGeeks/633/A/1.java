

// Java implementation of the approach 
import java.util.Arrays; 
  
class GfG { 
  
    // Table for storing 2^ith parent 
    private static int table[][]; 
  
    // To store the height of the tree 
    private static int height; 
  
    // Private constructor for initializing 
    // the table and the height of the tree 
    private GfG(int n) 
    { 
  
        // log(n) with base 2 
        height = (int)Math.ceil(Math.log10(n) / Math.log10(2)); 
        table = new int[n + 1][height + 1]; 
    } 
  
    // Filling with -1 as initial 
    private static void preprocessing() 
    { 
        for (int i = 0; i < table.length; i++) { 
            Arrays.fill(table[i], -1); 
        } 
    } 
  
    // Calculating sparse table[][] dynamically 
    private static void calculateSparse(int u, int v) 
    { 
  
        // Using the recurrence relation to 
        // calculate the values of table[][] 
        table[v][0] = u; 
        for (int i = 1; i <= height; i++) { 
            table[v][i] = table[table[v][i - 1]][i - 1]; 
  
            // If we go out of bounds of the tree 
            if (table[v][i] == -1) 
                break; 
        } 
    } 
  
    // Function to return the Kth ancestor of V 
    private static int kthancestor(int V, int k) 
    { 
  
        // Doing bitwise operation to 
        // check the set bit 
        for (int i = 0; i <= height; i++) { 
            if ((k & (1 << i)) != 0) { 
                V = table[V][i]; 
                if (V == -1) 
                    break; 
            } 
        } 
        return V; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        // Number of vertices 
        int n = 6; 
  
        // Calling the constructor 
        GfG obj = new GfG(n); 
  
        // Pre-processing 
        preprocessing(); 
  
        // Calculating ancestors of v 
        calculateSparse(1, 2); 
        calculateSparse(1, 3); 
        calculateSparse(2, 4); 
        calculateSparse(2, 5); 
        calculateSparse(3, 6); 
  
        int K = 2, V = 5; 
        System.out.print(kthancestor(V, K)); 
    } 
} 

