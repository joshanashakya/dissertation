

// Java implementation of the approach 
class GFG { 
  
    // Function to return the number 
    // of squares inside an n*n grid 
    static int cntSquares(int n) 
    { 
        int squares = 0; 
        for (int i = 1; i <= n; i++) { 
            squares += Math.pow(i, 2); 
        } 
        return squares; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
  
        System.out.print(cntSquares(4)); 
    } 
} 

