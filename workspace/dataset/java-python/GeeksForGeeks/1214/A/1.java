

// Java program to find the area  
// of circle which is inscribed 
// in equilateral triangle  
import java.io.*; 
  
class GFG  
{ 
  
static double PI = 3.14; 
  
// Function return the area of circle  
// inscribed in equilateral triangle  
static double circle_inscribed(int a) 
{ 
    return PI * (a * a) / 12; 
} 
  
// Driver code  
public static void main (String[] args)  
{ 
    int a = 4; 
  
    System.out.println(circle_inscribed(a)); 
} 
} 
  
// This code is contributed by anuj_67 

