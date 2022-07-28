

// Java implementation of the approach 
class GFG { 
  
    // Function to return the hypotenuse of the 
    // right angled triangle 
    static double findHypotenuse(double side1, double side2) 
    { 
        double h = Math.sqrt((side1 * side1) + (side2 * side2)); 
        return h; 
    } 
  
    // Driver code 
    public static void main(String s[]) 
    { 
        int side1 = 3, side2 = 4; 
        System.out.printf("%.2f", findHypotenuse(side1, side2)); 
    } 
} 

