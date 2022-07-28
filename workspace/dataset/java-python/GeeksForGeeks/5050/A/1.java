

// Java implementation of the approach  
import java.math.*; 
  
class GFG 
{ 
    // Function to calculate Indian Standard Time  
    public static void cal_IST(int h, double r)  
    {  
        double IST = (h * r * 1.0) / 360;  
  
        // Separate integer part  
        int int_IST = (int)IST;  
  
        // Separate float part and return ceil value  
        int float_IST = (int)Math.ceil((int)((IST - int_IST) * 60));  
  
        System.out.println(int_IST + ":" + float_IST);  
    }  
  
    // Driver code  
    public static void main(String[] args)  
    {  
      
        // Number of hours (1 - 24)  
        int h = 20;  
      
        // Rotations in degrees  
        double r = 150;  
      
        cal_IST(h, r);  
    } 
}  
  
// This code is contributed by Naman_Garg 

