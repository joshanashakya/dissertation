

// Java program to print the pattern "D" 
import java.util.*; 
  
class GFG { 
  
    // Function to generate the pattern D 
    static void D_Pattern(int n){ 
          
        // loop for rows 
        for (int i = 0; i < n; i++){ 
              
            // loop for columns 
            for (int j = 0; j <= n; j++){ 
                  
                // Logic to generate stars 
                // for * 
                if (j == 1 || ((i == 0 || 
                             i == n-1) && 
                   (j > 1 && j < n-2)) || 
                   (j == n-2 && i != 0 &&  
                               i != n-1)) 
                    System.out.print("*");  
                      
                // For the spaces 
                else
                    System.out.print(" ");  
            } 
              
        // For changing line 
        System.out.println(); 
        } 
    } 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 9; 
  
        // Function calling 
        D_Pattern(n); 
    } 
} 
  
// This code is contributed by ChitraNayal. 

