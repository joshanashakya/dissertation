

// Java program to print binary  
// right angle triangle 
class GFG 
{ 
      
    // function to print binary right  
    // angle triangle 
    static void binaryRightAngleTriangle(int n) 
    { 
      
        // declare row and column 
        int row, col;  
          
        for (row = 0; row < n; row++)  
        { 
            for (col = 0; col <= row; col++)  
            { 
                if (((row + col) % 2) == 0)  
                    System.out.print("0"); 
                else
                    System.out.print("1"); 
                      
                System.out.print("\t"); 
            } 
              
            System.out.print("\n"); 
        }  
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        // no. of rows to be printed 
        int n = 4; 
          
        binaryRightAngleTriangle(n); 
    } 
} 
  
// This code is contributed  
// by Anant Agarwal. 

