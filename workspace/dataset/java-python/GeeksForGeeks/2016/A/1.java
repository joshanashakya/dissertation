

// Java program to find sum of first n terms 
  
import java.io.*; 
  
class GFG { 
  
// Function to calculate the sum 
 static int calculateSum(int n) 
{ 
  
    return 2 * (n * (n + 1) * (2 * n + 1) / 6)  
            + n * (n + 1) / 2 + 2 * (n); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        // number of terms to be included in sum 
    int n = 3; 
  
    // find the Sn 
    System.out.print( "Sum = " + calculateSum(n)); 
    } 
} 
// This code is contributed  
// by  anuj_67.. 

