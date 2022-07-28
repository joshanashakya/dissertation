

// Recursive Java program 
// to find minimum jumps 
// to reach last building  
// from first. 
class GFG { 
      
    static boolean isSafe(int x, int y) 
    { 
        return (x < 4 && y < 3); 
    } 
      
    // Returns minimum jump 
    // path from (0, 0) to  
    // (m, n) in hight[R][C] 
    static int minJump(int height[][], int x, 
                                       int y) 
    { 
        // base case 
        if (x == 4 - 1 && y == 3 - 1) 
            return 0; 
      
        // Find minimum jumps  
        // if we go through  
        // diagonal 
        int diag = Integer.MAX_VALUE; 
          
        if (isSafe(x + 1, y + 1)) 
            diag = minJump(height, x + 1, y + 1) + 
                   Math.abs(height[x][y] - height[x + 1][y + 1]); 
      
        // Find minimum jumps 
        // if we go through 
        // down 
        int down = Integer.MAX_VALUE; 
          
        if (isSafe(x + 1, y)) 
            down = minJump(height, x + 1, y) + 
                   Math.abs(height[x][y] - height[x + 1][y]); 
      
        // Find minimum jumps 
        // if we go through right 
        int right = Integer.MAX_VALUE; 
          
        if (isSafe(x, y + 1)) 
            right = minJump(height, x, y + 1) + 
                    Math.abs(height[x][y] - height[x][y + 1]); 
      
        // return minimum jumps 
        return Math.min(down, Math.min(right, diag)); 
    } 
      
    // Driver program  
    public static void main(String[] args) 
    { 
        int height[][] = { { 5, 4, 2 }, 
                           { 9, 2, 1 }, 
                           { 2, 5, 9 }, 
                           { 1, 3, 11} }; 
      
        System.out.println(minJump(height, 0, 0)); 
    } 
} 
  
// This article is contributed by Prerna Saini. 

