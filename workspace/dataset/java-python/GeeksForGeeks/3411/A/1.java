

// Java program to find N-th  
// term of the series: 
// 1, 4, 15, 72, 420 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
      
// Function to find factorial of N 
static int factorial(int N) 
{ 
    // base condition 
    if( N == 0 || N == 1 ) 
        return 1;  
    // use recursion  
    return N * factorial( N - 1 ); 
} 
  
// calculate Nth term of series 
static int nthTerm(int N) 
{ 
    return (factorial(N) * (N + 2) / 2); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int N = 6; 
      
    System.out.println(nthTerm(N)); 
} 
} 

