

// Java program, to find height h 
// which divide isosceles triangle 
// into ratio n:m 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to return the height 
static float heightCalculate(int H, int n, int m) 
{ 
    // type cast the n, m into float 
    float N = (float)(n * 1.0); 
    float M = (float)(m * 1.0); 
    // calculate the height for cut 
    float h = H *(float) Math.sqrt(N / (N + M)); 
    return h; 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
            int H = 10, n = 3, m = 4; 
    System.out.print( heightCalculate(H, n, m)); 
    } 
} 

