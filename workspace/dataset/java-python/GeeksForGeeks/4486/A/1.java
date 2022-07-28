

// Java program to print the given pattern 
import java.io.*; 
  
class GFG { 
      
    static void pattern() 
    { 
          
        // initialization 
        int i, j, k = 0, spaces = 1, n = 7; 
      
        // This will print the upper half  
        // of the pattern 
        for (i = n; i >= 1; i--) { 
            for (j = 1; j <= i; j++) { 
                System.out.print(i); 
            } 
      
            // for printing the space characters 
            if (i != n) { 
                for (k = 1; k <= spaces; k++) { 
                    System.out.print(" "); 
                } 
                spaces = spaces + 2; 
            } 
      
            // for displaying the corresponding 
            // values 
            for (j = i; j >= 1; j--) { 
                if (j != n) 
                    System.out.print(i); 
            } 
            System.out.println(); 
        } 
          
        spaces = spaces - 4; 
      
        // This will print the lower half  
        // of the pattern 
        for (i = 2; i <= n; i++) { 
            for (j = 1; j <= i; j++) { 
            System.out.print( i); 
            } 
      
            // for displaying the space character 
            // in the lower half 
            if (i != n) { 
                for (k = 1; k <= spaces; k++) { 
                    System.out.printf(" "); 
                } 
                spaces = spaces - 2; 
            } 
      
            // for displaying the corresponding 
            // values 
            for (j = i; j >= 1; j--) { 
                if (j != n) 
                    System.out.print(i); 
            } 
            System.out.println(); 
        } 
    } 
      
    // driver code 
    public static void main (String[] args) 
    { 
          
        // function calling 
        pattern(); 
    } 
} 
  
// This code is contributed by anuj_67. 

