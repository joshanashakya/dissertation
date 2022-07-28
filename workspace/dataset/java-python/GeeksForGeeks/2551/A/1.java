

// Java program to calculate 
// Volume of dodecahedron 
  
import java.io.*; 
  
class GFG  
{ 
        // driver function 
    public static void main (String[] args)  
       { 
           int side = 4; 
           System.out.print("Volume of dodecahedron = "); 
           System.out.println(vol_of_dodecahedron(side)); 
       } 
      
     static double vol_of_dodecahedron(int side) 
        { 
             return (((15 + (7 * (Math.sqrt(5)))) / 4)  
                       * (Math.pow(side, 3))); 
        } 
} 
  
// This code is contributed 
// by Azkia Anam. 

