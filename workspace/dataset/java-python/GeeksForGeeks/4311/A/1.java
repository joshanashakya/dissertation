

// Java code to convert radian to degree 
  
import java.io.*; 
class GFG { 
    // Function for convertion 
    static double Convert(double radian){ 
        double pi = 3.14159; 
        return(radian * (180/pi)); 
    } 
    // Driver Code 
    public static void main (String[] args) { 
        double radian = 5.0; 
        double degree = Convert(radian); 
        System.out.println("degree = "+ degree); 
    } 
} 

