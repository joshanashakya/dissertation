

// Java program to find n-th term of 
// series 1, 3, 6, 10, 15, 21... 
import java.io.*; 
  
class GFG { 
      
    // Function to find the nth term of series 
    static int term(int n) 
    {      
        // Loop to add numbers 
        int ans = 0; 
        for (int i = 1; i <= n; i++)  
            ans += i;  
          
        return ans; 
    } 
  
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println(term(n)); 
    } 
} 
  
  
// This code is contributed by Nikita Tiwari. 

