

// Java Program to find the area of a triangle 
// inscribed in N-sided regular polygon 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the area of the polygon 
static double area_of_regular_polygon(double n,  
                                      double len) 
{ 
  
    // area of a regular polygon with N sides 
    // and side length len 
    double P = (len * n); 
    double A = len / (2 * Math.tan((180 / n) *  
                             3.14159 / 180)); 
    double area = (P * A) / 2; 
  
    return area; 
} 
  
// Function to find the area of a triangle 
static double area_of_triangle_inscribed(double n,  
                                         double len) 
{ 
    double area = area_of_regular_polygon(n, len); 
  
    // area of one triangle 
    // in an N-sided regular polygon 
    double triangle = area / n; 
  
    // area of inscribed triangle 
    double ins_tri = (triangle * 3); 
  
    return ins_tri; 
} 
  
// Driver code 
static public void main(String[] arg)  
{ 
    double n = 6, len = 10; 
  
    System.out.printf("%.3f",  
           area_of_triangle_inscribed(n, len)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

