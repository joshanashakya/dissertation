

// Efficient Java method to find sum  
// of square of first n even numbers. 
import java.io.*; 
  
class GFG  
{ 
    static int squareSum(int n) 
    { 
        return 2 * n * (n + 1) *  
                (2 * n + 1) / 3; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
                    throws IOException 
    { 
        System.out.println(squareSum(8)); 
    } 
} 
  
// This code is contributed by Nikita Tiwari  

