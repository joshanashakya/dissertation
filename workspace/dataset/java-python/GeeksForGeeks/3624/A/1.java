

// Java program to find probability that  
// a rope of length L when broken into  
// n parts form a polygon.  
  
public class GFG { 
      
 static double printProbability(int L, int n)  
    {  
       int p = (1 << (n-1));  
       return 1.0 - ((double)n) / ((double)p);  
    }  
  
    // Driver code 
    public static void main(String args[]) 
    { 
         int n = 3, L = 5;  
         System.out.println(printProbability(L, n)); 
             
    } 
    // This Code is contributed by ANKITRAI1 
} 

