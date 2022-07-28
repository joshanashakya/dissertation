

// Java implementation of the above approach 
class GFG 
{ 
  
    // Function to return the count of 
    // possible steps in a single direction 
    static int steps(int cur, int x, int n)  
    { 
  
        // It can cover infinte steps 
        if (x == 0) 
            return Integer.MAX_VALUE; 
  
        // We are approaching towards X = N 
        if (x > 0) 
            return Math.abs((n - cur) / x); 
  
        // We are approaching towards X = 1 
        else
            return Math.abs((cur - 1) / x); 
    } 
  
    // Function to return the count of steps 
    static int countSteps(int curx, int cury, 
                             int n, int m,  
                             int[][] moves)  
    { 
        int count = 0; 
        int k = moves.length; 
        for (int i = 0; i < k; i++) 
        { 
            int x = moves[i][0]; 
            int y = moves[i][1]; 
  
            // Take the minimum of   
            // both moves independently 
            int stepct = Math.min(steps(curx, x, n),  
                                  steps(cury, y, m)); 
  
            // Update count and current positions 
            count += stepct; 
            curx += stepct * x; 
            cury += stepct * y; 
        } 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 4, m = 5, x = 1, y = 1; 
        int[][] moves = { { 1, 1 }, { 1, 1 }, 
                          { 0, -2 } }; 
  
        System.out.print(countSteps(x, y, n, m, moves)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

