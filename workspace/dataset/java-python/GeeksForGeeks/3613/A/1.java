

// Java implementation of the approach 
  
class GFG 
{ 
  
// Function that return true if 
// the given point lies on the given line 
static boolean pointIsOnLine(int m, int c, 
                        int x, int y) 
{ 
    // If (x, y) satisfies the equation  
    // of the line 
    if (y == ((m * x) + c)) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int m = 3, c = 2; 
    int x = 1, y = 5; 
  
    if (pointIsOnLine(m, c, x, y)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

