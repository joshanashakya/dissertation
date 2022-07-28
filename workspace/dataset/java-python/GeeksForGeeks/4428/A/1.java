

// Java code to generate numbers 
// with difference between 
// product and sum is D 
import java.io.*; 
  
class GFG { 
      
    // Function to implement calculation 
    static void findNumbers(int n, int d) 
    { 
        for (int i = 0; i < n - 2; i++) 
            System.out.print("1" + " "); 
      
        System.out.print("2" + " "); 
        System.out.println(n + d); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 3, D = 5; 
        findNumbers(N, D); 
    } 
} 
  
/* This code is contributed by Nikita Tiwari.*/

