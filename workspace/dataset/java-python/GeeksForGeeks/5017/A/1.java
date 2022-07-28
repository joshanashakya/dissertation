

// Java program to find the  
// N-th term of the series: 
// 0, 11, 28, 51, 79, 115, 156, 203..... 
import java.io.*; 
  
class GFG  
{ 
  
// calculate Nth term of series 
static int nthTerm(int n) 
{ 
    return 3 * (int) Math.pow(n, 2) +  
                           2 * n - 5; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int N = 4; 
  
    System.out.println(nthTerm(N)); 
} 
} 
  
// This code is contributed  
// by anuj_67 

