

// Java Program to find the biggest cube  
// inscribed within a sphere  
import java.util.*; 
class Solution{ 
// Function to find the side of the cube  
static float largestCube(float r)  
{  
    
    // radius cannot be negative  
    if (r < 0)  
        return -1;  
    
    // side of the cube  
    float a = (2 * r) / (float)Math.sqrt(3);  
    return a;  
}  
    
// Driver code  
public static void main(String args[]) 
{  
    float r = 5;  
    System.out.println( largestCube(r));  
    
}  
  
} 
//contributed by Arnab Kundu 

