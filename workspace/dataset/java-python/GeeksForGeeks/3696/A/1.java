

// Java implementation of the approach 
import java .io.*; 
  
class GFG 
{ 
      
// Function to find the original coordinated 
static void solve(int d1, int d2, int d3) 
{ 
  
    // Maximum of the given distances 
    int maxx = Math.max(d1, Math.max(d2, d3)); 
  
    // Sum of the given distances 
    int sum = (d1 + d2 + d3); 
  
    // Conditions when the 
    // solution doesn't exist 
    if (2 * maxx > sum || sum % 2 == 1)  
    { 
        System.out.print("-1"); 
        return; 
    } 
  
    // First coordinate 
    int x1 = 0, y1 = 0; 
  
    // Second coordinate 
    int x2 = d1, y2 = 0; 
  
    // Third coordinate 
    int x3 = (d1 + d2 - d3) / 2; 
    int y3 = (d2 + d3 - d1) / 2; 
    System.out.print("("+x1+", "+y1+"), ("+x2+", "+y2+") and ("+x3+", "+y3+")"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int d1 = 3, d2 = 4, d3 = 5; 
    solve(d1, d2, d3); 
  
} 
} 
  
// This code is contributed by anuj_67.. 

