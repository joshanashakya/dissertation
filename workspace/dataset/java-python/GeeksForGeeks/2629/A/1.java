

// Java program to find the n-th 
// term in series 
import java.io.*; 
  
class Series { 
  
    // Function to find nth term 
    static int sumOfSeries(int n) 
    { 
        return n * (n + 1) * (6 * n * n * n  
                    + 9 * n * n + n - 1) / 30; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 4; 
        System.out.println(sumOfSeries(n)); 
    } 
} 

