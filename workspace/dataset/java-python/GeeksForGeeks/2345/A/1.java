

// Java program to find if x is a 
// perfect square. 
class GFG { 
      
    static boolean isPerfectSquare(double x)  
    { 
          
        // Find floating point value of 
        // square root of x. 
        double sr = Math.sqrt(x); 
      
        // If square root is an integer 
        return ((sr - Math.floor(sr)) == 0); 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        double x = 2500; 
          
        if (isPerfectSquare(x)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

