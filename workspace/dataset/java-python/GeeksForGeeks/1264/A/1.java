

// Java program to implement 
// the above problem 
import java.io.*; 
  
class GFG  
{ 
  
  
// Function to find the number of triangles 
static void findTriangles(int n) 
{ 
    int num = n; 
  
    // print the number of triangles  
    // having two side common 
    System.out.print( num + " "); 
  
    // print the number of triangles 
    // having no side common 
    System.out.print( num * (num - 4) * (num - 5) / 6); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    // initialize the number  
    // of sides of a polygon 
    int n; 
    n = 6; 
  
    findTriangles(n); 
} 
} 
  
// This code is contributed by anuj_67.. 

