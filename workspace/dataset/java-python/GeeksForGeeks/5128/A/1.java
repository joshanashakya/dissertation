

//Java program to print triangular number series till n 
import java.util.*; 
  
class GFG { 
      
    // Function to find triangular number 
    static void triangular_series(int n) 
    { 
        for (int i = 1; i <= n; i++)  
            System.out.printf("%d ";, i*(i+1)/2); 
    } 
      
    // Driver function  
    public static void main(String[] args)  
    { 
            int n = 5; 
            triangular_series(n); 
    } 
} 
          
//This code is contributed by Arnav Kr. Mandal. 

