

// Java program to find Cullen number 
import java.io.*; 
  
class GFG { 
    // function to find n'th cullen number 
    static int findCullen(int n) 
    { 
        return (1 << n) * n + 1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 2; 
        System.out.println(findCullen(n)); 
    } 
} 
  
// This code is contributed by vt_m. 

