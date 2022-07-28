

// java Program to find  
// Circumference of a rectangle 
import java.io.*; 
  
class GFG  
{ 
  
    static int Circumference(int l,  
                             int w) 
    { 
        return (2 * (l + w)); 
    } 
  
    // Driver code 
    static public void main(String[] args) 
    { 
        int l = 8, w = 4; 
  
        int c = Circumference(l, w); 
  
        System.out.println("Circumference of " + 
                         "a rectangle is " + c); 
    } 
} 
  
// This code is contributed by vt_m. 

