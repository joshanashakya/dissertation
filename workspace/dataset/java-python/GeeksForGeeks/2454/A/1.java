

// Java implementation of the approach  
class GFG 
{ 
      
    // Function that returns true if it is  
    // possible to move from (0, 0) to  
    // (x, y) in exactly k moves  
    static boolean isPossible(int x, int y, int k)  
    {  
        // Minimum moves required  
        int minMoves = Math.abs(x) + Math.abs(y);  
      
        // If possible  
        if (k >= minMoves && (k - minMoves) % 2 == 0)  
            return true;  
      
        return false;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int x = 5, y = 8, k = 20;  
      
        if (isPossible(x, y, k))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
    }  
} 
  
// This code is contributed by AnkitRai01 

