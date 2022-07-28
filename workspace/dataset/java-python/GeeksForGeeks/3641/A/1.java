

// Java program to find the 
// perimeter of a regular polygon 
  
class GFG { 
  
    // Function to calculate the perimeter 
    static double Perimeter(double s, int n) 
    { 
        double perimeter = 1; 
  
        // Calculate Perimeter 
        perimeter = n * s; 
  
        return perimeter; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
  
        // Get the number of sides 
        int n = 5; 
  
        // Get the length of side 
        double s = 2.5, peri; 
  
        // find perimeter 
        peri = Perimeter(s, n); 
  
        System.out.println("Perimeter of Regular Polygon"
                           + " with " + n + " sides of length "
                           + s + " = " + peri); 
    } 
} 

