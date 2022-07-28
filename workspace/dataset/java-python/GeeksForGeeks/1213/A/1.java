

// Java Program to find the area of the circle  
// which can be inscribed within the rhombus  
  
public class GFG { 
      
    // Function to find the area  
    // of the inscribed circle  
    public static float circlearea(double a, double b) 
    { 
        // the diagonals cannot be negative 
        if (a < 0 || b < 0) 
            return -1 ; 
          
        //area of the circle  
        float A = (float) ((3.14 * Math.pow(a, 2) * Math.pow(b, 2))  
                        / (4 * (Math.pow(a, 2) + Math.pow(b, 2)))) ; 
          
        return A ; 
    } 
  
    // Driver code 
    public static void main(String[] args) { 
        float a = 8, b = 10 ; 
          
        System.out.println(circlearea(a, b)); 
  
    } 
// This code is contributed by ANKITRAI1 
} 

