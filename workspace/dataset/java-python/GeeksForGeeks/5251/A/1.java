

// Java program for the above approach 
class GFG  
{ 
      
static int N = 3; 
  
// Function to return the maximum trace possible 
// for a sub-matrix of the given matrix 
static int MaxTraceSub(int mat[][]) 
{ 
    int max_trace = 0; 
    for (int i = 0; i < N; i++)  
    { 
        for (int j = 0; j < N; j++)  
        { 
            int r = i, s = j, trace = 0; 
  
            // Calculate the trace for each of 
            // the sub-matrix with top left corner 
            // at cell (r, s) 
            while (r < N && s < N)  
            { 
                trace += mat[r][s]; 
                r++; 
                s++; 
  
                // Update the maximum trace 
                max_trace = Math.max(trace, max_trace); 
            } 
        } 
    } 
  
    // Return the maximum trace 
    return max_trace; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
        int mat[][] = { { 10, 2, 5 }, 
                    { 6, 10, 4 }, 
                    { 2, 7, -10 } }; 
    System.out.println(MaxTraceSub(mat)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

