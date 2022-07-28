

// Java program to find all permutations of a given row 
import java.util.*; 
  
class GFG 
{ 
      
static int MAX = 100; 
  
// Function to find all permuted rows of a given row r 
static void permutatedRows(int mat[][], int m, int n, int r) 
{ 
    // Creating an empty set 
    LinkedHashSet<Integer> s = new LinkedHashSet<>(); 
  
  
    // Count frequencies of elements in given row r 
    for (int j = 0; j < n; j++) 
        s.add(mat[r][j]); 
  
    // Traverse through all remaining rows 
    for (int i = 0; i < m; i++) 
    { 
        // we do not need to check for given row r 
        if (i == r) 
            continue; 
  
        // initialize hash i.e; count frequencies 
        // of elements in row i 
        int j; 
        for (j = 0; j < n; j++) 
            if (!s.contains(mat[i][j])) 
                break; 
        if (j != n) 
        continue; 
  
        System.out.print(i+", "); 
    } 
} 
  
// Driver program to run the case 
public static void main(String[] args) 
{ 
    int m = 4, n = 4,r = 3; 
    int mat[][] = {{3, 1, 4, 2}, 
                    {1, 6, 9, 3}, 
                    {1, 2, 3, 4}, 
                    {4, 3, 2, 1}}; 
    permutatedRows(mat, m, n, r); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

