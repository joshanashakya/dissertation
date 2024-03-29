

// Java program to find solution 
// of ax + by = n 
import java.io.*; 
  
class GfG { 
          
    // function to find the solution 
    static void solution(int a, int b, int n) 
    { 
        // traverse for all possible values 
        for (int i = 0; i * a <= n; i++) 
        { 
      
            // check if it is satisfying the equation 
            if ((n - (i * a)) % b == 0) 
            { 
                System.out.println("x = " + i +  
                                   ", y = " +  
                                   (n - (i * a)) / b); 
                  
                return ; 
            } 
        } 
      
        System.out.println("No solution"); 
    } 
      
      
    public static void main (String[] args)  
    { 
        int a = 2, b = 3, n = 7; 
        solution(a, b, n); 
      
    } 
} 
  
// This code is contributed by Gitanjali. 

