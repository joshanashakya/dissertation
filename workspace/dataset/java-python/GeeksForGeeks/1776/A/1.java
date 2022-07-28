

// Java  program to find 
// the N-th term of the series: 
// 5, 12, 21, 32, 45...... 
import java.io.*; 
  
class GFG { 
      
  
  
// calculate Nth term of series 
static int nthTerm(int n) 
{ 
    return (int)Math.pow(n, 2) + 4 * n; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
      
    // Get N 
    int N = 4; 
  
    // Get the Nth term 
    System.out.println( nthTerm(N)); 
  
    } 
} 
// This code is contributed 
// by  inder_verma 

