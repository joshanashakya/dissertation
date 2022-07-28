

// Java program to find the n-th  
// term in series 1 3 6 10 ...  
import java.io.*; 
  
class Series { 
      
    // Function to find nth term 
    static int term(int n){ 
        return n * (n + 1) / 2; 
    } 
      
    // Driver Code 
    public static void main (String[] args) { 
        int n = 4; 
        System.out.println(term(n)); 
    } 
} 
  
// This code is contributed by Chinmoy Lenka 

