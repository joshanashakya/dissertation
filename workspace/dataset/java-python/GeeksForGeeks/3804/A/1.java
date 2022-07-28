

// Java implementation to find 
// the total energy required  
// to rearrange the numbers 
  
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
  
    private final static int SIZE  = 100; 
   
    // function to find the total energy 
    // required to rearrange the numbers 
    public static int calculateEnergy(int mat[][], 
    int n) 
    { 
        int i_des, j_des, q; 
        int tot_energy = 0; 
   
        // nested loops to access the elements 
        // of the given matrix 
        for (int i = 0; i < n; i++) { 
  
            for (int j = 0; j < n; j++) { 
  
                // store quotient 
                q = mat[i][j] / n; 
   
                // final destination location 
                // (i_des, j_des) of 
                // the element mat[i][j] is 
                // being calculated 
                i_des = q; 
                j_des = mat[i][j] - (n * q); 
   
                // energy required for the 
                // movement of the 
                // element mat[i][j] is 
                // calculated and then 
                // accumulated in the 'tot_energy' 
                tot_energy += Math.abs(i_des - i) + 
                Math.abs(j_des - j); 
            } 
        } 
   
        // required total energy 
        return tot_energy; 
    } 
      
    // Driver function 
    public static void main(String argc[]){ 
  
        int[][] mat = new int[][] {{ 4, 7, 0, 3 }, 
                                   { 8, 5, 6, 1 }, 
                                   { 9, 11, 10, 2 }, 
                                   { 15, 13, 14, 12 }}; 
  
        int n = 4; 
   
    System.out.println("Total energy required = "
         + calculateEnergy(mat, n) + " units"); 
    } 
      
} 
// This code is contributed by Sagar Shukla  

