

// Java Program to find the the biggest cube  
// which can be inscribed within a right circular cone 
  
import java.io.*;  
  
class GFG {  
  
  
// Function to find the side of the cube 
  
static float cube(float h, float r)  
{  
  
    // hegiht and radius cannot be negative  
    if (h < 0 && r < 0)  
        return -1;  
  
 // side of the cube  
    float a = (h * r * (float)Math.sqrt(2)) / (h + (float)Math.sqrt(2) * r);  
    
    return a;  
}  
  
// Driver code  
    
    public static void main (String[] args) {  
          float h = 5, r = 6; 
    System.out.println( cube(h, r));  
    }  
}  
  
// this article is contributed by Ishwar Gupta 

