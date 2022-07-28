

// Java program to find N-th term of the series: 
// 3, 5, 21, 51, 95,... 
import java.util.*; 
  
class solution 
{ 
static long getNthTerm(long N) 
{ 
// Return Nth term 
    return (7 *(int) Math.pow(N, 2) - 19 * N + 15); 
} 
  
//Driver program 
public static void main(String arr[]) 
{ 
// declaration of number of terms 
    long N = 4; 
  
    // Get the Nth term 
     System.out.println(getNthTerm(N)); 
} 
} 

