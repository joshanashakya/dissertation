

// Java program to find the N-th term of the series: 
// 0, 7, 18, 33, 51, 75, 102, ..... 
  
import java.io.*; 
  
class GFG { 
   
  
// calculate Nth term of series 
static int nthTerm(int n) 
{ 
    return 2 * (int)Math.pow(n, 2) + n - 3; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int N = 4; 
  
    System.out.println( nthTerm(N)); 
    } 
} 
// This code is contributed  
// by anuj_67.. 

