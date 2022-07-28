

// Java code to check for pair with given 
// difference exists in the matrix or not 
import java.util.*; 
  
class GFG  
{ 
  
static final int N = 4; 
static final int M = 4; 
  
// Function to check if a pair with given 
// difference exists in the matrix 
static boolean isPairWithDiff(int mat[][], int k) 
{ 
    // Store elements in a hash 
    HashSet<Integer> s = new HashSet<Integer>(); 
    for (int i = 0; i < N; i++)  
        for (int j = 0; j < M; j++)  
            s.add(mat[i][j]);      
      
    // looping through elements 
    // if present in the matrix 
    // return true 
    for (int i = 0; i < N; i++)  
        for (int j = 0; j < M; j++)  
                if (s.contains(k + mat[i][j]) &&  
                                k + mat[i][j]!=  
                                (int)s.toArray()[ s.size()-1 ]) 
                return true;      
              
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // Input matrix 
    int mat[][] = { { 5, 2, 3, 4 }, 
                    { 5, 6, 7, 8 }, 
                    { 9, 10, 11, 12 }, 
                    { 13, 14, 15, 100 } }; 
  
    // given difference 
    int k = 85; 
  
    System.out.println(isPairWithDiff(mat, k) == true ? "YES" : "NO");  
} 
} 
  
// This code contributed by Rajput-Ji 

