

// Java implementation of the approach  
import java.lang.Math; 
  
public class GfG{ 
  
    // Function to return the count of steps  
    static int countSteps(int n)  
    {  
        // Variable to store the count of steps  
        int steps = 0;  
      
        // Iterate while N > 0  
        while (n > 0) {  
      
            // Get the largest perfect square  
            // and subtract it from N  
            int largest = (int)Math.sqrt(n);  
            n -= (largest * largest);  
      
            // Increment steps  
            steps++;  
        }  
      
        // Return the required count  
        return steps;  
    } 
  
     public static void main(String []args){ 
          
        int n = 85;  
        System.out.println(countSteps(n)); 
     } 
} 
  
// This code is contributed by Rituraj Jain 

