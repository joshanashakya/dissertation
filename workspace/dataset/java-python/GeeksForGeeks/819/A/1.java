

// Java program to find the 
// Modulus of a Complex Number 
import java.util.*; 
  
class GFG{ 
   
// Function to find modulus 
// of a complex number 
static void findModulo(String s) 
{ 
    int l = s.length(); 
    int i, modulus = 0; 
   
    // Storing the index of '+' 
    if (s.contains("+")) { 
        i = s.indexOf("+"); 
    } 
  
    // Storing the index of '-' 
    else { 
        i = s.indexOf("-"); 
    } 
   
    // Finding the real part 
    // of the complex number 
    String real = s.substring(0, i); 
   
    // Finding the imaginary part 
    // of the complex number 
    String imaginary = s.substring(i + 1, l-1); 
   
    int x = Integer.parseInt(real); 
    int y = Integer.parseInt(imaginary); 
   
    System.out.print(Math.sqrt(x * x + y * y)+ "\n"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String s = "3+4i"; 
   
    findModulo(s); 
} 
} 
  
// This code is contributed by Rajput-Ji 

