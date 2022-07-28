

// Java program to find the N-th term of the series: 
// 2, 12, 28, 50, 77, 112, 152, 198, ..... 
import java.util.*; 
  
class solution 
{ 
  
// calculate Nth term of series 
static int nthTerm(int n) 
{ 
return 3 *(int)Math.pow(n, 2) + n - 2;  
} 
  
//Driver program 
public static void main(String arr[]) 
{ 
      
    int N = 4; 
    System.out.println(nthTerm(N)); 
} 
  
} 
//This code is contributed by Surendra_Gangwar 

