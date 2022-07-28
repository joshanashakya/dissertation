

// Java program to find N-th term of the series: 
// 1, 8, 54, 384... 
  
import java.io.*; 
  
// Main class for main method 
class GFG { 
    public static int fact(int N) 
    { 
        int i, product = 1; 
        // Calculate factorial of N 
        for (i = 1; i <= N; i++) 
            product = product * i; 
        return product; 
    } 
    public static int nthTerm(int N) 
    { 
        // By using above formula 
        return (N * N) * fact(N); 
    } 
  
    public static void main(String[] args) 
    { 
        int N = 4; // 4th term is 384 
  
        System.out.println(nthTerm(N)); 
    } 
} 

