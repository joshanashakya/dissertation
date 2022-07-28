

// Java program to find the N-th term of the series:  
// 5, 10, 17, 26, 37, 50, 65, 82, ...  
import java.util.*;  
  
class solution  
{  
  
// calculate Nth term of series  
static int nthTerm(int n)  
{  
      
    //return the total sum  
    return (int)Math.pow(n, 2) - 2 * n + 2;  
}  
  
//Driver function  
public static void main(String arr[])  
{  
    int N = 4;  
  
    System.out.println(nthTerm(N));  
  
}  
  
}  

