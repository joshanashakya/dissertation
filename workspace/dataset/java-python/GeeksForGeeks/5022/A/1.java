

// Java program to find N-th term of the series: 
// 3, 20, 63, 144, 230 ..... 
import java.util.*; 
  
class solution 
{ 
  
// calculate Nth term of series 
static int nthTerm(int n) 
{ 
    //return final sum 
    return 2 *(int)Math.pow(n, 3) + (int)Math.pow(n, 2); 
} 
  
// Driver code 
public static void main(String arr[]) 
{ 
    int N = 3; 
  
System.out.println(nthTerm(N)); 
  
} 
  
} 
//This code is contributed by Surendra_Gangwar 

