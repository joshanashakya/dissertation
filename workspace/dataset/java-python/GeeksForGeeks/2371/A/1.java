

// Java program to find percentage increase 
// in the volume of the cube 
// if a side of cube is increased 
// by a given percentage 
import java.io.*; 
  
class GFG  
{ 
  
static void newvol(double x) 
{ 
    System.out.print( "percentage increase "
    +"in the volume of the cube is "
        + (Math.pow(x, 3) / 10000 + 3 * x 
                + (3 * Math.pow(x, 2)) / 100) ); 
                System.out.print("%"); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    double x = 10; 
    newvol(x); 
} 
} 
  
// This code is contributed by anuj_67.. 

