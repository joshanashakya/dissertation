

// Java program to calculate Volume and Surface area 
// of frustum of cone 
  
public class demo { 
  
    static float pi = 3.14159f; 
  
    // Function to calculate Volume of frustum of cone 
    public static float volume(float r, float R, float h) 
    { 
        return (float)1 / 3 * pi * h * (r * r + R * R + 
                                                r * R); 
    } 
  
    // Function to calculate Curved Surface area of 
    // frustum of cone 
    public static float curved_surface_area(float r,  
                                   float R, float l) 
    { 
        return pi * l * (R + r); 
    } 
  
    // Function to calculate Total Surface area of  
    // frustum of cone 
    public static float total_surface_area(float r,  
                         float R, float l, float h) 
    { 
        return pi * l * (R + r) + pi * (r * r + R * R); 
    } 
  
    // Driver function 
    public static void main(String args[]) 
    { 
        float small_radius = 3; 
        float big_radius = 8; 
        float slant_height = 13; 
        float height = 12; 
  
    // Printing value of volume and surface area 
        System.out.print("Volume Of Frustum of Cone : "); 
        System.out.println(volume(small_radius,  
                            big_radius, height)); 
  
        System.out.print("Curved Surface Area Of" +  
                            " Frustum of Cone : "); 
        System.out.println(curved_surface_area(small_radius, 
                                  big_radius, slant_height)); 
        System.out.print("Total Surface Area Of" +  
                " Frustum of Cone : "); 
  
        System.out.println(total_surface_area(small_radius,  
                        big_radius, slant_height, height)); 
    } 
} 

