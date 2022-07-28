

// Java program print first M  
// terms of N-bonacci series. 
import java.io.*; 
  
class GFG 
{ 
    // Function to print 
    // bonacci series 
    static void bonacciseries(int n,  
                              int m) 
    { 
        // Assuming m >= n. 
        int []a = new int[m]; 
        a[n - 1] = 1; 
       
        // Computing every term as  
        // sum of previous n terms. 
        for (int i = n; i < m; i++) 
            for (int j = i - n; j < i; j++) 
                a[i] += a[j]; 
       
        for (int i = 0; i < m; i++) 
            System.out.print(a[i] + " "); 
    } 
       
    // Driver Code 
    public static void main(String args[]) 
    { 
        int N = 5, M = 15; 
        bonacciseries(N, M); 
    } 
} 
   
// This code is contributed by  
// Manish Shaw(manishshaw1) 

