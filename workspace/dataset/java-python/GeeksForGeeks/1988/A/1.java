

// Java implementation of the approach 
class GFG  
{ 
  
    // Function to return the minimum value of Z 
    static int findMinimumZ(int n, int a, int b)  
    { 
  
        // Change elements such that a < b 
        if (a > b) 
        { 
            swap(a, b); 
        } 
  
        // Distance from (a to b) 
        int distClock = b - a; 
  
        // Distance from (1 to a) + (b to n) 
        int distAntiClock = (a - 1) + (n - b + 1); 
  
        // Minimum distance between a and b 
        int minDist = Math.min(distClock, distAntiClock); 
  
        // If both the positions are 
        // adjacent on the circle 
        if (minDist == 1)  
        { 
            return 3; 
        } 
  
        // Return the minimum Z possible 
        return minDist; 
    } 
  
    private static void swap(int x, int y) 
    { 
        int temp = x; 
        x = y; 
        y = temp; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 4, a = 1, b = 2; 
        System.out.println(findMinimumZ(n, a, b)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

