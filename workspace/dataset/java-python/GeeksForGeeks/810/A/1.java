

// Java Program to find the area  
// of Reuleaux triangle  
  
public class GFG 
{ 
    // Function to find the Area  
    // of the Reuleaux triangle  
    static double ReuleauxArea(float a)  
    {  
      
        // Side cannot be negative  
        if (a < 0)  
            return -1;  
      
        // Area of the Reuleaux triangle  
        double A = (double)0.70477 * Math.pow(a, 2);  
        return A;  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        float a = 6;  
        System.out.println(ReuleauxArea(a)) ;  
    }  
    // This code is contributed by Ryuga 
} 

