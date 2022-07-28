

// Java program to find minimum number of 
// revolutions to reach a target center 
class GFG { 
      
    // Minimum revolutions to move center  
    // from (x1, y1) to (x2, y2) 
    static double minRevolutions(double r,  
         int x1, int y1, int x2, int y2)  
    { 
          
        double d = Math.sqrt((x1 - x2)  
                   * (x1 - x2) + (y1 - y2)  
                   * (y1 - y2)); 
                     
        return Math.ceil(d / (2 * r)); 
    } 
      
    // Driver Program to test above function 
    public static void main(String arg[]) { 
          
        int r = 2, x1 = 0, y1 = 0; 
        int x2 = 0, y2 = 4; 
          
        System.out.print((int)minRevolutions(r, 
                              x1, y1, x2, y2)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

