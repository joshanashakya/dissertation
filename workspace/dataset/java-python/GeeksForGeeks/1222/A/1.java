

// Java program to find 
// surface area and volume of the 
// Pentagonal Prism 
import java.util.*; 
  
class solution 
{ 
  
// function for surface area 
static float surfaceArea(float a, float b, float h) 
{ 
  
    return 5 * a * b + 5 * b * h; 
  
} 
  
// function for VOlume 
static float volume(float b, float h) 
{ 
  
    return (5 * b * h) / 2; 
  
} 
  
// Driver function 
public static void main(String arr[]) 
{ 
    float a = 5; 
    float b = 3; 
    float h = 7; 
  
    System.out.println( "surface area= "+surfaceArea(a, b, h)+", "); 
  
    System.out.println("volume= "+volume(b, h)); 
} 
} 

