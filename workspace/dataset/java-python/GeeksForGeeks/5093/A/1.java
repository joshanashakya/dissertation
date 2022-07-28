

// Java program to find side of the squares 
// inclined and touch each other externally 
// at vertices and are lined in a row 
// and distance between the 
// centers of first and last squares is given 
import java.io.*; 
  
class GFG  
{ 
  
  
static void radius(double n, double d) 
{ 
    System.out.print( "The side of each square is "+ 
        d / ((n - 1) * Math.sqrt(2))); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    double d = 42, n = 4; 
    radius(n, d); 
} 
} 
  
// This code is contributed by anuj_67.. 

