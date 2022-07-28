

// Java program to find number of shortest paths 
class GFG 
{ 
  
// Function to find number of shortest paths 
static void NumberOfShortestPaths(int n, int m) 
{ 
    int [][]a = new int[n][m]; 
  
    // Compute the grid starting from 
    // the bottom-left corner 
    for (int i = n - 1; i >= 0; i--)  
    { 
        for (int j = 0; j < m; j++)  
        { 
            if (j == 0 || i == n - 1) 
                a[i][j] = 1; 
            else
                a[i][j] = a[i][j - 1] + a[i + 1][j]; 
        } 
    } 
  
    // Print the grid 
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < m; j++)  
        { 
            System.out.print(a[i][j] + " "); 
        } 
        System.out.println(); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5, m = 2; 
  
    // Function call 
    NumberOfShortestPaths(n, m); 
} 
} 
  
// This code is contributed by Princi Singh 

