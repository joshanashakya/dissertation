

// Java program to illustrate.. 
// To check for parallel 
// To X and Y Axis 
  
import java.io.*; 
import java.util.*; 
  
class GFG { 
  
    // To check for parallel line 
    static void parallel(int a[][]) 
    { 
        boolean x = true, y = true; 
  
        // checking for parallel to X and Y 
        // axis condition 
        for (int i = 0; i < a.length - 1; i++) { 
            for (int j = 0; j < 2; j++) { 
                if (a[i][0] != a[i + 1][0]) 
                    x = false; 
                if (a[i][1] != a[i + 1][1]) 
                    y = false; 
            } 
        } 
  
        // To display the output 
        if (x) 
            System.out.println("Parallel to X Axis"); 
        else if (y) 
            System.out.println("Parallel to Y Axis"); 
        else
            System.out.println("Not parallel to X" +  
                                    " and Y axis"); 
    } 
  
    public static void main(String[] args) 
    { 
        int a[][] = { { 1, 2 }, 
                      { 1, 4 }, 
                      { 1, 6 }, 
                      { 1, 0 } }; 
        parallel(a); 
    } 
} 

