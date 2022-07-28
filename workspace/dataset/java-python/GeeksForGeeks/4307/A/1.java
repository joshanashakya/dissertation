

// Java program to print above pattern 
  
import java.util.Scanner; 
  
class Pattern { 
    static void display(int n) 
    { 
  
        int i, j, k; 
        for (i = 1; i <= n; i++) { 
  
            for (j = 1, k = i; j <= i; j++, k--) { 
  
                if (k % 2 == 0) { 
                    // displaying the numbers 
                    System.out.print(j); 
                } 
                else { 
                    // displaying the stars 
                    System.out.print("*"); 
                } 
            } 
            System.out.print("\n"); 
        } 
    } 
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        // Get n 
        int n = 5; 
  
        // Print the pattern 
        display(n); 
    } 
} 

