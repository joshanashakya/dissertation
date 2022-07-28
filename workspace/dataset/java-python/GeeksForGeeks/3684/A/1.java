

// Java program to find the Altitude 
// Area of an isosceles triangle 
  
import java.io.*; 
  
class GFG { 
      
  
  
// function to find the atitude 
static float altitude(float a, float b) 
{ 
    // return altitude 
    return (float)(Math.sqrt(Math.pow(a, 2) - (Math.pow(b, 2) / 4))); 
} 
  
// function to find the area 
 static float area(float b, float h) 
{ 
  
    // return area 
    return (1 * b * h) / 2; 
} 
  
// driver program 
  
  
    public static void main (String[] args) { 
            float a = 2, b = 3; 
    float h = altitude(a, b); 
    System.out.print( "Altitude= " + h + ", "); 
  
    System.out.print( "Area= " + area(b, h)); 
    } 
} 
//This code is contributed by  inder_verma. 

