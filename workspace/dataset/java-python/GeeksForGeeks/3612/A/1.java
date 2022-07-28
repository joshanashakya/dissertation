

// Java program to find if line passing through 
// two coordinates also passes through origin  
// or not  
import java.io.*; 
  
class GFG { 
      
    static boolean checkOrigin(int x1, int y1,  
                                       int x2, int y2) 
    { 
        return (x1 * (y2 - y1) == y1 * (x2 - x1)); 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        if (checkOrigin(1, 28, 2, 56) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Ajit. 

