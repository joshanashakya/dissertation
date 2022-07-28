

// Java program to find star number 
import java.io.*; 
  
class GFG { 
    // Returns n-th star number 
    static int findStarNum(int n) 
    { 
        return (6 * n * (n - 1) + 1); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 3; 
        System.out.println(findStarNum(n)); 
    } 
} 
  
// This code is contributed 
// by Nikita Tiwari. 

