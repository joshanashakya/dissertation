

// Java program to partition N into M parts 
// such that difference Max and Min 
// part is smallest 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to partition N into M parts such 
// that difference Max and Min part 
// is smallest 
static void printPartition(int n, int m) 
{ 
    int k = n / m; // Minimum value 
  
    int ct = n % m; // Number of (K+1) terms 
  
    int i; 
  
    for (i = 1; i <= ct; i++) 
        System.out.print( k + 1 + " "); 
  
    for (; i <= m; i++) 
        System.out.print( k + " "); 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
    int n = 5, m = 2; 
  
    printPartition(n, m); 
    } 
} 
// This code is contributed by anuj_67.. 

