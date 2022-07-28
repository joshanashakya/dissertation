

// Java program to find N-th term of the series: 
// 0, 5, 14, 27, 44 ... 
import java.util.*; 
  
class solution 
{ 
  
// Calculate Nth term of series 
static int nthTerm(int n) 
{ 
    return 2 *(int)Math.pow(n, 2) - n - 1; 
} 
  
// Driver code 
public static void main(String arr[]) 
{ 
    int N = 4; 
  
    System.out.println(nthTerm(N)); 
} 
} 
//This code is contributed by Surendra_Gangwar 

