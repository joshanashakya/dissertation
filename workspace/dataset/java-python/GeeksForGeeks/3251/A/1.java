

// Java program to determine the quadrant 
// of a complex number 
import java.util.*; 
  
class GFG{ 
   
// Function to determine the quadrant 
// of a complex number 
static void quadrant(String s) 
{ 
    int l = s.length(); 
    int i; 
   
    // Storing the index of '+' 
    if (s.contains("+")) { 
        i = s.indexOf('+'); 
    } 
   
    // Storing the index of '-' 
    else { 
        i = s.indexOf('-'); 
    } 
   
    // Finding the real part 
    // of the complex number 
    String real = s.substring(0, i); 
   
    // Finding the imaginary part 
    // of the complex number 
    String imaginary = s.substring(i + 1, l - 1); 
   
    int x = Integer.valueOf(real); 
    int y = Integer.valueOf(imaginary); 
   
    if (x > 0 && y > 0) 
        System.out.print("Quadrant 1"); 
   
    else if (x < 0 && y > 0) 
        System.out.print("Quadrant 2"); 
   
    else if (x < 0 && y < 0) 
        System.out.print("Quadrant 3"); 
   
    else if (x > 0 && y < 0) 
        System.out.print("Quadrant 4"); 
   
    else if (x == 0 && y > 0) 
        System.out.print("Lies on positive"
            + " Imaginary axis"); 
   
    else if (x == 0 && y < 0) 
        System.out.print("Lies on negative"
            + " Imaginary axis"); 
   
    else if (y == 0 && x < 0) 
        System.out.print("Lies on negative"
            + " X-axis"); 
   
    else if (y == 0 && x > 0) 
        System.out.print("Lies on positive"
            + " X-axis"); 
   
    else
        System.out.print("Lies on the Origin"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String s = "5+3i"; 
    quadrant(s); 
} 
} 
  
// This code is contributed by Rajput-Ji 

