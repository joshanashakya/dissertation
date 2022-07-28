

// Java program to find the sum of 
// the series 1+11+111+1111+.... 
import java.io.*; 
  
class GFG  
{ 
  
    // Function for finding summation 
    static int summation(int n) 
    { 
        int sum = 0, j = 1; 
        for (int i = 1; i <= n; i++)  
        { 
            sum = sum + j; 
            j = (j * 10) + 1; 
        } 
  
        return sum; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 5; 
        System.out.println(summation(n)); 
    } 
} 
  
// This code is contributed 
// by Nikita Tiwari 

