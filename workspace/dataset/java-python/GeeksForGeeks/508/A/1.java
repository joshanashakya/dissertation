

// Java Program to print the series  
// 2, 1, 4, 3, 6, 5, …. up to N terms  
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
// Function to print the series  
static void printPattern(int N)  
{  
    
    for (int i = 1; i <= N; i++) {  
    
        // Find and print the ith term  
        System.out.print(" "+((i % 2 == 0) ? (i - 1) : (i + 1)));  
    }  
}  
    
// Driver code  
public static void main(String args[])  
{  
    
    // Get the value of N  
    int N = 10;  
    
    // Print the Series  
    printPattern(N);  
    
} 
}  

