

// Java program to find the N-th term of the series: 
// 0, 10, 30, 60, 99, 150, 210, ..... 
import java.util.*; 
  
class solution 
{ 
  
// calculate Nth term of series 
static int nthTerm(int n) 
{ 
    return 5 * (int)Math.pow(n, 2) - 5 * n; 
} 
  
//Driver code 
public static void main(String arr[]) 
{ 
   
     int N = 4; 
     System.out.println(nthTerm(N) ); 
  
} 
} 
  
//This code is contributed by Surendra_Gangwar 

