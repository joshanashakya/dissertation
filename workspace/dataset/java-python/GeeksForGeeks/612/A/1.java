

// A space optimized 
// based Java program 
// to print first n  
// Tribinacci numbers. 
import java.io.*; 
  
class GFG { 
      
    static void printTrib(int n) 
    { 
        if (n < 1) 
            return; 
      
        // Initialize first 
        // three numbers 
        int first = 0, second = 0; 
        int third = 1; 
      
        System.out.print(first + " "); 
        if (n > 1) 
            System.out.print(second + " "); 
          
        if (n > 2) 
            System.out.print(second + " "); 
      
        // Loop to add previous 
        // three numbers for 
        // each number starting 
        // from 3 and then assign 
        // first, second, third 
        // to second, third, and curr 
        // to third respectively 
        for (int i = 3; i < n; i++)  
        { 
            int curr = first + second + third; 
            first = second; 
            second = third; 
            third = curr; 
      
            System.out.print(curr +" "); 
        } 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        printTrib(n); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

