

// Java program to find the surface area 
// Of Square pyramid 
  
import java.io.*; 
  
class GFG { 
  
  
// function to find the surface area 
static int surfaceArea(int b, int s) 
{ 
  
    return 2 * b * s + (int)Math.pow(b, 2); 
} 
  
// Driver program 
  
  
    public static void main (String[] args) { 
          
    int b = 3, s = 4; 
  
    // surface area of the square pyramid 
    System.out.println( surfaceArea(b, s)); 
    } 
} 
//This code is contributed by anuj_67.. 

