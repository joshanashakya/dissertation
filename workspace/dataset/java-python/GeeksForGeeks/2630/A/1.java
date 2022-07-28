

// Java program to find nth term of the series 5 2 13 41 
  
import java.lang.Math; 
class GFG 
{ 
// function to calculate nth term of the series 
static long  nthTermOfTheSeries(int n) 
{ 
    // to store the nth term of series 
    long nthTerm; 
  
    // if n is even number 
    if (n % 2 == 0) 
        nthTerm = (long)Math.pow(n - 1, 2) + n; 
  
    // if n is odd number 
    else
        nthTerm = (long)Math.pow(n + 1, 2) + n; 
  
    // return nth term 
    return nthTerm; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n; 
  
    n = 8; 
  
    System.out.println( nthTermOfTheSeries(n)); 
  
    n = 12; 
    System.out.println( nthTermOfTheSeries(n)); 
  
    n = 102; 
    System.out.println( nthTermOfTheSeries(n)); 
  
    n = 999; 
    System.out.println( nthTermOfTheSeries(n)); 
      
    n = 9999; 
    System.out.println( nthTermOfTheSeries(n)); 
//This code is contributed by  29AjayKumar 
  
} 
} 

