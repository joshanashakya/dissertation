

// Java Program to find the biggest sphere 
// that can be inscribed within a right 
// circular cylinder which in turn is inscribed 
// within a frustum 
import java.lang.Math; 
  
class gfg 
{ 
      
// Function to find the biggest sphere 
static float sph(float r, float R, float h) 
{ 
  
    // the radii and height cannot be negative 
    if (r < 0 && R < 0 && h < 0) 
        return -1; 
  
    // radius of the sphere 
    float x = r; 
  
    // volume of the sphere 
    float V = (float)(4 * 3.14f * Math.pow(r, 3)) / 3; 
  
    return V; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    float r = 5, R = 8, h = 11; 
    System.out.println(sph(r, R, h)); 
} 
} 
  
// This Code is contributed by Code_Mech. 

