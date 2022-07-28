

// Java  Program to find the biggest triangle  
// which can be inscribed within the semicircle  
import java.io.*; 
  
class GFG { 
     
  
// Function to find the area  
// of the triangle  
static float trianglearea(float r)  
{  
  
    // the radius cannot be negative  
    if (r < 0)  
        return -1;  
  
    // area of the triangle  
    return r * r;  
}  
  
// Driver code  
  
  
    public static void main (String[] args) { 
        float r = 5;  
    System.out.println( trianglearea(r));  
    } 
} 
// This code is contributed   
// by chandan_jnu. 

