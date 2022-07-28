

// Java program to illustrate the 
// floating-point error 
  
public class GFG { 
  
    public static double floatError(double no) 
    { 
        double sum = 0.0; 
        for (int i = 0; i < 10; i++) { 
            sum = sum + no; 
        } 
        return sum; 
    } 
  
    public static void main(String[] args) 
    { 
  
        System.out.println(floatError(0.1)); 
    } 
} 

