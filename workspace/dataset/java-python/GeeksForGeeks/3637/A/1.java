

// Java program to find maximum intersecting 
// points 
  
public class GFG { 
      
    // nC2 = (n)*(n-1)/2; 
    static long countMaxIntersect(long n) 
    { 
       return (n) * (n - 1) / 2; 
    } 
  
      
    // Driver code 
    public static void main(String args[]) 
    { 
        // n is number of line 
        long n = 8; 
        System.out.println(countMaxIntersect(n)); 
  
  
    } 
    // This code is contributed by ANKITRAI1 
} 

