

// Java implementation of the approach 
class GFG 
{ 
      
static int R = 5; 
static int C = 5; 
  
// Function to return the maximum sum 
// of a cocktail glass 
static int findMaxCock(int ar[][]) 
{ 
  
    // If no cocktail glass is possible 
    if (R < 3 || C < 3) 
        return -1; 
  
    // Initialize max_sum with the mini 
    int max_sum = Integer.MIN_VALUE; 
  
    // Here loop runs (R-2)*(C-2) times considering 
    // different top left cells of cocktail glasses 
    for (int i = 0; i < R - 2; i++)  
    { 
        for (int j = 0; j < C - 2; j++)  
        { 
  
            // Considering mat[i][j] as the top left 
            // cell of the cocktail glass 
            int sum = (ar[i][j] + ar[i][j + 2]) 
                    + (ar[i + 1][j + 1]) 
                    + (ar[i + 2][j] + ar[i + 2][j + 1] 
                        + ar[i + 2][j + 2]); 
  
            // Update the max_sum 
            max_sum = Math.max(max_sum, sum); 
        } 
    } 
    return max_sum; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
  
    int ar[][] = { { 0, 3, 0, 6, 0 }, 
                    { 0, 1, 1, 0, 0 }, 
                    { 1, 1, 1, 0, 0 }, 
                    { 0, 0, 2, 0, 1 }, 
                    { 0, 2, 0, 1, 3 } }; 
  
    System.out.println(findMaxCock(ar)); 
} 
} 
  
// This code is contributed by mits 

