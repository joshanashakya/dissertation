

// Java program to find n-th value 
import java.io.*; 
  
class GFG { 
      
    // Function to find nth term 
    static int findValueAtX(int n) 
    { 
        return (n * n * n) + n; 
    } 
  
    // driver code 
    public static void main(String[] args) 
    { 
        System.out.println(findValueAtX(10)); 
        System.out.println(findValueAtX(2)); 
    } 
} 
  
// This code is contributed by vt_m. 

