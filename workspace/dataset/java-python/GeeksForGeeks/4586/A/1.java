

// Java Program to find the diagonal  
// of a regular hexagon 
  
public class GFG 
{ 
  
    // Function to find the diagonal  
    // of a regular hexagon  
    static double hexDiagonal(float a)  
    {  
      
        // Side cannot be negative  
        if (a < 0)  
            return -1;  
      
        // Length of the diagonal  
        double d = (double)1.73 * a;  
        return d;  
    }  
      
    // Driver code  
    public static void main(String []args) 
    {  
        float a = 9;  
        System.out.println(hexDiagonal(a)) ;  
    }  
    // This code is contributed by Ryuga 
} 

