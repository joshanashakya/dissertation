

// Java implementation of the above approach 
  
class GFG { 
  
    // Function calculate the area of the inner circle 
    static double innerCirclearea(double radius) 
    { 
  
        // the radius cannot be negative 
        if (radius < 0) { 
            return -1; 
        } 
  
        // area of the circle 
        double r = radius / 2; 
        double Area = (3.14 * Math.pow(r, 2)); 
  
        return Area; 
    } 
  
    // Driver Code 
    public static void main(String arr[]) 
    { 
        double radius = 4; 
        System.out.println("Area of circle c2 = "
                           + innerCirclearea(radius)); 
    } 
} 

