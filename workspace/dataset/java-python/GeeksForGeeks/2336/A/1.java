

// Simple Java method to find sum of  
// square of first n even numbers. 
import java.io.*; 
  
class GFG  
{ 
    static int squareSum(int n) 
    { 
        int sum = 0; 
        for (int i = 1; i <= n; i++) 
            sum += (2 * i) * (2 * i); 
        return sum; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
                  throws IOException 
    { 
        System.out.println(squareSum(8)); 
    } 
} 
  
// This code is contributed by Nikita Tiwari  

