

// Java program to find number of ways 
// in which n boys and n girls can sit  
// alternatively sound a round table. 
import java .io.*; 
  
class GFG 
{ 
public static void main(String[] args) 
{ 
  
    // Get n 
    long n = 5; 
  
    // find fac1 = (n-1)! 
    long fac1 = 1; 
    for (int i = 2; i <= n - 1; i++) 
        fac1 = fac1 * i; 
  
    // Find fac2 = n! 
    long fac2 = fac1 * n; 
  
    // Find total number of ways 
    long totalWays = fac1 * fac2; 
  
    // Print the total number of ways 
    System.out.println(totalWays); 
} 
} 
  
// This code is contributed 
// by anuj_67.. 

