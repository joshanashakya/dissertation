

// Java Program to calculate the 
// Surface area of a triangular prism 
  
import java.util.Scanner; 
public class Prism { 
  
    public static void Calculate_area() 
    { 
        // Initialization 
        double b = 3, h = 4, s1 = 3, s2 = 6; 
        double s3 = 6, Ht = 8, SA; 
  
        // Formula for calculating the area 
        SA = b * h + (s1 + s2 + s3) * Ht; 
  
        // Displaying the area 
        System.out.printf("The area of triangular prism is : %f", SA); 
    } 
    public static void main(String[] args) 
    { 
        Calculate_area(); 
    } 
} 
// This code is contributed by Nishant Tanwar 

