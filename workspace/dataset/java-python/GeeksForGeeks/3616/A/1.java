

// Java program to check if a line touches or  
// intersects or outside a circle. 
  
import java.io.*; 
  
class GFG { 
      
    static void checkCollision(int a, int b, int c,  
                               int x, int y, int radius) 
    { 
        // Finding the distance of line from center. 
        double dist = (Math.abs(a * x + b * y + c)) /  
                        Math.sqrt(a * a + b * b); 
      
        // Checking if the distance is less than,  
        // greater than or equal to radius. 
        if (radius == dist) 
            System.out.println ( "Touch" ); 
        else if (radius > dist) 
            System.out.println( "Intersect") ; 
        else
            System.out.println( "Outside") ; 
    } 
      
    // Driven Program 
    public static void main (String[] args)  
    { 
        int radius = 5; 
        int x = 0, y = 0; 
        int a = 3, b = 4, c = 25; 
        checkCollision(a, b, c, x, y, radius); 
      
    } 
} 
  
// This article is contributed by vt_m. 

