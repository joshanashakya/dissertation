

// Java program to print first N  
// Leyland Numbers. 
import java.util.*; 
import java.lang.*; 
  
public class GFG{ 
     
    private static final int MAX = 0; 
     
    // Print first n Leyland Number. 
    public static void leyland(int n) 
    { 
        List<Integer> ans = new ArrayList<Integer>(); 
          
      
        // Outer loop for x from 2 to n. 
        for (int x = 2; x <= n; x++) { 
      
            // Inner loop for y from 2 to x. 
            for (int y = 2; y <= x; y++) { 
      
                // Calculating x^y + y^x 
                int temp = (int)Math.pow(x, y) +  
                           (int)Math.pow(y, x); 
      
                ans.add(temp); 
            } 
        } 
      
        // Sorting the all Leyland Number. 
        Collections.sort(ans); 
      
        // Printing first n Leyland number. 
        for (int i = 0; i < n; i++) 
            System.out.print(ans.get(i) + " "); 
    } 
      
    // Driven Program 
    public static void main(String args[]) 
    { 
        int n = 6; 
        leyland(n); 
    } 
} 
  
// This code is contributed by Sachin Bisht 

