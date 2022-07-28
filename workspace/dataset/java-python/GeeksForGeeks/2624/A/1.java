

// Java implementation of the approach 
import java.io.*;  
  
class GFG  
{  
      
    // Function to find the nth term of series  
    static int findNthTerm(int x, int y, int n)  
    {      
        int[] f = new int[6]; 
          
        f[0] = x; 
        f[1] = y; 
          
        // Loop to add numbers  
        for (int i = 2; i <= 5; i++)  
            f[i] = f[i - 1] - f[i - 2];  
          
        return f[n % 6];  
    }  
  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int x = 2, y = 3, n = 3;  
        System.out.println(findNthTerm(x, y, n));  
    }  
}  
  
// This code is contributed by mohit kumar 29 

