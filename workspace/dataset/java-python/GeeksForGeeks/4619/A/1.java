

// Java program to count Fibonacci 
// numbers in given range 
public class GFG 
{      
  
    // Returns count of fibonacci  
    // numbers in [low, high] 
    static int countFibs(int low,  
                         int high) 
    { 
          
        // Initialize first three  
        // Fibonacci Numbers 
        int f1 = 0, f2 = 1, f3 = 1; 
      
        // Count fibonacci numbers  
        // in given range 
        int result = 0; 
      
        while (f1 <= high) 
        { 
            if (f1 >= low) 
            result++; 
            f1 = f2; 
            f2 = f3; 
            f3 = f1 + f2; 
        } 
      
        return result; 
    } 
      
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int low = 10, high = 100; 
        System.out.println("Count of Fibonacci Numbers is "
                           + countFibs(low, high)); 
    } 
} 
      
// This code is contributed by Sam007. 

