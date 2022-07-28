

// Java program to find the N-th term of the series:  
// 0, 5, 18, 39, 67, 105, 150, 203,  
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
// calculate Nth term of series  
static int nthTerm(int n)  
{  
    return 4 * (int)Math.pow(n, 2) - 7 * n + 3;  
}  
    
// Driver code  
public static void  main(String args[])  
{  
    int N = 4;  
    
    System.out.print(nthTerm(N));  
}  
}  

