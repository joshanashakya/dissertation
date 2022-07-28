

// Java code to swap the element of first 
// and last row and display the result 
import java.io.*; 
  
public class Interchange { 
      
    static void interchangeFirstLast(int m[][]) 
    { 
        int rows = m.length; 
          
        // swapping of element between first 
        // and last rows 
        for (int i = 0; i < m[0].length; i++) { 
            int t = m[0][i]; 
            m[0][i] = m[rows-1][i]; 
            m[rows-1][i] = t; 
        } 
    } 
      
    // Driver code 
    public static void main(String args[]) throws IOException 
    { 
        // input in the array 
        int m[][] = { { 8, 9, 7, 6 }, 
                    { 4, 7, 6, 5 }, 
                    { 3, 2, 1, 8 }, 
                    { 9, 9, 7, 7 } };  
                      
        interchangeFirstLast(m);  
          
        // printing the interchanged matrix 
        for (int i = 0; i < m.length; i++) { 
            for (int j = 0; j < m[0].length; j++)  
                System.out.print(m[i][j] + " "); 
            System.out.println(); 
        } 
    } 
} 

