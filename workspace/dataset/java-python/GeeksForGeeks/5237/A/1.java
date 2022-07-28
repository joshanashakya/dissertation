

// Java program to calculate area and perimeter 
// of a rhombus using diagonals 
import java.io.*; 
  
class GFG { 
    
// calculate area and perimeter of a rhombus 
static int rhombusAreaPeri(int d1, int d2) 
{ 
     int area, perimeter; 
  
    area = (d1 * d2) / 2; 
    perimeter = (int)(2 * Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2))); 
  
    System.out.println( "The area of rhombus with diagonals "
        + d1 + " and " + d2 + " is " + area + "."); 
  
    System.out.println("The perimeter of rhombus with diagonals "
        +d1 + " and " + d2 + " is " + perimeter + "."); 
        return 0; 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
        int d1 = 2, d2 = 4; 
    rhombusAreaPeri(d1, d2); 
    } 
} 
// This code is contributed by anuj_67.. 

