

// Java Program to find sum of product of 
// consecutive Binomial Coefficient. 
  
import java.io.*; 
  
class GFG { 
     
static int  MAX = 100; 
  
// Find the binomial coefficient upto nth term 
static void binomialCoeff(int C[], int n) 
{ 
    C[0] = 1; // nC0 is 1 
  
    for (int i = 1; i <= n; i++) { 
  
        // Compute next row of pascal triangle using 
        // the previous row 
        for (int j = Math.min(i, n); j > 0; j--) 
            C[j] = C[j] + C[j - 1]; 
    } 
} 
  
// Return the sum of the product of 
// consecutive binomial coefficient. 
static int sumOfproduct(int n) 
{ 
    int sum = 0; 
    int C[] = new int[MAX]; 
  
    binomialCoeff(C, n); 
  
    // finding the sum of product of  
    // consecutive coefficient. 
    for (int i = 0; i <= n; i++)  
        sum += C[i] * C[i + 1];  
  
    return sum; 
} 
  
// Driven Program 
  
    public static void main (String[] args) { 
    int n = 3; 
    System.out.println( sumOfproduct(n)); 
    } 
} 
   
// This code is contributed by inder_verma.. 

