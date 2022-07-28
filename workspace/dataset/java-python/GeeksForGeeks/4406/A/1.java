

// Java program to find sum upto 
// N term of the series:  
  
import java.io.*; 
  
class GFG { 
// calculate sum upto N term of series  
static void Sum_upto_nth_Term(int n)  
{ 
    int r = n * (n + 1) *  
                (2 * n + 7) / 3; 
    System.out.println(r); 
} 
  
// Driver code 
    public static void main (String[] args) { 
    int N = 5; 
    Sum_upto_nth_Term(N); 
    } 
} 

