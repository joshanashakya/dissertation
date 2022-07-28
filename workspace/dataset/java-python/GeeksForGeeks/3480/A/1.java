

// Java program implementation of 
// Max sum problem in a triangle 
  
class GFG 
{ 
    static int N = 3; 
  
    // Function for finding maximum sum 
    static int maxPathSum(int tri[][]) 
    { 
        int ans = 0; 
      
        // Loop for bottom-up calculation 
        for (int i = N - 2; i >= 0; i--)  
        { 
            for (int j = 0; j < N - i; j++)  
            { 
      
                // For each element, check both 
                // elements just below the number 
                // and below left to the number 
                // add the maximum of them to it 
                if (j - 1 >= 0) 
                    tri[i][j] += Math.max(tri[i + 1][j], 
                                    tri[i + 1][j - 1]); 
                else
                    tri[i][j] += tri[i + 1][j]; 
      
                ans = Math.max(ans, tri[i][j]); 
            } 
        } 
      
        // Return the maximum sum 
        return ans; 
    } 
      
    // Driver Code 
    public static void main(String []args) 
    { 
        int tri[][] = { { 1, 5, 3 }, 
                        { 4, 8, 0 }, 
                        { 1, 0, 0 } }; 
      
        System.out.println(maxPathSum(tri)); 
    } 
} 
  
// This code is contributed by ihritik 

