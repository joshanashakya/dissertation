

// Java implementation of the approach 
import java.io.*;  
import java.math.*;  
public class GFG  
{  
    // Function to return the required number 
    int getMinNum(int a, int b, int c) 
    { 
  
        // If doesn't belong to the range 
        // then c is the required number 
        if (c < a || c > b) 
        { 
            return c; 
        } 
  
        // Else get the next multiple of c 
        // starting from b + 1 
        int x = ((b / c) * c) + c; 
  
        return x; 
    } 
  
// Driver code 
public static void main(String args[]) 
{  
    int a = 2; 
    int b = 4; 
    int c = 4; 
    GFG g = new GFG(); 
    System.out.println(g.getMinNum(a, b, c));  
}  
} 
  
// This code is contributed by Shivi_Aggarwal 

