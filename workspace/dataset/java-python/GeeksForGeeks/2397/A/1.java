

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
static int N = 2; 
static int M = 2; 
  
// Function to generate and 
// print the required matrix 
static void Matrix(char a[][]) 
{ 
    char ch = '1'; 
  
    for (int i = 0; i < N; i++)  
    { 
        for (int j = 0; j < M; j++)  
        { 
  
            // Replace the '.' 
            if (a[i][j] == '.') 
                a[i][j] = ch; 
  
            // Toggle number 
            ch = (ch == '1') ? '0' : '1'; 
  
            System.out.print( a[i][j] + " "); 
        } 
        System.out.println(); 
  
        // For each row, change 
        // the starting number 
        if (i % 2 == 0) 
            ch = '0'; 
        else
            ch = '1'; 
    } 
} 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        char a[][] = { { '.', '_' }, 
                    { '_', '.' } }; 
  
        Matrix(a); 
    } 
} 
  
// This code is contributed by anuj_67.. 

