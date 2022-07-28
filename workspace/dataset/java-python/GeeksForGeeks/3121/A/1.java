

//Java  program to find the possible number  
// of triangles that can be formed from  
// set of points on three lines  
  
import java.io.*; 
  
class GFG { 
      
      
// Returns factorial of a number  
static int factorial(int n)  
{  
    int fact = 1;  
    for (int i = 2; i <= n; i++)  
        fact = fact * i;  
    return fact;  
}  
  
// calculate c(n, r)  
static int ncr(int n, int r)  
{  
  
    return factorial(n)  
        / (factorial(r) * factorial(n - r));  
}  
  
// Driver code  
      
    public static void main (String[] args) { 
  
        int m = 3, n = 4, k = 5;  
        int totalTriangles = ncr(m + n + k, 3) -  
           ncr(m, 3) - ncr(n, 3) - ncr(k, 3);  
        System.out.println (totalTriangles);  
          
          
    } 
} 

