

// Java program to find the  
// Surface area and volume  
// of octagonal prism  
public class GFG { 
  
    // Function to find the  
    // Volume of octagonal prism  
    static void find_volume(double area,double h){  
          
        // Formula to calculate  
        // volume = (area * h)  
        double Volume = (area * h) ; 
          
        // Display volume  
        System.out.println("Volume: " + Volume); 
    } 
      
    // Function to find the  
    // surface area of octagonal prism  
    static void find_Surface_area(double area, double a, double h){ 
          
        // Formula to calculate Surface area  
        double Surface_area = (2 * area)+(8 * a * h) ; 
          
        System.out.println("Surface area: " + Surface_area) ; 
    } 
  
    // Driver Code  
    public static void main (String[] args)  
    { 
        double h = 1 ; 
        double a = 6 ; 
        double d = 2 ; 
        double area = 2 * a * d ; 
          
          
        find_Surface_area(area, a, h) ; 
          
        find_volume(area, h) ; 
      
    } 
} 
  
// This code is contributed by AnkitRai01 

