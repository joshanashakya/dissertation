

// java program to find sum of the series. 
import java.io.*; 
  
class GFG { 
      
    static int factorial(int n) 
    { 
        int res = 1; 
        for (int i = 2; i <= n; i++) 
            res = res * i; 
        return res; 
    } 
      
    // Function to calculate required series 
    static int calculateSeries(int n) 
    { 
        return 2 + (n * n + n - 2)  
                      * factorial(n + 1); 
    } 
      
    // Drivers code 
    public static void main (String[] args)  
    { 
        int n = 3; 
        System.out.println(calculateSeries(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

