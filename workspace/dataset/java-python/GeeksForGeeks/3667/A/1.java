

// JAVA Code for Program to check if 
// water tank overflows 
import java.util.*; 
  
class GFG { 
  
    // function to find if tak will 
    // overflow or not 
    static void overflow(int H, int r, int h, 
                         int N, int R) 
    { 
        // cylinder capacity 
        double tank_cap = 3.14 * r * r * H; 
  
        // volume of water in tank 
        double water_vol = 3.14 * r * r * h; 
  
        // volume of n balls 
        double balls_vol = N * (4 / 3) * 3.14 * R * R * R; 
  
        // total volume of water 
        // and n dipped balls 
        double vol = water_vol + balls_vol; 
  
        /* condition to check if tank is in  
        overflow state or not */
        if (vol > tank_cap) { 
            System.out.println("Overflow"); 
        } 
        else { 
            System.out.println("Not in overflow state"); 
        } 
    } 
  
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        // giving dimensions 
        int H = 10, r = 5, h = 5, 
            N = 2, R = 2; 
  
        // calling function 
        overflow(H, r, h, N, R); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

