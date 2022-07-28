

// Java program to print  
// hollow and solid square patterns 
  
class GFG  
{ 
    // Function for hollow square 
    static void hollowSquare(int rows) 
    { 
        int i, j; 
        for (i = 1; i <= rows; i++) 
        { 
            // Print stars for each solid rows 
            if (i == 1 || i == rows) 
                for (j = 1; j <= rows; j++) 
                    System.out.print("*"); 
      
            // stars for hollow rows 
            else
                for (j = 1; j <= rows; j++) 
                    if (j == 1 || j == rows) 
                        System.out.print("*"); 
                    else
                        System.out.print(" "); 
      
            // Move to the next line/row 
            System.out.print("\n"); 
        } 
    } 
      
    // Function for Solid square 
    static void solidSquare(int rows) 
    { 
        int i, j; 
        for (i = 1; i <= rows; i++) 
        { 
            // Print stars after spaces 
            for (j = 1; j <= rows; j++) 
                System.out.print("*"); 
      
            // Move to the next line/row 
            System.out.print("\n"); 
        } 
      
    } 
      
    // Utility program to print all patterns 
    static void printPattern(int rows) 
    { 
        System.out.print("\nSolid Square:\n"); 
        solidSquare(rows); 
          
        System.out.print("\nHollow Square:\n");  
        hollowSquare(rows); 
    } 
      
    // Driver program  
    public static void main (String[] args)  
    { 
        int rows = 5; 
        printPattern (rows); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

