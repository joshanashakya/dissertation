

// Java program to calculate 1^2+2^2+3^2+  
// ... average of square number 
import java.io.*; 
  
public class GFG{ 
      
// Function to calculate average  
// of square number 
static float AvgofSquareN(int n) 
{ 
    float sum = 0; 
    for (int i = 1; i <= n; i++) 
        sum += (i * i); 
    return sum / n; 
}  
  
// Driver code 
static public void main (String[] args) 
{ 
    int n = 2; 
    System.out.println(AvgofSquareN(n)); 
  
} 
} 
  
// This code is contributed by vt_m.  

