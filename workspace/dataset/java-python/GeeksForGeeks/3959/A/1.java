

// Java program to find the 
// nth Heptagonal number 
import java.io.*; 
  
class GFG  
{ 
// Function to return  
// Nth Heptagonal number 
static int heptagonalNumber(int n) 
{ 
    return ((5 * n * n) - (3 * n)) / 2; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 2; 
    System.out.println(heptagonalNumber(n)); 
    n = 15; 
    System.out.println(heptagonalNumber(n)); 
} 
} 
  
// This code is contributed by anuj_67. 

