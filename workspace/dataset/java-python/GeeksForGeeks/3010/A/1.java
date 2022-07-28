

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
    static final int n = 3; 
    static final int m = 3; 
  
    // Function that returns true if matrix1 
    // can be converted to matrix2 
    // with the given operation 
    static boolean check(int a[][], int b[][]) 
    { 
  
        // Traverse all the diagonals 
        // starting at first column 
        for (int i = 0; i < n; i++)  
        { 
            Vector<Integer> v1 = new Vector<Integer>(); 
            Vector<Integer> v2 = new Vector<Integer>(); 
            int r = i; 
            int col = 0; 
  
            // Traverse in diagonal 
            while (r >= 0 && col < m) 
            { 
  
                // Store the diagonal elements 
                v1.add(a[r][col]); 
                v2.add(b[r][col]); 
  
                // Move up 
                r--; 
                col++; 
            } 
  
            // Sort the elements 
            Collections.sort(v1); 
            Collections.sort(v2); 
  
            // Check if they are same 
            for (int j = 0; j < v1.size(); j++) 
            { 
                if (v1.get(j) != v2.get(j)) 
                { 
                    return false; 
                } 
            } 
        } 
  
        // Traverse all the diagonals 
        // starting at last row 
        for (int j = 1; j < m; j++)  
        { 
            Vector<Integer> v1 = new Vector<Integer>(); 
            Vector<Integer> v2 = new Vector<Integer>(); 
            int r = n - 1; 
            int col = j; 
  
            // Traverse in the diagonal 
            while (r >= 0 && col < m)  
            { 
  
                // Store diagonal elements 
                v1.add(a[r][col]); 
                v2.add(b[r][col]); 
                r--; 
                col++; 
            } 
  
            // Sort all elements 
            Collections.sort(v1); 
            Collections.sort(v2); 
  
            // Check for same 
            for (int i = 0; i < v1.size(); i++)  
            { 
                if (v1.get(i) != v2.get(i))  
                { 
                    return false; 
                } 
            } 
        } 
  
        // If every element matches 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        int b[][] = {{1, 4, 7}, {2, 5, 6}, {3, 8, 9}}; 
  
        if (check(a, b))  
        { 
            System.out.println("Yes"); 
        }  
        else 
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code contributed by Rajput-Ji 

