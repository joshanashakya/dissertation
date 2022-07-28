

// Java program to find N-th term of the series 
// 0, 6, 0, 12, 0, 90... 
  
import java.io.*; 
import java.lang.*; 
  
class GFG { 
    // Function to calculate Nth term of  
    // the series 
    public static int nthTerm(int N) 
    { 
        // By using above formula 
        return Math.abs(N * ((N - 1) * (N - 3) * (N - 5))); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 6; // Nth term is 6 
         
        System.out.println(nthTerm(N)); 
    } 
} 

