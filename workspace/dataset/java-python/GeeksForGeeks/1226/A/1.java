

// Java program to find area 
// and total surface area of cube 
  
class GFG  
{ 
    // utility function 
    static double areaCube(double a) 
    { 
        return (a * a * a); 
    } 
  
    static double surfaceCube(double a) 
    { 
        return (6 * a * a); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        double a = 5; 
        System.out.println("Area = "+areaCube(a)); 
        System.out.println("Total surface area = "
                           +surfaceCube(a)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

