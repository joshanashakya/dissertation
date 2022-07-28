

// Java program to find N-th term of the series: 
// 3, 12, 29, 54, 87, ... 
  
import java.util.*; 
class solution 
{ 
  
static long getNthTerm(long N) 
{ 
    // Return Nth term 
    return 4 *(long)Math.pow(N, 2) - 3 * N + 2; 
} 
  
//Driver code 
public static void main(String arr[]) 
{ 
// declaration of number of terms 
    long N = 10; 
  
    // Get the Nth term 
    System.out.println(getNthTerm(N)); 
  
} 
} 

