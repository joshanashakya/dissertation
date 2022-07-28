

// Java program to find the minimum 
// number of obstacles required 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the minimum 
// number of obstacles required 
static int solve(int n, int m, int obstacles, 
                double range[]) 
{ 
    // Find the minimum range required 
    // to put obstacles 
    double val = Math.min(n, m); 
  
    // Sorting the radius 
    Arrays.sort(range); 
  
    int c = 1; 
    for (int i = obstacles - 1; i >= 0; i--) 
    { 
        range[i] = 2 * range[i]; 
        val -= range[i]; 
  
        // If val is less than zero 
        // then we have find the number of 
        // obstacles required 
        if (val <= 0) 
        { 
            return c; 
        } 
        else
        { 
            c++; 
        } 
    } 
  
    if (val > 0)  
    { 
        return -1; 
    } 
    return 0; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 4, m = 5, obstacles = 3; 
    double range[] = { 1.0, 1.25, 1.15 }; 
    System.out.print(solve(n, m, obstacles, range)+ "\n"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

