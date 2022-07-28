

// Java program to find the N-th term of the series: 
// 7, 21, 49, 91, 146, 217, 301, 399, ... 
  
// calculate Nth term of series 
import java.util.*; 
  
class solution 
{ 
  
//Function to find the nth term of the series 
static int nthTerm(int n) 
{ 
    return 7 * (int)Math.pow(n, 2) - 7 * n + 7; 
} 
  
// Driver code 
public static void main(String arr[]) 
{ 
    int N = 4; 
  
    System.out.println(nthTerm(N)); 
  
} 
  
} 

