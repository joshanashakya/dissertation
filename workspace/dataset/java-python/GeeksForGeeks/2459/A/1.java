

// Java Program to find the biggest ellipse 
// which can be inscribed within a rectangle 
// which in turn is inscribed within a semicircle 
class GFG 
{ 
  
// Function to find the area 
// of the biggest ellipse 
static float ellipsearea(float r) 
{ 
  
    // the radius cannot be negative 
    if (r < 0) 
        return -1; 
  
    // area of the ellipse 
    float a = (float)((3.14f * r * r) / 4); 
  
    return a; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    float r = 5; 
    System.out.println(ellipsearea(r)); 
} 
} 
  
// This code is contributed by Code_Mech. 

