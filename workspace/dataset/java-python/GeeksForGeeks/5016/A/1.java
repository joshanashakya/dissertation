

// Java program to find the N-th term of the series: 
// 4, 14, 28, 46, 68, 94, 124, 158, ..... 
import java.util.*; 
  
class solution 
{ 
   
// calculate Nth term of series 
static int nthTerm(int n) 
{ 
  
    return 2 *(int)Math.pow(n, 2) + 4 * n - 2; 
  
}  
  
//Driver code 
public static void main(String arr[]) 
{ 
    int N = 4; 
  
   System.out.println(nthTerm(N)); 
} 
} 
  
//This code is contributed by Surendra_Gangwar 

