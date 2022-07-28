

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static int MX = 2001; 
static int OFF = 1000; 
  
// Represents a point in 2-D space 
static class point  
{ 
    int x, y; 
  
    public point(int x, int y)  
    { 
        this.x = x; 
        this.y = y; 
    } 
      
}; 
  
// Function to return the count of 
// required points 
static int countPoints(int n, point points[]) 
{ 
    int []minx = new int[MX]; 
    int []miny = new int[MX]; 
  
    // Initialize minimum values to infinity 
    for (int i = 0; i < n; i++) 
    { 
        minx[i]=Integer.MAX_VALUE; 
        miny[i]=Integer.MAX_VALUE; 
    } 
  
    // Initialize maximum values to zero 
    int []maxx = new int[MX]; 
    int []maxy = new int[MX]; 
  
    int x, y; 
    for (int i = 0; i < n; i++) 
    { 
  
        // Add offset to deal with negative  
        // values 
        points[i].x += OFF; 
        points[i].y += OFF; 
        x = points[i].x; 
        y = points[i].y; 
  
        // Update the minimum and maximum 
        // values 
        minx[y] = Math.min(minx[y], x); 
        maxx[y] = Math.max(maxx[y], x); 
        miny[x] = Math.min(miny[x], y); 
        maxy[x] = Math.max(maxy[x], y); 
    } 
  
    int count = 0; 
    for (int i = 0; i < n; i++)  
    { 
        x = points[i].x; 
        y = points[i].y; 
  
        // Check if condition is satisfied  
        // for X coordinate 
        if (x > minx[y] && x < maxx[y]) 
  
            // Check if condition is satisfied 
            // for Y coordinate 
            if (y > miny[x] && y < maxy[x]) 
                count++; 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    point points[] = {new point(0, 0), 
                      new point(0, 1), 
                      new point(1, 0), 
                      new point(0, -1), 
                      new point(-1, 0)}; 
    int n = points.length; 
    System.out.println(countPoints(n, points)); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

