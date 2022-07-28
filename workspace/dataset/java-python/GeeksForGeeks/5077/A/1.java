

// Java program to find number of horizontal 
// (or vertical line segments needed to 
// connect three points. 
import java.io.*; 
  
class GFG { 
      
// Function to check if the third 
// point forms a rectangle with  
// other two points at corners 
static boolean isBetween(int a, int b, int c)  
{ 
    return (Math.min(a, b) <= c && 
                    c <= Math.max(a, b)); 
} 
  
// Returns true if point k can be  
// used as a joining point to connect 
// using two line segments 
static boolean canJoin(int x[], int y[], 
                        int i, int j, int k)  
{ 
    // Check for the valid polyline  
    // with two segments 
    return (x[k] == x[i] || x[k] == x[j]) &&  
                isBetween(y[i], y[j], y[k]) || 
                (y[k] == y[i] || y[k] == y[j]) &&  
                isBetween(x[i], x[j], x[k]); 
} 
  
static int countLineSegments(int x[], int y[]) 
{ 
    // Check whether the X-coordinates or  
    // Y-cocordinates are same.  
    if ((x[0] == x[1] && x[1] == x[2]) || 
        (y[0] == y[1] && y[1] == y[2])) 
        return 1; 
  
    // Iterate over all pairs to check for two 
    // line segments 
    else if (canJoin(x, y, 0, 1, 2) || 
            canJoin(x, y, 0, 2, 1) ||  
            canJoin(x, y, 1, 2, 0)) 
        return 2; 
  
    // Otherwise answer is three. 
    else
        return 3; 
} 
  
// Driver code 
public static void main (String[] args) { 
  
    int x[]=new int[3], y[]=new int[3]; 
      
    x[0] = -1; y[0] = -1; 
    x[1] = -1; y[1] = 3; 
    x[2] = 4; y[2] = 3; 
      
    System.out.println(countLineSegments(x, y)); 
    } 
      
      
} 
  
// This code is contributed by vt_m 

