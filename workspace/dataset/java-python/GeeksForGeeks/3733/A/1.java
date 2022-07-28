

// Java program to find maximum umber of  
// intersections of n circles 
import java.io.*; 
  
public class GFG { 
  
    // for the calculation of 2*(nC2) 
    static int intersection(int n) 
    { 
       return n * (n - 1); 
    } 
  
    public static void main(String[] args) throws IOException 
    { 
        System.out.println(intersection(3)); 
    } 
} 
// This code is contributed by  
// Manish Kumar Rai 

