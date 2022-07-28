

// Java program to find minimum   
//moves to reach target if we can 
// move i steps in i-th move. 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    static int reachTarget(int target) 
    { 
        // Handling negatives by symmetry 
        target = Math.abs(target); 
          
        // Keep moving while sum is smaller 
        // or difference is odd. 
        int sum = 0, step = 0; 
          
        while (sum < target || (sum - target) % 2
                                        != 0) { 
            step++; 
            sum += step; 
        } 
        return step; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
       int target = 5; 
       System.out.println(reachTarget(target)); 
    } 
} 
  
// This code is contributed by Nikita tiwari. 

