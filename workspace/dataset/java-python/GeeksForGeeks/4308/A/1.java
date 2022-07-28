

// Java Implementation to print the pattern 
import java.io.*; 
  
class GFG 
{ 
     // Function definition 
   static void pattern(int n) 
    { 
        int i, j, k = 0; 
        for (i = n - 1; i >= 0; i--)  
        { 
            // outer gap loop 
            for (j = n - 1; j > k; j--)  
            { 
                System.out.print(" "); 
            } 
  
            // 65 is ASCII of 'A' 
            System.out.print((char)(i + 65)); 
  
            // inner gap loop 
            for (j = 1; j < (k * 2); j++) 
                System.out.print(" "); 
  
            if (i < n - 1) 
                System.out.print((char)(i + 65)); 
            System.out.print("\n"); 
            k++; 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
          
        // taking size from the user 
        int n = 5; 
      
        // function calling 
        pattern(n); 
    } 
} 
  
// This code is contributed by Anshika Goyal. 

