

// Program to find n-th element in the 
// series 9, 33, 73, 128.. 
import java.io.*; 
  
class GFG{ 
      
    // Returns n-th  element of the series 
    static int series(int n) 
    { 
        return (8 * n * n) + 1; 
    } 
      
    // driver program to test the above 
    // function 
    public static void main(String args[]) 
    { 
        int n = 5; 
        System.out.println(series(n)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

