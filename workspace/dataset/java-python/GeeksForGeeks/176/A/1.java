

// Java Program to find  
// the rea of the circle  
// inscribed in a trapezoid  
// having non- parllel sides m, n  
class GFG  
{  
      
    // Function to find area of circle  
    // inscribed in a trapezoid  
    // having non- parllel sides m, n  
    static double area_of_circle(int m, int n)  
    {  
        // radius of circle by the  
        // formula i.e. root( m * n) / 2  
        // area of circle = (3.141 ) * ( R ** 2 )  
      
        int square_of_radius = ( m * n ) / 4;  
        double area = ( 3.141 * square_of_radius );  
        return area;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 10;  
        int m = 30;  
        System.out.println(area_of_circle(m, n));  
    }  
}  
  
// This code is contributed by Yash_R 

