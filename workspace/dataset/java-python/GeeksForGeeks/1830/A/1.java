

// Java program to find N-th 
// term of the series: 
// 1, 3, 12, 60, 360 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG { 
  
    // Function to find factorial of N 
    static int factorial(int N) 
    { 
        int fact = 1; 
  
        for (int i = 1; i <= N; i++) 
            fact = fact * i; 
  
        // return factorial of N 
        return fact; 
    } 
  
    // calculate Nth term of series 
    static int nthTerm(int N) 
    { 
        return (factorial(N + 1) / 2); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
  
        // Taking  n as 6 
        int N = 6; 
  
        // Printing the nth term 
        System.out.println(nthTerm(N)); 
    } 
} 

