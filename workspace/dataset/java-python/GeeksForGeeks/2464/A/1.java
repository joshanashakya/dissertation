

// Java Program to find the  
// the biggest square which 
// can be inscribed within  
// the equilateral triangle 
  
class GFG 
{ 
    // Function to find the side 
    // of the square 
    static double square(double a) 
    { 
      
        // the side cannot be negative 
        if (a < 0) 
            return -1; 
      
        // side of the square 
        double x = 0.464 * a; 
        return x; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        double a = 5; 
        System.out.println(square(a)); 
    } 
} 
  
// This code is contributed by ihritik 

