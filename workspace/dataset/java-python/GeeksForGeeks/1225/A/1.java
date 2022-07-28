

// Java program to find volume and 
// total surface area of cuboid 
  
class GFG  
{ 
    // utility function 
    static double areaCuboid(double l, double h,  
                                           double w) 
    { 
        return (l * h * w); 
    } 
  
    static double surfaceAreaCuboid(double l, double h,  
                                                double w) 
    { 
        return (2 * l * w + 2 * w * h + 2 * l * h); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        double l = 1; 
        double h = 5; 
        double w = 7; 
        System.out.println("Area = " + areaCuboid(l, h, w)); 
        System.out.println("Total Surface Area = "
                            + surfaceAreaCuboid(l, h, w)); 
    } 
} 
// This code is contributed By Anant Agarwal. 

